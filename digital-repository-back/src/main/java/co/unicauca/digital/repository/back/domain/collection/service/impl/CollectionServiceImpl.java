package co.unicauca.digital.repository.back.domain.collection.service.impl;

import co.unicauca.digital.repository.back.domain.collection.dto.request.CollectionDtoRequest;
import co.unicauca.digital.repository.back.domain.collection.dto.response.CollectionDtoResponse;
import co.unicauca.digital.repository.back.domain.collection.mapper.ICollectionMapper;
import co.unicauca.digital.repository.back.domain.collection.model.Collection;
import co.unicauca.digital.repository.back.domain.collection.repository.ICollectionRepository;
import co.unicauca.digital.repository.back.domain.collection.service.ICollectionService;
import co.unicauca.digital.repository.back.global.exception.BusinessRuleException;
import co.unicauca.digital.repository.back.global.response.PageableResponse;
import co.unicauca.digital.repository.back.global.response.Response;
import co.unicauca.digital.repository.back.global.response.handler.ResponseHandler;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CollectionServiceImpl implements ICollectionService {
    private final ICollectionRepository collectionRepository;
    private final ICollectionMapper collectionMapper;

    public CollectionServiceImpl(ICollectionRepository collectionRepository, ICollectionMapper collectionMapper) {
        this.collectionRepository = collectionRepository;
        this.collectionMapper = collectionMapper;
    }

    @Override
    public Response<CollectionDtoResponse> createCollection(CollectionDtoRequest collectionDtoRequest) {
        Collection collection = this.collectionMapper.toEntity(collectionDtoRequest);
        collection.setCreateTime(LocalDateTime.now());
        Collection entitySave = this.collectionRepository.save(collection);
        CollectionDtoResponse collectionDtoResponse = this.collectionMapper.toDto(entitySave);

        return new ResponseHandler<>(200,"Colección guardado con éxito", "",collectionDtoResponse).getResponse();
    }

    @Override
    public Response<CollectionDtoResponse> getByIdCollection(Integer id) {
        Optional<Collection> collectionFound = collectionRepository.findById(id);
        if(collectionFound.isEmpty()){
            throw new BusinessRuleException("collection.request.not.found");
        }

        CollectionDtoResponse collectionDtoResponse = this.collectionMapper.toDto(collectionFound.get());
        return new ResponseHandler<>(200,"Colección encontrada", "",collectionDtoResponse).getResponse();
    }

    @Override
    public Response<PageableResponse<Object>> getAll(int pageNumber, int pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber,pageSize);
        Page<Collection> page = this.collectionRepository.findAll(pageRequest);
        List<Object> documentList = page.get().map(
                this.collectionMapper::toDto
        ).collect(Collectors.toList());
        PageableResponse<Object> response = PageableResponse.builder()
                .data(documentList)
                .pageNo(page.getNumber())
                .pageSize(page.getSize())
                .totalElements(page.getTotalElements())
                .last(page.isLast())
                .build();
        return new ResponseHandler<>(200,"Documentos encontrados", "",response).getResponse();
    }

    @Override
    public Response<CollectionDtoResponse> update(CollectionDtoRequest collectionDtoRequest) {
        Optional<Collection> collection = this.collectionRepository.findById(collectionDtoRequest.getId());
        if(collection.isEmpty()) {
            throw new BusinessRuleException("collection.request.not.found");
        }
        Collection collectionUpdate = Collection.builder()
                .id(collection.get().getId())
                .isLocalRequerid(collection.get().isLocalRequerid())
                .createUser(collection.get().getCreateUser())
                .createTime(collection.get().getCreateTime())
//                .updateUser(collectionDtoRequest.getUpdateUser())
                .updateTime(LocalDateTime.now())
                .build();
        Collection collectionSave = this.collectionRepository.save(collectionUpdate);
        CollectionDtoResponse collectionDtoResponse = this.collectionMapper.toDto(collectionSave);
        return new ResponseHandler<>(200, "Colección actualizada exitosamente", "", collectionDtoResponse).getResponse();
    }

    @Override
    public Response<Boolean> delete(Integer id) {
        Optional<Collection> collection = this.collectionRepository.findById(id);
        if(collection.isEmpty())
            throw new BusinessRuleException("collection.request.not.found");
        this.collectionRepository.deleteById(id);
        return new ResponseHandler<>(200,"Colección Eliminada", "", collectionExist(id)).getResponse();
    }


    private boolean collectionExist(final Integer id){
        return !this.collectionRepository.existsById(id);
    }


}

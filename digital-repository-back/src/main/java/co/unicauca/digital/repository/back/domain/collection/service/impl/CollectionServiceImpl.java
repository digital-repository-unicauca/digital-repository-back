package co.unicauca.digital.repository.back.domain.collection.service.impl;

import co.unicauca.digital.repository.back.domain.collection.dto.request.CollectionDtoRequest;
import co.unicauca.digital.repository.back.domain.collection.dto.response.CollectionDtoResponse;
import co.unicauca.digital.repository.back.domain.collection.mapper.ICollectionMapper;
import co.unicauca.digital.repository.back.domain.collection.model.Collection;
import co.unicauca.digital.repository.back.domain.collection.repository.ICollectionRepository;
import co.unicauca.digital.repository.back.domain.collection.service.ICollectionService;
import co.unicauca.digital.repository.back.global.response.Response;
import co.unicauca.digital.repository.back.global.response.handler.ResponseHandler;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return null;
    }

    @Override
    public Response<CollectionDtoResponse> getByIdCollection(Integer id) {
        return null;
    }

    @Override
    public Response<Page<CollectionDtoResponse>> getAll(int pageNumber, int pagezise) {
        Pageable pageable = PageRequest.of(pageNumber,pagezise, Sort.by("id"));
        Page<Collection> collections = this.collectionRepository.findAll(pageable);
        List<CollectionDtoResponse> collectionDtoResponses = this.collectionMapper.toCollectionList(collections.getContent());
        Page<CollectionDtoResponse> page = new PageImpl<>(collectionDtoResponses,pageable,collections.getTotalElements());
        return new ResponseHandler<>(200,"Pagina encontrada exitosamente", "",page).getResponse();
    }

    @Override
    public Response<CollectionDtoResponse> update(CollectionDtoRequest collectionDtoRequest) {
        return null;
    }

    @Override
    public Response<CollectionDtoResponse> delete(Integer id) {
        return null;
    }
}

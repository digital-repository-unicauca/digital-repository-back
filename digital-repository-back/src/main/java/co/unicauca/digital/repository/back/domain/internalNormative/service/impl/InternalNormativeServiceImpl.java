package co.unicauca.digital.repository.back.domain.internalNormative.service.impl;

<<<<<<< HEAD
import co.unicauca.digital.repository.back.domain.internalNormative.dto.request.*;
import co.unicauca.digital.repository.back.domain.internalNormative.dto.response.*;
=======
import co.unicauca.digital.repository.back.domain.internalNormative.dto.request.InternalNormativeDtoRequest;
import co.unicauca.digital.repository.back.domain.internalNormative.dto.response.InternalNormativeDtoResponse;
>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2
import co.unicauca.digital.repository.back.domain.internalNormative.mapper.IInternalNormativeMapper;
import co.unicauca.digital.repository.back.domain.internalNormative.model.InternalNormative;
import co.unicauca.digital.repository.back.domain.internalNormative.repository.IInternalNormativeRepository;
import co.unicauca.digital.repository.back.domain.internalNormative.service.IInternalNormativeService;
<<<<<<< HEAD
import co.unicauca.digital.repository.back.global.exception.BusinessRuleException;
import co.unicauca.digital.repository.back.global.response.PageableResponse;
import co.unicauca.digital.repository.back.global.response.Response;
import co.unicauca.digital.repository.back.global.response.handler.ResponseHandler;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
=======
import co.unicauca.digital.repository.back.global.response.Response;
import co.unicauca.digital.repository.back.global.response.handler.ResponseHandler;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2

/** Class in charge of implementing the IContractService interface {@link IInternalNormativeService} */
@Service
@Primary
public class InternalNormativeServiceImpl implements IInternalNormativeService{
    
    /** Object to perform CRUD operations on the Product entity */
    private final IInternalNormativeRepository internalNormativeRepository;

    /** Mapping object for mapping the products */
    private final IInternalNormativeMapper internalNormativeMapper;

    /**
     * constructor method
     */
    public InternalNormativeServiceImpl(IInternalNormativeRepository internalNormativeRepository, IInternalNormativeMapper internalNormativeMapper) {
        this.internalNormativeRepository = internalNormativeRepository;
        this.internalNormativeMapper = internalNormativeMapper;
    }

    /**
     * 
<<<<<<< HEAD
     * @see IInternalNormativeService#createInternalNormative(InternalNormativeDtoCreateRequest)
     */
    @Override
    public Response<InternalNormativeDtoCreateResponse> createInternalNormative(InternalNormativeDtoCreateRequest internalNormativeDtoCreateRequest) {

        InternalNormative internalNormativeModel = internalNormativeMapper.toEntityCreate(internalNormativeDtoCreateRequest);
        internalNormativeModel.setCreateTime(LocalDateTime.now());
        // TODO Set create user
        InternalNormative internalNormativeSaved = internalNormativeRepository.save(internalNormativeModel);
        InternalNormativeDtoCreateResponse internalNormativeDtoCreateResponse = internalNormativeMapper.toDtoCreate(internalNormativeSaved);

        return new ResponseHandler<>(200, "Normativa interna creada exitosamente", "Normativa interna creada exitosamente", internalNormativeDtoCreateResponse).getResponse();
=======
     * @see IInternalNormativeService#createInternalNormative(InternalNormativeDtoRequest) 
     */
    @Override
    public Response<InternalNormativeDtoResponse> createInternalNormative(InternalNormativeDtoRequest internalNormativeDtoRequest) {

        InternalNormative internalNormativeModel = internalNormativeMapper.toEntity(internalNormativeDtoRequest);
        InternalNormative internalNormativeSaved = internalNormativeRepository.save(internalNormativeModel);
        InternalNormativeDtoResponse internalNormativeDtoResponse = internalNormativeMapper.toDto(internalNormativeSaved);

        return new ResponseHandler<>(200, "Normativa interna creada exitosamente", "Normativa interna creada exitosamente", internalNormativeDtoResponse).getResponse();

>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2
    }

    /**
     *
     * @see IInternalNormativeService#getById(Integer)
     */
    @Override
<<<<<<< HEAD
    public Response<InternalNormativeDtoFindResponse> getById(Integer id) {

        Optional<InternalNormative> internalNormative = internalNormativeRepository.findById(id);
        if (internalNormative.isEmpty()) throw new BusinessRuleException("internalNormative.request.not.found");

        InternalNormativeDtoFindResponse internalNormativeDtoFindResponse = internalNormativeMapper.toDtoFind(internalNormative.get());
        return new ResponseHandler<>(200, "Normativa interna encontrada", "Normativa interna encontrada", internalNormativeDtoFindResponse).getResponse();
    }

    /**
     * @see IInternalNormativeService#getAll(int,int)
     */
    @Override
    public Response<PageableResponse<Object>> getAll(int pageNo, int pageSize) {

        PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
        Page<InternalNormative> responsePage = internalNormativeRepository.findAll(pageRequest);

        List<Object> internalNormativeDtoFindResponses = responsePage.get().map(
                internalNormativeMapper::toDtoFind
        ).collect(Collectors.toList());

        PageableResponse<Object> response = PageableResponse.builder()
                .data(internalNormativeDtoFindResponses)
                .pageNo(responsePage.getNumber())
                .pageSize(responsePage.getSize())
                .totalElements(responsePage.getTotalElements())
                .totalPages(responsePage.getTotalPages())
                .last(responsePage.isLast())
                .build();

        return new ResponseHandler<>(200, "Se obtuvieron todos los registros de normativa interna", "Se obtuvieron todos los registros de normativa interna", response).getResponse();
=======
    public Response<InternalNormativeDtoResponse> getById(Integer id) {

        InternalNormative internalNormative = internalNormativeRepository.findById(id).orElse(null);
        InternalNormativeDtoResponse internalNormativeDtoResponse = internalNormativeMapper.toDto(internalNormative);
        if (internalNormative != null) {
            return new ResponseHandler<>(200, "Normativa interna encontrada", "Normativa interna encontrada", internalNormativeDtoResponse).getResponse();
        } else {
            return new ResponseHandler<>(404, "Normativa interna no encontrada", "Normativa interna no encontrada", internalNormativeDtoResponse).getResponse();
        }
    }

    /**
     * @see IInternalNormativeService#getAll()
     */
    @Override
    public Response<ArrayList<InternalNormativeDtoResponse>> getAll() {
        ArrayList<InternalNormative> listInternalNormative = (ArrayList<InternalNormative>) internalNormativeRepository.findAll();
        ArrayList<InternalNormativeDtoResponse> listInternalNormativeResponse = new ArrayList<InternalNormativeDtoResponse>();

        for (InternalNormative internalNormative: listInternalNormative) {
            listInternalNormativeResponse.add(internalNormativeMapper.toDto(internalNormative));
        }

        return new ResponseHandler<>(200, "Se retorno todos los registros de normativa interna", "Se retorno todos los registros de normativa interna", listInternalNormativeResponse).getResponse();
>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2
    }

    /**
     *
<<<<<<< HEAD
     * @see IInternalNormativeService#updateInternalNormative(InternalNormativeDtoUpdateRequest)
     */
    @Override
    public Response<InternalNormativeDtoCreateResponse> updateInternalNormative(InternalNormativeDtoUpdateRequest internalNormativeDtoUpdateRequest) {

        Optional<InternalNormative> internalNormative = internalNormativeRepository.findById(internalNormativeDtoUpdateRequest.getId());
        if (internalNormative.isEmpty()) throw new BusinessRuleException("internalNormative.request.not.found");

        InternalNormative updateInternalNormative = InternalNormative.builder()
                .id(internalNormativeDtoUpdateRequest.getId())
                .name(internalNormativeDtoUpdateRequest.getName())
                .isInForce(internalNormativeDtoUpdateRequest.getIsInForce())
                .initialTime(internalNormativeDtoUpdateRequest.getInitialTime())
                .finalTime(internalNormativeDtoUpdateRequest.getFinalTime())
                .createUser(internalNormative.get().getCreateUser())
                .createTime(internalNormative.get().getCreateTime())
                .updateTime(LocalDateTime.now())
                .build();
        // TODO .updateUser(XXX)

        InternalNormative internalNormativeSaved = internalNormativeRepository.save(updateInternalNormative);
        InternalNormativeDtoCreateResponse internalNormativeDtoCreateResponse = internalNormativeMapper.toDtoCreate(internalNormativeSaved);

        return new ResponseHandler<>(200, "Normativa interna actualizada exitosamente", "Normativa interna actualizada exitosamente", internalNormativeDtoCreateResponse).getResponse();
=======
     * @see IInternalNormativeService#updateInternalNormative(InternalNormativeDtoRequest) 
     */
    @Override
    public Response<InternalNormativeDtoResponse> updateInternalNormative(InternalNormativeDtoRequest internalNormativeDtoRequest) {

        InternalNormative internalNormativeModel = internalNormativeMapper.toEntity(internalNormativeDtoRequest);
        InternalNormative internalNormativeUpdated = internalNormativeRepository.save(internalNormativeModel);
        InternalNormativeDtoResponse internalNormativeDtoResponse = internalNormativeMapper.toDto(internalNormativeUpdated);

        return new ResponseHandler<>(200, "Normativa interna actualizada exitosamente", "Normativa interna actualizada exitosamente", internalNormativeDtoResponse).getResponse();
>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2

    }

    /**
     *
     * @see IInternalNormativeService#deleteInternalNormative(Integer)
     */
    @Override
    public Response<Boolean> deleteInternalNormative(Integer id) {

<<<<<<< HEAD
        Optional<InternalNormative> internalNormative = internalNormativeRepository.findById(id);
        if (internalNormative.isEmpty()) throw new BusinessRuleException("internalNormative.request.not.found");

        internalNormativeRepository.delete(internalNormative.get());
        return new ResponseHandler<>(200, "Normativa interna eliminada", "Normativa interna eliminada", true).getResponse();
=======
        InternalNormative internalNormative = internalNormativeRepository.findById(id).orElse(null);
        if (internalNormative != null){
            internalNormativeRepository.delete(internalNormative);
            return new ResponseHandler<>(200, "Normativa interna eliminada", "Normativa interna eliminada", true).getResponse();
        } else {
            return new ResponseHandler<>(404, "Normativa interna no encontrada", "Normativa interna no encontrada", false).getResponse();
        }

>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2
    }
}

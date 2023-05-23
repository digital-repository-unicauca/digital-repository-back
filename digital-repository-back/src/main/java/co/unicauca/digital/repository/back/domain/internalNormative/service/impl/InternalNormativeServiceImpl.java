package co.unicauca.digital.repository.back.domain.internalNormative.service.impl;

import co.unicauca.digital.repository.back.domain.internalNormative.dto.request.InternalNormativeDtoRequest;
import co.unicauca.digital.repository.back.domain.internalNormative.dto.response.InternalNormativeDtoResponse;
import co.unicauca.digital.repository.back.domain.internalNormative.mapper.IInternalNormativeMapper;
import co.unicauca.digital.repository.back.domain.internalNormative.model.InternalNormative;
import co.unicauca.digital.repository.back.domain.internalNormative.repository.IInternalNormativeRepository;
import co.unicauca.digital.repository.back.domain.internalNormative.service.IInternalNormativeService;
import co.unicauca.digital.repository.back.global.response.Response;
import co.unicauca.digital.repository.back.global.response.handler.ResponseHandler;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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
     * @see IInternalNormativeService#createInternalNormative(InternalNormativeDtoRequest) 
     */
    @Override
    public Response<InternalNormativeDtoResponse> createInternalNormative(InternalNormativeDtoRequest internalNormativeDtoRequest) {

        InternalNormative internalNormativeModel = internalNormativeMapper.toEntity(internalNormativeDtoRequest);
        InternalNormative internalNormativeSaved = internalNormativeRepository.save(internalNormativeModel);
        InternalNormativeDtoResponse internalNormativeDtoResponse = internalNormativeMapper.toDto(internalNormativeSaved);

        return new ResponseHandler<>(200, "Normativa interna creada exitosamente", "Normativa interna creada exitosamente", internalNormativeDtoResponse).getResponse();

    }

    /**
     *
     * @see IInternalNormativeService#getById(Integer)
     */
    @Override
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
    }

    /**
     *
     * @see IInternalNormativeService#updateInternalNormative(InternalNormativeDtoRequest) 
     */
    @Override
    public Response<InternalNormativeDtoResponse> updateInternalNormative(InternalNormativeDtoRequest internalNormativeDtoRequest) {

        InternalNormative internalNormativeModel = internalNormativeMapper.toEntity(internalNormativeDtoRequest);
        InternalNormative internalNormativeUpdated = internalNormativeRepository.save(internalNormativeModel);
        InternalNormativeDtoResponse internalNormativeDtoResponse = internalNormativeMapper.toDto(internalNormativeUpdated);

        return new ResponseHandler<>(200, "Normativa interna actualizada exitosamente", "Normativa interna actualizada exitosamente", internalNormativeDtoResponse).getResponse();

    }

    /**
     *
     * @see IInternalNormativeService#deleteInternalNormative(Integer)
     */
    @Override
    public Response<Boolean> deleteInternalNormative(Integer id) {

        InternalNormative internalNormative = internalNormativeRepository.findById(id).orElse(null);
        if (internalNormative != null){
            internalNormativeRepository.delete(internalNormative);
            return new ResponseHandler<>(200, "Normativa interna eliminada", "Normativa interna eliminada", true).getResponse();
        } else {
            return new ResponseHandler<>(404, "Normativa interna no encontrada", "Normativa interna no encontrada", false).getResponse();
        }

    }
}

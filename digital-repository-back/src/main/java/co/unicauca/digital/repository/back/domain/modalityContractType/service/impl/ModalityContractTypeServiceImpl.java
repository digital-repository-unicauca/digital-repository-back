package co.unicauca.digital.repository.back.domain.modalityContractType.service.impl;

import co.unicauca.digital.repository.back.domain.modalityContractType.dto.request.ModalityContractTypeDtoRequest;
import co.unicauca.digital.repository.back.domain.modalityContractType.dto.response.ModalityContractTypeDtoResponse;
import co.unicauca.digital.repository.back.domain.modalityContractType.mapper.IModalityContractTypeMapper;
import co.unicauca.digital.repository.back.domain.modalityContractType.model.ModalityContractType;
import co.unicauca.digital.repository.back.domain.modalityContractType.repository.IModalityContractTypeRepository;
import co.unicauca.digital.repository.back.domain.modalityContractType.service.IModalityContractTypeService;
import co.unicauca.digital.repository.back.global.response.Response;
import co.unicauca.digital.repository.back.global.response.handler.ResponseHandler;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Primary
public class ModalityContractTypeServiceImpl implements IModalityContractTypeService {

    /** Object to perform CRUD operations on the Product entity */
    private final IModalityContractTypeRepository modalityContractTypeRepository;

    /** Mapping object for mapping the products */
    private final IModalityContractTypeMapper modalityContractTypeMapper;

    /**
     * constructor method
     */
    public ModalityContractTypeServiceImpl(IModalityContractTypeRepository modalityContractTypeRepository, IModalityContractTypeMapper modalityContractTypeMapper) {
        this.modalityContractTypeRepository = modalityContractTypeRepository;
        this.modalityContractTypeMapper = modalityContractTypeMapper;
    }

    /**
     * @see IModalityContractTypeService#createModalityContractType(ModalityContractTypeDtoRequest) 
     */
    @Override
    public Response<ModalityContractTypeDtoResponse> createModalityContractType(ModalityContractTypeDtoRequest modalityContractTypeDtoRequest) {

        ModalityContractType modalityContractTypeModel = modalityContractTypeMapper.toEntity(modalityContractTypeDtoRequest);
        ModalityContractType modalityContractTypeSaved = modalityContractTypeRepository.save(modalityContractTypeModel);
        ModalityContractTypeDtoResponse modalityContractTypeDtoResponse = modalityContractTypeMapper.toDto(modalityContractTypeSaved);

        return new ResponseHandler<>(200, "Tipo de modalidad por contrato creado exitosamente", "Tipo de modalidad por contrato creado exitosamente", modalityContractTypeDtoResponse).getResponse();
    }

    /**
     * @see IModalityContractTypeService#getById(Integer)
     */
    @Override
    public Response<ModalityContractTypeDtoResponse> getById(Integer id) {

        ModalityContractType modalityContractType = modalityContractTypeRepository.findById(id).orElse(null);
        ModalityContractTypeDtoResponse modalityContractTypeDtoResponse = modalityContractTypeMapper.toDto(modalityContractType);

        if (modalityContractType != null) {
            return new ResponseHandler<>(200, "Tipo de modalidad por contrato encontrada", "Tipo de modalidad por contrato encontrada", modalityContractTypeDtoResponse).getResponse();
        } else {
            return new ResponseHandler<>(404, "Tipo de modalidad por contrato no encontrada", "Tipo de modalidad por contrato no encontrada", modalityContractTypeDtoResponse).getResponse();
        }
    }

    /**
     * @see IModalityContractTypeService#getAll()
     */
    @Override
    public Response<ArrayList<ModalityContractTypeDtoResponse>> getAll() {

        ArrayList<ModalityContractType> listModalityContractType = (ArrayList<ModalityContractType>) modalityContractTypeRepository.findAll();
        ArrayList<ModalityContractTypeDtoResponse> modalityContractTypeDtoResponses = new ArrayList<ModalityContractTypeDtoResponse>();

        for (ModalityContractType modalityContractType: listModalityContractType) {
            modalityContractTypeDtoResponses.add(modalityContractTypeMapper.toDto(modalityContractType));
        }

        return new ResponseHandler<>(200, "Se retorno los registro de tipo de modalidad por contrato", "Se retorno los registro de tipo de modalidad por contrato", modalityContractTypeDtoResponses).getResponse();
    }

    /**
     * @see IModalityContractTypeService#updateModalityContractType(ModalityContractTypeDtoRequest)
     */
    @Override
    public Response<ModalityContractTypeDtoResponse> updateModalityContractType(ModalityContractTypeDtoRequest modalityContractTypeDtoRequest) {

        ModalityContractType modalityContractTypeModel = modalityContractTypeMapper.toEntity(modalityContractTypeDtoRequest);
        ModalityContractType modalityContractType = modalityContractTypeRepository.findById(modalityContractTypeModel.getId()).orElse(null);

        if (modalityContractType != null) {
            ModalityContractType modalityContractTypeUpdate = modalityContractTypeRepository.save(modalityContractTypeModel);
            ModalityContractTypeDtoResponse modalityContractTypeDtoResponse = modalityContractTypeMapper.toDto(modalityContractTypeUpdate);

            return new ResponseHandler<>(200, "Tipo de modalidad por contrato actualizado exitosamente", "Tipo de modalidad por contrato actualizado exitosamente", modalityContractTypeDtoResponse).getResponse();
        } else {
            ModalityContractTypeDtoResponse modalityContractTypeDtoResponse = modalityContractTypeMapper.toDto(modalityContractTypeModel);
            return new ResponseHandler<>(404, "Tipo de modalidad por contrato no encontrado", "Tipo de modalidad por contrato no encontrado", modalityContractTypeDtoResponse).getResponse();
        }
    }

    /**
     * @see IModalityContractTypeService#deleteModalityContractType(Integer)
     */
    @Override
    public Response<Boolean> deleteModalityContractType(Integer id) {

        ModalityContractType modalityContractType = modalityContractTypeRepository.findById(id).orElse(null);

        if (modalityContractType != null){
            modalityContractTypeRepository.delete(modalityContractType);
            return new ResponseHandler<>(200, "Tipo de modalidad por contrato eliminado exitosamente", "Tipo de modalidad por contrato eliminado exitosamente", true).getResponse();
        } else {
            return new ResponseHandler<>(200, "Tipo de modalidad por contrato no encontrado", "Tipo de modalidad por contrato no encontrado", false).getResponse();
        }
    }


}

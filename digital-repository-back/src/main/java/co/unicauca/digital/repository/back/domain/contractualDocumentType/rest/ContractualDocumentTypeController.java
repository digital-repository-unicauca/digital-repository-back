package co.unicauca.digital.repository.back.domain.contractualDocumentType.rest;


import co.unicauca.digital.repository.back.domain.contractualDocumentType.dto.request.ContractualDocumentTypeDtoCreateRequest;
import co.unicauca.digital.repository.back.domain.contractualDocumentType.dto.response.ContractualDocumentTypeDtoCreateResponse;
import co.unicauca.digital.repository.back.domain.contractualDocumentType.service.IContractualDocumentTypeService;
import co.unicauca.digital.repository.back.global.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/contractualDocumentType")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ContractualDocumentTypeController {

    /** Object used to invoke the operations of the IContractServe interface */
    private final IContractualDocumentTypeService contractualDocumentTypeService;

    /**
     * constructor method
     */
    public ContractualDocumentTypeController(IContractualDocumentTypeService contractualDocumentTypeService) {
        this.contractualDocumentTypeService = contractualDocumentTypeService;
    }

    /**
     * API to create a contract
     *
     * @param contractualDocumentTypeDtoCreateRequest {@link ContractualDocumentTypeDtoCreateRequest} Object with the information to be inserted, received in the body of the request to the service
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @PostMapping("")
    public ResponseEntity<Response<ContractualDocumentTypeDtoCreateResponse>> createContract(@Valid @RequestBody final ContractualDocumentTypeDtoCreateRequest contractualDocumentTypeDtoCreateRequest){
        return new ResponseEntity<>(this.contractualDocumentTypeService.createContractualDocumentType(contractualDocumentTypeDtoCreateRequest), HttpStatus.OK);
    }
}

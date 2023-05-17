package co.unicauca.digital.repository.back.domain.contract.rest;

import co.unicauca.digital.repository.back.domain.contract.dto.request.ContractDtoRequest;
import co.unicauca.digital.repository.back.domain.contract.dto.response.ContractDtoResponse;
import co.unicauca.digital.repository.back.domain.contract.service.IContractService;
import co.unicauca.digital.repository.back.global.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/contract")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ContractController {

    /** Object used to invoke the operations of the IContractServe interface */
    private final IContractService contractService;

    /**
     * constructor method
     */
    public ContractController(IContractService contractService) {
        this.contractService = contractService;
    }

    /**
     * API to create a contract
     *
     * @param contractDtoRequest {@link ContractDtoRequest} Object with the information to be inserted, received in the body of the request to the service
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @PostMapping("")
    public ResponseEntity<Response<ContractDtoResponse>> createContract(@Valid @RequestBody final ContractDtoRequest contractDtoRequest){
        return new ResponseEntity<>(this.contractService.createContract(contractDtoRequest), HttpStatus.OK);
    }
}

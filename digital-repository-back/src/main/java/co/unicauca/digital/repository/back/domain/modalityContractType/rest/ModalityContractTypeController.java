package co.unicauca.digital.repository.back.domain.modalityContractType.rest;

import co.unicauca.digital.repository.back.domain.modalityContractType.dto.request.ModalityContractTypeDtoRequest;
import co.unicauca.digital.repository.back.domain.modalityContractType.dto.response.ModalityContractTypeDtoResponse;
import co.unicauca.digital.repository.back.domain.modalityContractType.service.IModalityContractTypeService;
import co.unicauca.digital.repository.back.global.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@RequestMapping("/modalitycontracttype")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ModalityContractTypeController {

    /** Object used to invoke the operations of the IContractServe interface */
    private final IModalityContractTypeService modalityContractTypeService;

    /**
     * constructor method
     */
    public ModalityContractTypeController(IModalityContractTypeService modalityContractTypeService){
        this.modalityContractTypeService = modalityContractTypeService;
    }

    /**
     * API to create a modalitycontracttype
     *
     * @param modalityContractTypeDtoRequest {@link ModalityContractTypeDtoRequest} Object with the information to be inserted, received in the body of the request to the service
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @PostMapping("/create")
    public ResponseEntity<Response<ModalityContractTypeDtoResponse>> createModalityContractType(@Valid @RequestBody final ModalityContractTypeDtoRequest modalityContractTypeDtoRequest){
        return new ResponseEntity<>(this.modalityContractTypeService.createModalityContractType(modalityContractTypeDtoRequest), HttpStatus.OK);
    }

    /**
     * API to get a modalitycontracttype by id
     *
     * @param id {@link Integer} Object with the information to be inserted, received in the body of the request to the service
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @GetMapping("/get/{id}")
    public ResponseEntity<Response<ModalityContractTypeDtoResponse>> getById(@Valid @PathVariable final Integer id){
        return new ResponseEntity<>(this.modalityContractTypeService.getById(id), HttpStatus.OK);
    }

    /**
     * API to get all records from modalitycontracttype table
     *
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @GetMapping("/get")
    public ResponseEntity<Response<ArrayList<ModalityContractTypeDtoResponse>>> getAll() {
        return new ResponseEntity<>(this.modalityContractTypeService.getAll(), HttpStatus.OK);
    }

    /**
     * API to update a modalitycontracttype
     *
     * @param modalityContractTypeDtoRequest {@link ModalityContractTypeDtoRequest} Object with the information to be inserted, received in the body of the request to the service
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @PutMapping("/update")
    public ResponseEntity<Response<ModalityContractTypeDtoResponse>> updateModalityContractType(@Valid @RequestBody final ModalityContractTypeDtoRequest modalityContractTypeDtoRequest){
        return new ResponseEntity<>(this.modalityContractTypeService.updateModalityContractType(modalityContractTypeDtoRequest), HttpStatus.OK);
    }

    /**
     * API to delete a modalitycontracttype by id
     *
     * @param id {@link Integer} Object with the information to be inserted, received in the body of the request to the service
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Response<Boolean>> deleteModalityContractType(@Valid @PathVariable final Integer id){
        return new ResponseEntity<>(this.modalityContractTypeService.deleteModalityContractType(id), HttpStatus.OK);
    }

}

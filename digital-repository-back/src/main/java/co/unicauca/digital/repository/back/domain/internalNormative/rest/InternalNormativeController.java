package co.unicauca.digital.repository.back.domain.internalNormative.rest;

import co.unicauca.digital.repository.back.domain.internalNormative.dto.request.InternalNormativeDtoRequest;
import co.unicauca.digital.repository.back.domain.internalNormative.dto.response.InternalNormativeDtoResponse;
import co.unicauca.digital.repository.back.domain.internalNormative.service.IInternalNormativeService;
import co.unicauca.digital.repository.back.global.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@RequestMapping("/internalNormative")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class InternalNormativeController {

    /** Object used to invoke the operations of the IInternalNormativeService interface */
    private IInternalNormativeService internalNormativeService;

    /**
     * constructor method
     */
    public InternalNormativeController(IInternalNormativeService internalNormativeService) {
        this.internalNormativeService = internalNormativeService;
    }

    /**
     * API to create an internal normative
     *
     * @param internalNormativeDtoRequest {@link InternalNormativeDtoRequest} Object with the information to be inserted, received in the body of the request to the service
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @PostMapping("/create")
    public ResponseEntity<Response<InternalNormativeDtoResponse>> createInternalNormative(@Valid @RequestBody final InternalNormativeDtoRequest internalNormativeDtoRequest){
        return new ResponseEntity<>(this.internalNormativeService.createInternalNormative(internalNormativeDtoRequest), HttpStatus.OK);
    }

    /**
     * API to get an internal normative by id
     *
     * @param id {@link Integer} Object with the information to be inserted, received in the body of the request to the service
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @GetMapping("/get/{id}")
    public ResponseEntity<Response<InternalNormativeDtoResponse>> getById(@Valid @PathVariable final Integer id){
        return new ResponseEntity<>(this.internalNormativeService.getById(id), HttpStatus.OK);
    }

    /**
     * API to get all records from internal normative table
     *
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @GetMapping("/get")
    public ResponseEntity<Response<ArrayList<InternalNormativeDtoResponse>>> getAll(){
        return new ResponseEntity<>(this.internalNormativeService.getAll(), HttpStatus.OK);
    }

    /**
     * API to update a internal normative
     *
     * @param internalNormativeDtoRequest {@link InternalNormativeDtoRequest} Object with the information to be inserted, received in the body of the request to the service
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @PutMapping("/update")
    public ResponseEntity<Response<InternalNormativeDtoResponse>> updateInternalNormative(@Valid @RequestBody final InternalNormativeDtoRequest internalNormativeDtoRequest){
        return new ResponseEntity<>(this.internalNormativeService.updateInternalNormative(internalNormativeDtoRequest), HttpStatus.OK);
    }

    /**
     * API to delete an internal normative by id
     *
     * @param id {@link Integer} Object with the information to be inserted, received in the body of the request to the service
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Response<Boolean>> deleteInternalNormative(@Valid @PathVariable final Integer id){
        return new ResponseEntity<>(this.internalNormativeService.deleteInternalNormative(id), HttpStatus.OK);
    }
}

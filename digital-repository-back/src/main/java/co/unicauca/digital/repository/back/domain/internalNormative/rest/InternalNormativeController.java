package co.unicauca.digital.repository.back.domain.internalNormative.rest;

<<<<<<< HEAD
import co.unicauca.digital.repository.back.domain.internalNormative.dto.request.*;
import co.unicauca.digital.repository.back.domain.internalNormative.dto.response.*;
import co.unicauca.digital.repository.back.domain.internalNormative.service.IInternalNormativeService;
import co.unicauca.digital.repository.back.global.response.PageableResponse;
=======
import co.unicauca.digital.repository.back.domain.internalNormative.dto.request.InternalNormativeDtoRequest;
import co.unicauca.digital.repository.back.domain.internalNormative.dto.response.InternalNormativeDtoResponse;
import co.unicauca.digital.repository.back.domain.internalNormative.service.IInternalNormativeService;
>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2
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
<<<<<<< HEAD
     * @param internalNormativeDtoCreateRequest {@link InternalNormativeDtoCreateRequest} Object with the information to be inserted, received in the body of the request to the service
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @PostMapping("")
    public ResponseEntity<Response<InternalNormativeDtoCreateResponse>> createInternalNormative(@Valid @RequestBody final InternalNormativeDtoCreateRequest internalNormativeDtoCreateRequest){
        return new ResponseEntity<>(this.internalNormativeService.createInternalNormative(internalNormativeDtoCreateRequest), HttpStatus.OK);
=======
     * @param internalNormativeDtoRequest {@link InternalNormativeDtoRequest} Object with the information to be inserted, received in the body of the request to the service
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @PostMapping("/create")
    public ResponseEntity<Response<InternalNormativeDtoResponse>> createInternalNormative(@Valid @RequestBody final InternalNormativeDtoRequest internalNormativeDtoRequest){
        return new ResponseEntity<>(this.internalNormativeService.createInternalNormative(internalNormativeDtoRequest), HttpStatus.OK);
>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2
    }

    /**
     * API to get an internal normative by id
     *
<<<<<<< HEAD
     * @param id {@link Integer} Object ID
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Response<InternalNormativeDtoFindResponse>> getById(@Valid @PathVariable final Integer id){
=======
     * @param id {@link Integer} Object with the information to be inserted, received in the body of the request to the service
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @GetMapping("/get/{id}")
    public ResponseEntity<Response<InternalNormativeDtoResponse>> getById(@Valid @PathVariable final Integer id){
>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2
        return new ResponseEntity<>(this.internalNormativeService.getById(id), HttpStatus.OK);
    }

    /**
     * API to get all records from internal normative table
     *
<<<<<<< HEAD
     * @param pageNo Pagination Page number
     * @param pageSize Pagination Page size
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @GetMapping("")
    public ResponseEntity<Response<PageableResponse<Object>>> getAll(
            @RequestParam(value = "pageNo", defaultValue = "0", required = false) int pageNo,
            @RequestParam(value = "pageSize", defaultValue = "10", required = false) int pageSize){
        return new ResponseEntity<>(this.internalNormativeService.getAll(pageNo, pageSize), HttpStatus.OK);
=======
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @GetMapping("/get")
    public ResponseEntity<Response<ArrayList<InternalNormativeDtoResponse>>> getAll(){
        return new ResponseEntity<>(this.internalNormativeService.getAll(), HttpStatus.OK);
>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2
    }

    /**
     * API to update a internal normative
     *
<<<<<<< HEAD
     * @param internalNormativeDtoUpdateRequest {@link InternalNormativeDtoUpdateRequest} Object with the information to be updated, received in the body of the request to the service
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @PatchMapping("")
    public ResponseEntity<Response<InternalNormativeDtoCreateResponse>> updateInternalNormative(@Valid @RequestBody final InternalNormativeDtoUpdateRequest internalNormativeDtoUpdateRequest){
        return new ResponseEntity<>(this.internalNormativeService.updateInternalNormative(internalNormativeDtoUpdateRequest), HttpStatus.OK);
=======
     * @param internalNormativeDtoRequest {@link InternalNormativeDtoRequest} Object with the information to be inserted, received in the body of the request to the service
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @PutMapping("/update")
    public ResponseEntity<Response<InternalNormativeDtoResponse>> updateInternalNormative(@Valid @RequestBody final InternalNormativeDtoRequest internalNormativeDtoRequest){
        return new ResponseEntity<>(this.internalNormativeService.updateInternalNormative(internalNormativeDtoRequest), HttpStatus.OK);
>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2
    }

    /**
     * API to delete an internal normative by id
     *
<<<<<<< HEAD
     * @param id {@link Integer} Object ID
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @DeleteMapping("{id}")
=======
     * @param id {@link Integer} Object with the information to be inserted, received in the body of the request to the service
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    @DeleteMapping("/delete/{id}")
>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2
    public ResponseEntity<Response<Boolean>> deleteInternalNormative(@Valid @PathVariable final Integer id){
        return new ResponseEntity<>(this.internalNormativeService.deleteInternalNormative(id), HttpStatus.OK);
    }
}

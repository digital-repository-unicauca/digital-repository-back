package co.unicauca.digital.repository.back.domain.collection.rest;

import co.unicauca.digital.repository.back.domain.collection.dto.request.CollectionDtoRequest;
import co.unicauca.digital.repository.back.domain.collection.dto.response.CollectionDtoResponse;
import co.unicauca.digital.repository.back.domain.collection.service.ICollectionService;
import co.unicauca.digital.repository.back.global.response.Response;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/collection")
@Validated
public class CollectionController {
    private final ICollectionService collectionService;

    public CollectionController(ICollectionService collectionService) {
        this.collectionService = collectionService;
    }

    @PostMapping
    public ResponseEntity<Response<CollectionDtoResponse>> createCollection(@Valid @RequestBody final CollectionDtoRequest collectionDtoRequest){
        return new ResponseEntity<>(this.collectionService.createCollection(collectionDtoRequest), HttpStatus.OK);
    }

    @GetMapping("/{collectionId}")
    public ResponseEntity<Response<CollectionDtoResponse>> getByIdCollection(@PathVariable("collectionId") int id){
        return new ResponseEntity<>(this.collectionService.getByIdCollection(id),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Response<Page<CollectionDtoResponse>>> getAll(@RequestParam(defaultValue = "pageNumber") int pageNumber, @RequestParam(defaultValue = "pageZise") int pageSize){
        return new ResponseEntity<>(this.collectionService.getAll(pageNumber,pageSize),HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Response<CollectionDtoResponse>> update(@Valid @RequestBody CollectionDtoRequest collectionDtoRequest){
        return new ResponseEntity<>(this.collectionService.update(collectionDtoRequest),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Response<CollectionDtoResponse>> delete(@PathVariable int id){
        return new ResponseEntity<>(this.collectionService.delete(id),HttpStatus.OK);
    }
}

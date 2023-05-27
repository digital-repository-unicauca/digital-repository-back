package co.unicauca.digital.repository.back.domain.contract.service.impl;

import co.unicauca.digital.repository.back.domain.contract.dto.response.ContractDtoFindContractualFoldersResponse;
import co.unicauca.digital.repository.back.domain.contract.mapper.IContractMapper;
import co.unicauca.digital.repository.back.domain.contract.model.Contract;
import co.unicauca.digital.repository.back.domain.contract.repository.IContractRepository;
import co.unicauca.digital.repository.back.domain.contract.service.IListContractualFolders;
import co.unicauca.digital.repository.back.global.response.PageableResponse;
import co.unicauca.digital.repository.back.global.response.Response;
import co.unicauca.digital.repository.back.global.response.handler.ResponseHandler;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListContractualFolders implements IListContractualFolders {

    /** Object to perform CRUD operations on the Product entity */
    private final IContractRepository contractRepository;

    /** Mapping object for mapping the products */
    private final IContractMapper contractMapper;

    public ListContractualFolders(IContractRepository contractRepository, IContractMapper contractMapper) {
        this.contractRepository = contractRepository;
        this.contractMapper = contractMapper;
    }

    /**
     * @see IListContractualFolders#getContractualFoldersSortByUpdateDate(int,int)
     */
    @Override
    public Response<PageableResponse<Object>> getContractualFoldersSortByUpdateDate(int pageNo, int pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNo, pageSize, Sort.by("signingDate").descending());
        Page<Contract> responsePage = contractRepository.findAll(pageRequest);

        List<Object> contractDtoFindContractualFolderResponse = responsePage.get()
                .map(contract -> {
                    ContractDtoFindContractualFoldersResponse response = this.contractMapper.toDtoFindContractualFolders(contract);
                    response.setSigningYear(contract.getSigningDate().getYear());
                    return response;
                }
        ).collect(Collectors.toList());

        PageableResponse<Object> response = PageableResponse.builder()
                .data(contractDtoFindContractualFolderResponse)
                .pageNo(responsePage.getNumber())
                .pageSize(responsePage.getSize())
                .totalElements(responsePage.getTotalElements())
                .totalPages(responsePage.getTotalPages())
                .last(responsePage.isLast())
                .build();

        return new ResponseHandler<>(200, "Exitoso", "Exitoso", response).getResponse();
    }
}

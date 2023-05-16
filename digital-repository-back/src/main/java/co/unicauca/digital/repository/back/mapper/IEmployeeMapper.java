package co.unicauca.digital.repository.back.mapper;

import co.unicauca.digital.repository.back.dto.employee.request.EmployeeDtoRequest;
import co.unicauca.digital.repository.back.dto.employee.response.EmployeeDtoResponse;
import co.unicauca.digital.repository.back.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IEmployeeMapper{
    @Mappings({
            @Mapping(target = "birthdate", source = "birthdate", dateFormat = "yyyy-MM-dd"),
            @Mapping(target = "hireDate", source = "hireDate", dateFormat = "yyyy-MM-dd")
    })
    EmployeeDtoResponse toDto(final Employee employee);

    @Mappings({
            @Mapping(target = "birthdate", source = "birthdate", dateFormat = "yyyy-MM-dd"),
            @Mapping(target = "hireDate", source = "hireDate", dateFormat = "yyyy-MM-dd")
    })
    Employee toEntity(final EmployeeDtoRequest requestDto);

}

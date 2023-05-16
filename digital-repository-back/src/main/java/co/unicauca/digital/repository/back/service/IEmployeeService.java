package co.unicauca.digital.repository.back.service;

import co.unicauca.digital.repository.back.dto.employee.request.EmployeeDtoRequest;
import co.unicauca.digital.repository.back.dto.employee.response.EmployeeDtoResponse;

public interface IEmployeeService {
    EmployeeDtoResponse saveEmployee(final EmployeeDtoRequest employeeDTORequest);
}

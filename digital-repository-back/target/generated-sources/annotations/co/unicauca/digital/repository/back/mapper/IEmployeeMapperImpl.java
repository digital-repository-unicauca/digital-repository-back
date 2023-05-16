package co.unicauca.digital.repository.back.mapper;

import co.unicauca.digital.repository.back.dto.employee.request.EmployeeDtoRequest;
import co.unicauca.digital.repository.back.dto.employee.response.EmployeeDtoResponse;
import co.unicauca.digital.repository.back.model.Employee;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-15T21:16:02-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class IEmployeeMapperImpl implements IEmployeeMapper {

    @Override
    public EmployeeDtoResponse toDto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDtoResponse.EmployeeDtoResponseBuilder employeeDtoResponse = EmployeeDtoResponse.builder();

        employeeDtoResponse.birthdate( employee.getBirthdate() );
        employeeDtoResponse.hireDate( employee.getHireDate() );
        employeeDtoResponse.id( employee.getId() );
        employeeDtoResponse.names( employee.getNames() );
        employeeDtoResponse.surnames( employee.getSurnames() );
        employeeDtoResponse.documentType( employee.getDocumentType() );
        employeeDtoResponse.documentNumber( employee.getDocumentNumber() );
        employeeDtoResponse.position( employee.getPosition() );
        employeeDtoResponse.salary( employee.getSalary() );

        return employeeDtoResponse.build();
    }

    @Override
    public Employee toEntity(EmployeeDtoRequest requestDto) {
        if ( requestDto == null ) {
            return null;
        }

        Employee.EmployeeBuilder employee = Employee.builder();

        try {
            if ( requestDto.getBirthdate() != null ) {
                employee.birthdate( new SimpleDateFormat( "yyyy-MM-dd" ).parse( requestDto.getBirthdate() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        try {
            if ( requestDto.getHireDate() != null ) {
                employee.hireDate( new SimpleDateFormat( "yyyy-MM-dd" ).parse( requestDto.getHireDate() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        employee.names( requestDto.getNames() );
        employee.surnames( requestDto.getSurnames() );
        employee.documentType( requestDto.getDocumentType() );
        employee.documentNumber( requestDto.getDocumentNumber() );
        employee.position( requestDto.getPosition() );
        employee.salary( requestDto.getSalary() );

        return employee.build();
    }
}

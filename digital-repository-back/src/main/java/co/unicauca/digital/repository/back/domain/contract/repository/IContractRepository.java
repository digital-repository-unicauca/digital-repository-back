package co.unicauca.digital.repository.back.domain.contract.repository;

import co.unicauca.digital.repository.back.domain.contract.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContractRepository extends JpaRepository<Contract, Integer> {
}

package co.unicauca.digital.repository.back.domain.modalityContractType.repository;

import co.unicauca.digital.repository.back.domain.modalityContractType.model.ModalityContractType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository that manages the persistence of the ModalityContractType entity in the database.
 */
@Repository
public interface IModalityContractTypeRepository extends JpaRepository<ModalityContractType, Integer> {
}

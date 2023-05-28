package co.unicauca.digital.repository.back.domain.contract.repository;

import co.unicauca.digital.repository.back.domain.contract.model.ContractDtoFindContractualFolders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository that manages the persistence of the contracts by a filter and a search pattern
 */
@Repository
public interface IContractFilterAndSearchPatternRepository extends JpaRepository<ContractDtoFindContractualFolders, Integer> {
    /**
     * Query find contracts by a filter and a search pattern
     */
    @Query(
            value =
                    "select " +
                            " CON.id, " +
                            " CON.reference, " +
                            " MODA.name as modality, " +
                            " CONTYPE.name as contractType, " +
                            " VEN.identification as vendor, " +
                            " year(CON.signingDate) as signingYear " +
                            "from " +
                            " contract CON, " +
                            " modality MODA, " +
                            " contracttype CONTYPE, " +
                            " modalitycontracttype CONTYPEMODA, " +
                            " vendor VEN " +
                            "where " +
                            " CONTYPEMODA.modalityId = MODA.id AND  " +
                            "    CONTYPEMODA.contractTypeId = CONTYPE.id AND " +
                            "    VEN.id = CON.vendorId AND " +
                            " ( " +
                            "        (:filter = 'REFERENCE' AND CON.reference LIKE CONCAT('%', :search, '%')) or " +
                            "        (:filter = 'MODALITY' AND MODA.name  LIKE CONCAT('%', :search, '%')) or " +
                            "        (:filter = 'TYPE' AND CONTYPE.name  LIKE CONCAT('%', :search, '%')) or " +
                            "        (:filter = 'VENDOR' AND VEN.identification LIKE CONCAT('%', :search, '%')) or " +
                            "        (:filter = 'SUPERSCRIBE-YEAR' AND year(CON.signingDate) LIKE CONCAT('%', :search, '%')) " +
                            "    );",
            nativeQuery = true)
    List<ContractDtoFindContractualFolders> findByFilterAndSearchPattern(String filter, String search);
}

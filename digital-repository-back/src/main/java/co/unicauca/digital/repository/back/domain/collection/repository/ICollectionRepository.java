package co.unicauca.digital.repository.back.domain.collection.repository;

import co.unicauca.digital.repository.back.domain.collection.model.Collection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICollectionRepository extends JpaRepository<Collection,Integer> {

    Page<Collection> findAll(Pageable pageable);

}
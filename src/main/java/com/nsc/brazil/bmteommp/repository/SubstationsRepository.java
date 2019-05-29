package com.nsc.brazil.bmteommp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.nsc.brazil.bmteommp.domain.Substations;

public interface SubstationsRepository extends JpaRepository<Substations, String>, JpaSpecificationExecutor<Substations> {

}
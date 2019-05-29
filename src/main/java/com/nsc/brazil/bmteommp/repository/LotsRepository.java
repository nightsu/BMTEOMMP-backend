package com.nsc.brazil.bmteommp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.nsc.brazil.bmteommp.domain.Lots;

public interface LotsRepository extends JpaRepository<Lots, String>, JpaSpecificationExecutor<Lots> {

}
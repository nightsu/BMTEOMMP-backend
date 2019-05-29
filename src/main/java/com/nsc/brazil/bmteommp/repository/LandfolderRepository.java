package com.nsc.brazil.bmteommp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.nsc.brazil.bmteommp.domain.Landfolder;

public interface LandfolderRepository extends JpaRepository<Landfolder, Integer>, JpaSpecificationExecutor<Landfolder> {

}
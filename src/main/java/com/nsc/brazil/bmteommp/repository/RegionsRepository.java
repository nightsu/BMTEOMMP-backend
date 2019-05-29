package com.nsc.brazil.bmteommp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.nsc.brazil.bmteommp.domain.Regions;

public interface RegionsRepository extends JpaRepository<Regions, String>, JpaSpecificationExecutor<Regions> {

}
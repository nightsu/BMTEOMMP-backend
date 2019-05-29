package com.nsc.brazil.bmteommp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.nsc.brazil.bmteommp.domain.Substationequipments;

public interface SubstationequipmentsRepository extends JpaRepository<Substationequipments, String>, JpaSpecificationExecutor<Substationequipments> {

}
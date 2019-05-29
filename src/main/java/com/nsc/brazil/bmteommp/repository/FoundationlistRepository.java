package com.nsc.brazil.bmteommp.repository;

import com.nsc.brazil.bmteommp.domain.Foundationlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface FoundationlistRepository extends JpaRepository<Foundationlist, Integer>, JpaSpecificationExecutor<Foundationlist> {

    List<Foundationlist> findByTowerTypeAndFoundation(String towerType,String foundation);
}
package com.nsc.brazil.bmteommp.repository;

import com.nsc.brazil.bmteommp.domain.Towertypelist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TowertypelistRepository extends JpaRepository<Towertypelist, Integer>, JpaSpecificationExecutor<Towertypelist> {

    List<Towertypelist> findByTowerType(String TowerType);
}
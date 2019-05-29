package com.nsc.brazil.bmteommp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.nsc.brazil.bmteommp.domain.Towerlands;

public interface TowerlandsRepository extends JpaRepository<Towerlands, String>, JpaSpecificationExecutor<Towerlands> {
    Towerlands findById(int id);
}
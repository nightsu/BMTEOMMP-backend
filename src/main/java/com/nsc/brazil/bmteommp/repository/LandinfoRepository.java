package com.nsc.brazil.bmteommp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.nsc.brazil.bmteommp.domain.Landinfo;

public interface LandinfoRepository extends JpaRepository<Landinfo, Integer>, JpaSpecificationExecutor<Landinfo> {

    Landinfo findBypROCESSNUMBER(String pROCESSNUMBER);
}
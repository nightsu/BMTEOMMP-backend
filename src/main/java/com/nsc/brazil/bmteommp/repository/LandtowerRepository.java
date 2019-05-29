package com.nsc.brazil.bmteommp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.nsc.brazil.bmteommp.domain.Landtower;

public interface LandtowerRepository extends JpaRepository<Landtower, Integer>, JpaSpecificationExecutor<Landtower> {

}
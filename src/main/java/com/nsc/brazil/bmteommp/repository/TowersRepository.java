package com.nsc.brazil.bmteommp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.nsc.brazil.bmteommp.domain.Towers;

public interface TowersRepository extends JpaRepository<Towers, String>, JpaSpecificationExecutor<Towers> {

}
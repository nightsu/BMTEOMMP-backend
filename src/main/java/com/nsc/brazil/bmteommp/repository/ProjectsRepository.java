package com.nsc.brazil.bmteommp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.nsc.brazil.bmteommp.domain.Projects;

public interface ProjectsRepository extends JpaRepository<Projects, String>, JpaSpecificationExecutor<Projects> {

}
package com.nsc.brazil.bmteommp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.nsc.brazil.bmteommp.domain.Transmissionlines;

public interface TransmissionlinesRepository extends JpaRepository<Transmissionlines, String>, JpaSpecificationExecutor<Transmissionlines> {

}
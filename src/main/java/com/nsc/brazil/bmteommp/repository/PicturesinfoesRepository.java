package com.nsc.brazil.bmteommp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.nsc.brazil.bmteommp.domain.Picturesinfoes;

import java.util.List;

public interface PicturesinfoesRepository extends JpaRepository<Picturesinfoes, String>, JpaSpecificationExecutor<Picturesinfoes> {

    List<Picturesinfoes> findByItemID(String itemID);
}
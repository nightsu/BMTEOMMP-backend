package com.nsc.brazil.bmteommp.web;

import com.nsc.brazil.bmteommp.domain.Substationequipments;
import com.nsc.brazil.bmteommp.repository.SubstationequipmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SubstationequipmentsController {
    @Autowired
    private SubstationequipmentsRepository substationequipmentsRepository;

    @GetMapping("/substationequipments/all")
    public List<Substationequipments> getAll(){
        return substationequipmentsRepository.findAll();
    }
}

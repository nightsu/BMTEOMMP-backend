package com.nsc.brazil.bmteommp.web;

import com.nsc.brazil.bmteommp.domain.Substations;
import com.nsc.brazil.bmteommp.repository.SubstationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SubstationsController {
    @Autowired
    private SubstationsRepository substationsRepository;

    @GetMapping("/substations/all")
    public List<Substations> getAll(){
        List<Substations> lst = substationsRepository.findAll();
        lst.sort((Substations arg0, Substations arg1) -> arg0.getNumber()-arg1.getNumber());
        return lst;
    }
}

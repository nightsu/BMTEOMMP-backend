package com.nsc.brazil.bmteommp.web;

import com.nsc.brazil.bmteommp.domain.Lots;
import com.nsc.brazil.bmteommp.repository.LotsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LotsController {
    @Autowired
    private LotsRepository lotsRepository;

    @GetMapping("/lots/all")
    public List<Lots> getAll(){
        List<Lots> lst = lotsRepository.findAll();
        lst.sort((Lots arg0, Lots arg1) -> arg0.getNumber()-arg1.getNumber());
        return lst;
    }
}

package com.nsc.brazil.bmteommp.web;

import com.nsc.brazil.bmteommp.domain.Regions;
import com.nsc.brazil.bmteommp.repository.RegionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RegionsController {
    @Autowired
    private RegionsRepository regionsRepository;

    @GetMapping("/regions/all")
    public List<Regions> getAll(){
        List<Regions> lst = regionsRepository.findAll();
        lst.sort((Regions arg0, Regions arg1) -> arg0.getNumber()-arg1.getNumber());
        return lst;
    }
}

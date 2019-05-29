package com.nsc.brazil.bmteommp.web;

import com.nsc.brazil.bmteommp.domain.Towers;
import com.nsc.brazil.bmteommp.repository.TowersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TowersController {
    @Autowired
    private TowersRepository towersRepository;

    @GetMapping("/towers/all")
    public List<Towers> getAll(){
        List<Towers> lst = towersRepository.findAll();
        lst.sort((Towers arg0, Towers arg1) -> arg0.getNumber()-arg1.getNumber());
        return lst;
    }
}

package com.nsc.brazil.bmteommp.web;

import com.nsc.brazil.bmteommp.domain.Landinfo;
import com.nsc.brazil.bmteommp.domain.Towerlands;
import com.nsc.brazil.bmteommp.repository.LandinfoRepository;
import com.nsc.brazil.bmteommp.repository.TowerlandsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class LandinfoController {
    @Autowired
    private TowerlandsRepository towerlandsRepository;

    @Autowired
    private LandinfoRepository landinfoRepository;

    @GetMapping("/landinfo/all")
    public List<Landinfo> getAll() {
        return landinfoRepository.findAll();
    }

    @GetMapping("/landinfo/{towerlandId}")
    public Landinfo getLandinfoByTowerLandId(@PathVariable String towerlandId) {
        Optional<Towerlands> towerland = towerlandsRepository.findById(towerlandId);
        if(towerland.get() != null){
            String landCode = towerland.get().getCadastralCode();
            Landinfo info = landinfoRepository.findBypROCESSNUMBER(landCode);
            return info;
        }
        return null;

    }

}

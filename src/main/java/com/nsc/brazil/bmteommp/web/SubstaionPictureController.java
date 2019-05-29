package com.nsc.brazil.bmteommp.web;

import com.nsc.brazil.bmteommp.domain.Picturesinfoes;
import com.nsc.brazil.bmteommp.domain.Regions;
import com.nsc.brazil.bmteommp.repository.PicturesinfoesRepository;
import com.nsc.brazil.bmteommp.repository.RegionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SubstaionPictureController {
    @Autowired
    private PicturesinfoesRepository picturesinfoesRepository;
    @Autowired
    private RegionsRepository regionsRepository;

    @GetMapping("/substaionpictures/{substationid}")
    public List<Picturesinfoes> getPictureBySubstaion(@PathVariable String substationid){
        List<Picturesinfoes> result = new ArrayList<Picturesinfoes>();

        List<Regions> regionsList = regionsRepository.findAll();
        regionsList.forEach(item -> {
            if(item.getSubstationID().equals(substationid)){
                List<Picturesinfoes> lst = picturesinfoesRepository.findByItemID(item.getID());
                result.addAll(lst);
            }
        });
        return result;
    }

    @GetMapping("/regionpictures/{regionid}")
    public List<Picturesinfoes> getPictureByRegionID(@PathVariable String regionid){
        List<Picturesinfoes> lst = picturesinfoesRepository.findByItemID(regionid);
        return lst;
    }
}

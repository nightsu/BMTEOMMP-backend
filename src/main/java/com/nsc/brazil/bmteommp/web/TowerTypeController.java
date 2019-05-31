package com.nsc.brazil.bmteommp.web;

import com.alibaba.fastjson.JSONObject;
import com.nsc.brazil.bmteommp.domain.Foundationlist;
import com.nsc.brazil.bmteommp.domain.Towertypelist;
import com.nsc.brazil.bmteommp.repository.FoundationlistRepository;
import com.nsc.brazil.bmteommp.repository.TowertypelistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TowerTypeController {
    @Autowired
    private TowertypelistRepository towertypelistRepository;

    @Autowired
    private FoundationlistRepository foundationlistRepository;

    @GetMapping("/towertype/{towertype}")
    public List<Towertypelist> getTowerTypeByTowerType(@PathVariable String towertype){
        List<Towertypelist> lst = towertypelistRepository.findByTowerType(towertype);
        return lst;
    }

    @GetMapping("/towertype")
    public Map<String,JSONObject> getTowerTypeAndFoundation(@RequestParam String towertype,@RequestParam String foundationa,@RequestParam String foundationb,@RequestParam String foundationc,@RequestParam String foundationd){
        List<Towertypelist> towertypelists = towertypelistRepository.findByTowerType(towertype);
        JSONObject towerTypeObj = new JSONObject();
        towerTypeObj.put("name",towertype);
        towerTypeObj.put("children",towertypelists);

        List<Foundationlist> foundationlistsA = foundationlistRepository.findByTowerTypeAndFoundation(towertype,foundationa);
        JSONObject foundationAObj = new JSONObject();
        foundationAObj.put("name",foundationa);
        foundationAObj.put("children",foundationlistsA);

        List<Foundationlist> foundationlistsB = foundationlistRepository.findByTowerTypeAndFoundation(towertype,foundationb);
        JSONObject foundationBObj = new JSONObject();
        foundationBObj.put("name",foundationb);
        foundationBObj.put("children",foundationlistsB);

        List<Foundationlist> foundationlistsC = foundationlistRepository.findByTowerTypeAndFoundation(towertype,foundationc);
        JSONObject foundationCObj = new JSONObject();
        foundationCObj.put("name",foundationc);
        foundationCObj.put("children",foundationlistsC);

        List<Foundationlist> foundationlistsD = foundationlistRepository.findByTowerTypeAndFoundation(towertype,foundationd);
        JSONObject foundationDObj = new JSONObject();
        foundationDObj.put("name",foundationd);
        foundationDObj.put("children",foundationlistsD);

        Map<String,JSONObject> result = new LinkedHashMap<String,JSONObject>();
        result.put("Towertype",towerTypeObj);
        result.put("FoundationA",foundationAObj);
        result.put("FoundationB",foundationBObj);
        result.put("FoundationC",foundationCObj);
        result.put("FoundationD",foundationDObj);

        return result;
    }

}

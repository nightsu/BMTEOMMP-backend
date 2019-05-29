package com.nsc.brazil.bmteommp.web;

import com.nsc.brazil.bmteommp.domain.Transmissionlines;
import com.nsc.brazil.bmteommp.repository.TransmissionlinesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TransmissionlinesController {
    @Autowired
    private TransmissionlinesRepository transmissionlinesRepository;

    @GetMapping("/lines/all")
    public List<Transmissionlines> getAll(){
        List<Transmissionlines> lst = transmissionlinesRepository.findAll();
        lst.sort((Transmissionlines arg0, Transmissionlines arg1) -> arg0.getNumber()-arg1.getNumber());
        return lst;
    }
}

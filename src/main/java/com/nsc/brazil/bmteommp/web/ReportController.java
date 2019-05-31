package com.nsc.brazil.bmteommp.web;

import com.nsc.brazil.bmteommp.domain.Report;
import com.nsc.brazil.bmteommp.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReportController {
    @Autowired
    private ReportRepository reportRepository;

    @GetMapping("/report/all")
    public List<Report> getAll(){
        List<Report> lst = reportRepository.findAll();
        return lst;
    }
}

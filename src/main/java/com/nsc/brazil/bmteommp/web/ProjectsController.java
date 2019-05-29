package com.nsc.brazil.bmteommp.web;

import com.nsc.brazil.bmteommp.domain.Projects;
import com.nsc.brazil.bmteommp.repository.ProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProjectsController {
    @Autowired
    private ProjectsRepository projectsRepository;

    @GetMapping("/projects/all")
    public List<Projects> getAll(){
        return projectsRepository.findAll();
    }
}

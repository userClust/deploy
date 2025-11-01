package com.crudapp.deploy.controller;

import com.crudapp.deploy.service.CrudService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CrudController {
    private final CrudService service;

    public CrudController(CrudService service) {
        this.service = service;
    }

    @GetMapping("/list")
    public List<String> getAll(){
        return service.getAll();
    }
}

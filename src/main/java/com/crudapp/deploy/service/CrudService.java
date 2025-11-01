package com.crudapp.deploy.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CrudService {
    public List<String> getAll(){
        List<String> newList = new ArrayList<>(List.of("1", "2", "3", "4", "5", "6", "7"));
        return newList;
    }
}

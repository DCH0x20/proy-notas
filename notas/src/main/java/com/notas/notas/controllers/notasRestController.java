package com.notas.notas.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;




@RestController
public class notasRestController {

    @GetMapping("/health")
    public Map<String , Object> health() {
        Map<String,Object> model = new HashMap<>();
        model.put("id","sucess");
        model.put("state","true");
        model.put("code",200);
        model.put("value","En Ejecución!");
        return model;
    }

    @GetMapping("/health2")
    public List<Object> health2() {
        List<Object> list = new ArrayList<>();
        Map<String,Object> map  = new HashMap<>();
        Map<String,Object> map2  = new HashMap<>();
        map.put("id", "success");
        map.put("state",true);
        map.put("code",200);
        map.put("value","Ejecutandose!");
        list.add(map);
        map2.put("id", "error");
        map2.put("state",false);
        map2.put("code",500);
        map2.put("value","Internal Server Error");
        list.add(map2);
        return list;
    }
    
    
}

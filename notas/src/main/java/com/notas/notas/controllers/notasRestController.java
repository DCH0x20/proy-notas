package com.notas.notas.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;






@RestController
public class notasRestController {
    List<Object> listNotas = new ArrayList<>();
    Map<String, Object> response = new HashMap<>();

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

    @GetMapping("/ListarNotas")
    public List<Object> ListNotas() {
        
        Map<String,Object> map = new HashMap<>();
        Map<String,Object> map2 = new HashMap<>();

        map.put("id",1);
        map.put("name", "Entrenamiento");
        map.put("description", "Entrenar con Jorge a las 5:50 pm en el parque");
        map.put("created" , "19/01/2026");
        map.put("updated","20/01/2026");
        map.put("isActive" , true);
        map.put("isDelete", false);
        listNotas.add(map);
        map2.put("id",2);
        map2.put("name", "Estudiar");
        map2.put("description", "ir a la biblioteca de la universidad");
        map2.put("created" , "09/01/2026");
        map2.put("updated","10/01/2026");
        map2.put("isActive" , false);
        map2.put("isDelete", true);
        listNotas.add(map2);
        return listNotas;
    }

    @PostMapping("/insert")
    public Map<String , Object> postMethodName(@RequestParam Integer id , @RequestParam String name , @RequestParam String description , @RequestParam boolean isActive) {
        LocalDateTime fechaHoraLocal = LocalDateTime.now();
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name",name);
        map.put("description", description);
        map.put("created" , fechaHoraLocal);
        map.put("updated", null);
        map.put("isActive" , isActive);
        map.put("isDelete" , false);
        listNotas.add(map);
        if(listNotas.size() > 0){
            response.put("id", "success");
            response.put("state",200);
            response.put("value" , "Nota creada");
        }else{
            response.put("id", "Error"); 
            response.put("state",500);
            response.put("value" , "Hubo un error al crear la nota");
        }
        return response;
    }
    
    
    
    
}

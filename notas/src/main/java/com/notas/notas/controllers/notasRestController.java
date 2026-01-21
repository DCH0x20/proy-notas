package com.notas.notas.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.notas.notas.dtos.ListarNotasDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;






@RestController
@RequestMapping("/api")

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
    public List<ListarNotasDTO> ListNotas() {
        LocalDateTime fechaHora = LocalDateTime.now();
        ListarNotasDTO notasDTO = new ListarNotasDTO();
        notasDTO.setId(1L);
        notasDTO.setName("Brindis con Flavio");
        notasDTO.setDescription("Comprar el vino e ir al point a las 6:00 PM");
        notasDTO.setCreated(fechaHora);
        notasDTO.setUpdated(null);
        notasDTO.setActive(true);
        notasDTO.setDelete(false);
        return Arrays.asList(notasDTO);
    }

    @PostMapping("/insert")
    public Map<String , Object> postMethodName(@RequestParam Integer id , @RequestParam String name , @RequestParam String description , @RequestParam boolean isActive) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name",name);
        map.put("description", description);
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

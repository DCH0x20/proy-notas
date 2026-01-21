package com.notas.notas.controllers;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.notas.notas.dtos.ListarNotasDTO;


@Controller
public class notasController {

    @GetMapping("/ListarNotas")
    public String ListarNotas(Model model) {
        return "ListarNotas";
    }

    @ModelAttribute("notas")
    public List<ListarNotasDTO> ListarNotas(){
        LocalDateTime fechaHora = LocalDateTime.now();
        ListarNotasDTO notasDTO = new ListarNotasDTO();
        ListarNotasDTO notasDTO1 = new ListarNotasDTO();
        notasDTO.setId(1L);
        notasDTO.setName("Brindis con Flavio");
        notasDTO.setDescription("Comprar vino e ir a point a hacer el brindis");
        notasDTO.setCreated(fechaHora);
        notasDTO.setUpdated(null);
        notasDTO.setActive(true);
        notasDTO.setDelete(false);

        notasDTO1.setId(2L);
        notasDTO1.setName("Entrenamiento con Jorge");
        notasDTO1.setDescription("Ir a la casa de Jorge y luego ir al GYM");
        notasDTO1.setCreated(fechaHora);
        notasDTO1.setUpdated(null);
        notasDTO1.setActive(true);
        notasDTO1.setDelete(false);
        return Arrays.asList(notasDTO , notasDTO1);
    }
    
}

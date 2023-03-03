package com.practica1_G3.controller;

import com.practica1_G3.dao.EstadoDao;
import com.practica1_G3.domain.Estado;
import com.practica1_G3.service.EstadoService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping("/")
    public String inicio(Model model){
      var estados=estadoService.getEstado();  
      
      
        model.addAttribute("estados", estados);
        return "index";
       
    }
    @GetMapping("/estado/eliminar/{idEstado}")
    public String eliminaEstado(Estado estado){
        estadoService.deleteEstado(estado);
        return "redirect:/";
    }
    
    
    @GetMapping("/estado/nuevo/")
    public String nuevoEstado(Estado estado){
        return"ActualizaEstado";
    }
    @PostMapping("/estado/guardar")
    public String guardarEstado(Estado estado){
        estadoService.saveEstado(estado);
        return "redirect:/";
    }
    
     @GetMapping("/estado/actualizar/{idEstado}")
    public String actualizarEstado(Estado estado, Model model){
        estado= estadoService.getEstado(estado);
        model.addAttribute("estado",estado);
        return"ActualizaEstado";
    }
}

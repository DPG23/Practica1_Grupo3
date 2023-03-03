package com.practica1_G3.service.impl;

import com.practica1_G3.dao.EstadoDao;
import com.practica1_G3.domain.Estado;
import com.practica1_G3.service.EstadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoServiceImpl implements EstadoService{
        
    @Autowired
    private EstadoDao estadoDao;

    @Override
    public List<Estado> getEstado() {
       return (List<Estado>) estadoDao.findAll();
    }

    @Override
    public Estado getEstado(Estado estado) {
    return estadoDao.findById(estado.getId_estado()).orElse(null);
   
    }

    @Override
    public void deleteEstado(Estado estado) {
    estadoDao.delete(estado);
    }
    
    @Override
    public void saveEstado(Estado estado) {
    
    estadoDao.save(estado);
    }
    
}


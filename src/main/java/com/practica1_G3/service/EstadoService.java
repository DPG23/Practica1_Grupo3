package com.practica1_G3.service;

import com.practica1_G3.domain.Estado;
import java.util.List;

public interface EstadoService {

    
    public List<Estado> getEstado();
    
    public Estado getEstado(Estado estado);
  
    public void deleteEstado(Estado estado);
    
    public void saveEstado(Estado estado);
    
    
}

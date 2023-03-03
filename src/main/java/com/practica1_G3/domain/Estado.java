
package com.practica1_G3.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="estado")
public class Estado implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_estado;
    
    private String nombre_estado;
    private String capital;
    private String poblacion;
    private String moneda;
    
    public Estado() {
    }

    public Estado( String nombre_estado, String capital, String poblacion, String moneda) {
        this.nombre_estado = nombre_estado;
        this.capital = capital;
        this.poblacion = poblacion;
        this.moneda = moneda;
    }

    
    
    
}

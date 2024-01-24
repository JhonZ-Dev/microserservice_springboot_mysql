package com.example.spring_mysql.modelos;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "java_ofertas_trabajo")
@Data
public class JavaOfertaTrabajos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ofertas_trabajo;
    private String java_oportunidad;
    private String java_descripcion;

    private String java_tags;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "id_usuarios", referencedColumnName = "id_usuarios"),
            @JoinColumn(name = "id_compania", referencedColumnName = "id_compania")
    })
    private JavaCompania javaCompania;


}

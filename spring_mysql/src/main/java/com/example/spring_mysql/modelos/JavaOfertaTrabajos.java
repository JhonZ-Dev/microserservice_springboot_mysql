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
    @JoinColumn(name = "id_company")  // Nombre de la columna que actúa como clave foránea en JavaCompania
    private JavaCompania javaCompania;

    // Relación de muchos a uno con la tabla JavaCompania a través de id_usuarios
    @ManyToOne
    @JoinColumn(name = "id_usuarios")  // Nombre de la columna que actúa como clave foránea en JavaCompania
    private JavaCompania javaCompaniaPorIdUsuarios;

}

package com.example.spring_mysql.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "java_ofertas_trabajo")
public class JavaOfertaTrabajos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ofertas_trabajo;
    private String java_oportunidad;
    private String java_descripcion;

    private String java_tags;

    //relacion de muchos a uno con company y con id_usuario de compañia (la foranea)
    @ManyToOne
    @JoinColumn(name = "id_usuarios")
    private JavaCompania id_usuarios;

    @ManyToOne
    @JoinColumn(name = "id_compania")
    private JavaCompania id_compania;
}

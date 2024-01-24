package com.example.spring_mysql.modelos;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_java_compañia")
@Data
public class JavaCompania {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_compania;
    private String java_actividades;
    private int java_fundacion;
    private String java_descripcion;

    //relacion de uno a uno con usuarios
    //debia aparecer aqui el id_usaurio;
    @OneToOne
    @JoinColumn(name = "id_usuarios")
    private JavaUsuarios id_usuarios; //clave foranea

}

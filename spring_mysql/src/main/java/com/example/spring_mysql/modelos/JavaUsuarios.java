package com.example.spring_mysql.modelos;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_java_usuarios")
@Data
public class JavaUsuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuarios;
    private String java_email;
    private Boolean java_activacion;
    private String java_contrasenia;


}

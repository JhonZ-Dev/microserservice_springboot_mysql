package com.example.spring_mysql.services;

import com.example.spring_mysql.modelos.JavaCompania;
import com.example.spring_mysql.modelos.JavaUsuarios;
import com.example.spring_mysql.repositorios.JavaCompanyRepo;
import com.example.spring_mysql.repositorios.Java_Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompaniaServices {
    @Autowired
    public JavaCompanyRepo repo;
    @Autowired
    public Java_Usuarios usuarios_repo;

    //metodo para guardar con un usuarios
    public JavaCompania guardarConUsuario(JavaCompania javaCompania, Long id_usuarios){
        //verificar si existe el id
        Optional<JavaUsuarios> optional = usuarios_repo.findById(id_usuarios);
        //verificar si existe
        if(optional.isPresent()){
            JavaUsuarios javaUsuarios = optional.get();
            //asignar la compania al usuarios
            javaCompania.setId_usuarios(javaUsuarios);
            //guardar
            JavaCompania guardar = repo.save(javaCompania);
            return guardar;
        }else{
            throw new RuntimeException("No se encontró el usuario con ID: " + id_usuarios);

        }
    }
}

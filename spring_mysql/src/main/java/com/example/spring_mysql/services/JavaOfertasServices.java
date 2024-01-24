package com.example.spring_mysql.services;

import com.example.spring_mysql.modelos.JavaCompania;
import com.example.spring_mysql.modelos.JavaOfertaTrabajos;
import com.example.spring_mysql.repositorios.JavaCompanyRepo;
import com.example.spring_mysql.repositorios.JavaOfertasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JavaOfertasServices {
    @Autowired
    public JavaOfertasRepositorio repositorio;
    @Autowired
    public JavaCompanyRepo javaCompanyRepo;


    //metodo para guardar con usuario y compañia
    //obtener el id_compañia
    public JavaOfertaTrabajos guardar(JavaOfertaTrabajos trabajos,
                                      Long id_compania,
                                      Long id_usuarios){

        //obtener el id_compnia
        Optional<JavaCompania> optional = javaCompanyRepo.findById(id_compania);
        //obtener 

    }
}

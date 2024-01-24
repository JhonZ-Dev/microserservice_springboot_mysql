package com.example.spring_mysql.controladores;

import com.example.spring_mysql.modelos.JavaCompania;
import com.example.spring_mysql.services.CompaniaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/insertar")
public class CompaniaControllerJava {
    @Autowired
    public CompaniaServices services;

    @PostMapping("/guardar/{id_usuario}")
    public JavaCompania guardar(@RequestBody JavaCompania javaCompania,
                                @PathVariable Long id_usuario){
        return services.guardarConUsuario(javaCompania, id_usuario);
    }

}

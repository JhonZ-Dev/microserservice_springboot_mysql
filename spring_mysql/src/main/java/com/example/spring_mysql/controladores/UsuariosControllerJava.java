package com.example.spring_mysql.controladores;

import com.example.spring_mysql.modelos.JavaUsuarios;
import com.example.spring_mysql.services.UsuariosService_JAVA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guardar")
public class UsuariosControllerJava {
    @Autowired
    public UsuariosService_JAVA service_java;
    @PostMapping("/enviar")
    public JavaUsuarios guardar(@RequestBody JavaUsuarios javaUsuarios){
        return service_java.guardar(javaUsuarios);
    }
}

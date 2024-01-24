package com.example.spring_mysql.controladores;

import com.example.spring_mysql.modelos.JavaOfertaTrabajos;
import com.example.spring_mysql.services.JavaOfertasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cargar")
public class TrabajosJavaController {

    @Autowired
    public JavaOfertasServices services;
    @PostMapping("/enviar/{id_compania}/{id_usuario}")
    public JavaOfertaTrabajos guardar(@RequestBody JavaOfertaTrabajos trabajos,
                                      @PathVariable Long id_compania,
                                      @PathVariable Long id_usuario){
        return services.guardar(trabajos, id_compania, id_usuario);
    }

    @PostMapping("/subir")
    public JavaOfertaTrabajos guardar2(@RequestBody JavaOfertaTrabajos trabajos){
        return services.guardarOfertaTrabajo(trabajos);
    }
}

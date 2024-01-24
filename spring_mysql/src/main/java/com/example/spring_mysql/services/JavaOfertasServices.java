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
    public JavaOfertaTrabajos guardar(JavaOfertaTrabajos trabajos, Long id_compania, Long id_usuarios) {
        // Obtener instancias de JavaCompania para id_compania e id_usuarios
        Optional<JavaCompania> optionalCompania = javaCompanyRepo.findById(id_compania);
        Optional<JavaCompania> optionalUsuario = javaCompanyRepo.findById(id_usuarios);

        // Verificar si ambas instancias existen
        if (optionalCompania.isPresent() && optionalUsuario.isPresent()) {
            JavaCompania javaCompania = optionalCompania.get();
            JavaCompania javaUsuario = optionalUsuario.get();

            // Asignar las instancias de JavaCompania a la oferta de trabajo
            trabajos.setJavaCompania(javaCompania);

            // Si necesitas asignar directamente los valores de id_usuarios e id_compania a la oferta de trabajo, hazlo aquí
            // trabajos.setId_usuarios(javaUsuario);
            // trabajos.setId_compania(javaCompania);

            // Guardar la oferta de trabajo
            return repositorio.save(trabajos);
        } else {
            // Manejar el caso en el que alguna de las instancias no existe
            throw new RuntimeException("No se encontró una o ambas instancias de JavaCompania.");
        }
    }
    public JavaOfertaTrabajos guardarOfertaTrabajo(JavaOfertaTrabajos ofertaTrabajo) {
        // Asignar el objeto JavaCompania y valores de las columnas de clave externa
        JavaCompania javaCompania = ofertaTrabajo.getJavaCompania();
        ofertaTrabajo.setJavaCompania(javaCompania);

        // Guardar la oferta de trabajo
        return repositorio.save(ofertaTrabajo);
    }
}

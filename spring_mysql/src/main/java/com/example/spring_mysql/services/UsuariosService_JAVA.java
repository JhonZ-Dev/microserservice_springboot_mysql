package com.example.spring_mysql.services;

import com.example.spring_mysql.modelos.JavaUsuarios;
import com.example.spring_mysql.repositorios.Java_Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosService_JAVA {
    @Autowired
    public Java_Usuarios repo;

    public JavaUsuarios guardar(JavaUsuarios usuarios){
        return repo.save(usuarios);
    }
    //listar
    public List<JavaUsuarios> listar(){
        return repo.findAll();
    }

    //obtener por id
    public Optional<JavaUsuarios> traerPorId(Long id_usuarios){
        return repo.findById(id_usuarios);
    }

    public JavaUsuarios actualizar(JavaUsuarios usuarios) {
        // Verificar si el usuario existe antes de intentar actualizarlo
        Optional<JavaUsuarios> usuarioExistente = repo.findById(usuarios.getId_usuarios());

        if (usuarioExistente.isPresent()) {
            // Actualizar los campos relevantes del usuario existente
            JavaUsuarios usuarioActualizado = usuarioExistente.get();
            usuarioActualizado.setJava_email(usuarios.getJava_email());
            usuarioActualizado.setJava_activacion(usuarios.getJava_activacion());
            usuarioActualizado.setJava_contrasenia(usuarios.getJava_contrasenia());

            // Guardar y devolver el usuario actualizado
            return repo.save(usuarioActualizado);
        } else {
            // El usuario no existe, puedes manejar este caso según tus necesidades (lanzar una excepción, por ejemplo)
            // En este ejemplo, simplemente devolvemos null, pero podrías elegir una mejor estrategia según tus requerimientos.
            return null;
        }
    }

}

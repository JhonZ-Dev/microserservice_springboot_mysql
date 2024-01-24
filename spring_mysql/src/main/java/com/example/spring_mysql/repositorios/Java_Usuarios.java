package com.example.spring_mysql.repositorios;

import com.example.spring_mysql.modelos.JavaUsuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Java_Usuarios extends JpaRepository<JavaUsuarios, Long> {

}

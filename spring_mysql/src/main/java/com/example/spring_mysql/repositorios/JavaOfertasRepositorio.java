package com.example.spring_mysql.repositorios;

import com.example.spring_mysql.modelos.JavaOfertaTrabajos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JavaOfertasRepositorio extends JpaRepository<JavaOfertaTrabajos, Long> {
    
}

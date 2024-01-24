package com.example.spring_mysql.repositorios;

import com.example.spring_mysql.modelos.JavaOfertaTrabajos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JavaOfertasRepositorio extends JpaRepository<JavaOfertaTrabajos, Long> {

}

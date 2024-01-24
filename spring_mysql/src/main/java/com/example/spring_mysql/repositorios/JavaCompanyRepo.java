package com.example.spring_mysql.repositorios;

import com.example.spring_mysql.modelos.JavaCompania;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JavaCompanyRepo extends JpaRepository<JavaCompania, Long> {
}

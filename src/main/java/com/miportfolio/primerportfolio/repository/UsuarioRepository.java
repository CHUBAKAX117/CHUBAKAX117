package com.miportfolio.primerportfolio.repository;

import com.miportfolio.primerportfolio.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Integer> {
    
    
}
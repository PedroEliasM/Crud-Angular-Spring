package com.backend.repository;

import com.backend.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    // O Spring Data JPA fornece métodos CRUD básicos automaticamente
    // Podemos adicionar métodos personalizados se necessário
}
package com.example.demo.Acesso_Ao_Banco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositorio_Cadastro extends JpaRepository<Entidade_cadastro, Long> {
}

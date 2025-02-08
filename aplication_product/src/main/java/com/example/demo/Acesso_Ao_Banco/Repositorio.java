package com.example.demo.Acesso_Ao_Banco;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Repositorio extends CrudRepository<Entidade_Login, Long> {
    Optional<Entidade_Login> findByLoginAndSenha(String login, String senha);

}

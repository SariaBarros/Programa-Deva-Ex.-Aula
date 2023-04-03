package com.example.SVCoorp.repository;

import com.example.SVCoorp.model.Funcionario;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {
    Funcionario findByCpf(String cpf);
}


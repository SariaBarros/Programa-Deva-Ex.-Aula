package com.example.SVCoorp.repository;

import com.example.SVCoorp.model.Despesa;
import org.springframework.data.repository.CrudRepository;

public interface DespesaRepository extends CrudRepository<Despesa, Long> {
    Despesa findByNumeroNF(String numeroNF);
}

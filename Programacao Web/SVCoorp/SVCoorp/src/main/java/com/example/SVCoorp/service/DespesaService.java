package com.example.SVCoorp.service;

import com.example.SVCoorp.model.Despesa;
import com.example.SVCoorp.repository.DespesaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesaService {
    private final DespesaRepository despesaRepository;


    public DespesaService(DespesaRepository despesaRepository) {
        this.despesaRepository = despesaRepository;
    }

    public Despesa salvar(Despesa despesa){
        Despesa despesaEncontrada = despesaRepository.findByNumeroNF(despesa.getNumeroNF());
        if (despesaEncontrada != null){
            throw new IllegalArgumentException();
        }
        return despesaRepository.save(despesa);
    }

    public List<Despesa> listar(){
        return (List<Despesa>) despesaRepository.findAll();
    }

    public Despesa buscar(Long id){
        return despesaRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public Despesa deletar(Long id){
        Despesa despesaDeletada = despesaRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        despesaRepository.deleteById(id);
        return despesaDeletada;
    }

}

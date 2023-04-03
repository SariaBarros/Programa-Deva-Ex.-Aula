package com.example.SVCoorp.service;

import com.example.SVCoorp.model.Funcionario;
import com.example.SVCoorp.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }
    public Funcionario salvar(Funcionario funcionario){
        Funcionario funcionarioEncontrado = funcionarioRepository.findByCpf(funcionario.getCpf());
        if (funcionarioEncontrado != null){
            throw new IllegalArgumentException();
        }

        return funcionarioRepository.save(funcionario);
    }
    public List<Funcionario> listar(){
       return (List<Funcionario>) funcionarioRepository.findAll();
    }

    public Funcionario buscar(Long id){
        return funcionarioRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public Funcionario deletar(Long id){
        Funcionario funcionarioDeletado = funcionarioRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        funcionarioRepository.deleteById(id);
        return funcionarioDeletado;
    }
}

package com.example.SVCoorp.service;

import com.example.SVCoorp.model.User;
import com.example.SVCoorp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User salvar(User usuario){
        //regras de validacao
        User usuarioCadastrado = userRepository.findByCpf(usuario.getCpf());
        if (usuarioCadastrado != null){
            throw new IllegalArgumentException();
        }
        return userRepository.save(usuario);
    }

    public List<User> listar(){
        return (List<User>) userRepository.findAll();
    }

    public User buscar(Long id) {
        return userRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public User deletar(Long id){
        User userDeletado = userRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        userRepository.deleteById(id);
        return userDeletado;
    }
}

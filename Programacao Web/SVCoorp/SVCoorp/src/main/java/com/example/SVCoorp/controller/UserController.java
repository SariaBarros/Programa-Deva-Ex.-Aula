package com.example.SVCoorp.controller;

import com.example.SVCoorp.model.User;
import com.example.SVCoorp.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User salvar(@RequestBody User usuario){
       User usuarioSalvo = null;

        try {
            usuarioSalvo = userService.salvar(usuario);
        } catch (IllegalArgumentException exception){
            System.out.println("CPF já cadastrado");
        }

        return usuario;
    }
    @GetMapping("/listar")
    public List<User> listar(){
        return userService.listar();
    }
    @GetMapping("/{id}")
    public User buscar(@PathVariable Long id){
        return userService.buscar(id);
    }
    @DeleteMapping("/{id}")
    public User deletar(@PathVariable Long id){
        return userService.deletar(id);
    }
}

package com.example.SVCoorp.repository;


import com.example.SVCoorp.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByCpf(String cpf);
}

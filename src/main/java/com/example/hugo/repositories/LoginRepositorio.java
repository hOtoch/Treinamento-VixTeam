package com.example.hugo.repositories;

import com.example.hugo.Model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepositorio extends JpaRepository<Login,Long> {
    Login findLoginByEmail(String email);

    Login findLoginByPassword(String password);
}

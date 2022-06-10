package com.example.hugo.services;

import com.example.hugo.Model.Cliente;
import com.example.hugo.Model.Login;
import com.example.hugo.repositories.LoginRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepositorio loginRepositorio;

    @Override
    public void adicionaLogin (Login login){
        loginRepositorio.save(login);
    }

    @Override
    public Login getLoginByEmail(String email){
        return loginRepositorio.findLoginByEmail(email);
    }

    @Override
    public Login getLoginByPassword(String password){
        return loginRepositorio.findLoginByPassword(password);
    }
}

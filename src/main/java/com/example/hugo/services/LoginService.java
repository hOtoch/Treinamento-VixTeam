package com.example.hugo.services;

import com.example.hugo.Model.Login;

public interface LoginService {

    void adicionaLogin (Login login);
    Login getLoginByEmail(String email);
    Login getLoginByPassword(String password);
}

package com.example.hugo.Controller;

import com.example.hugo.Model.Login;
import com.example.hugo.repositories.LoginRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginRepositorio loginRepositorio;


    @PostMapping("/buscarLogin")
    public String buscarLogin(@RequestParam String email,@RequestParam String password){
        Login emailLogin = loginRepositorio.findLoginByEmail(email);
        Login passLogin = loginRepositorio.findLoginByPassword(password);

        if(passLogin == null || emailLogin == null){
            return "Usuário não cadastrado.";
        }else{
            if(emailLogin == passLogin){
                return "Usuário encontrado.";
            }
        }
        return "Email ou senha inválidos.";

    }

    @PostMapping("/adicionarLogin")
    public String adicionarLogin(@RequestParam String email, @RequestParam String password){

        if(loginRepositorio.findLoginByEmail(email) != null){
            return "Email já cadastrado, por favor informe outro";
        }else{
            Login login = new Login(email,password);
            loginRepositorio.save(login);
        }

        return "Login criado com sucesso";

    }
}

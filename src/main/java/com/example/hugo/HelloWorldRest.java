package com.example.hugo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRest {
    @GetMapping("/buscarUsuario")
    public String buscar(@RequestParam(name="fname") String nome) {
        // criar objeto cliente
        String [] bancoClientes = { "Jose" , "RodolFo" , "LUIZ"};

        boolean retorno = false;

        for(int i = 0; i < bancoClientes.length; i++){
            if(bancoClientes[i].equalsIgnoreCase(nome)){
                retorno = true;
            }
        }

        return retorno ? "Ok" : "Não";
    }
}

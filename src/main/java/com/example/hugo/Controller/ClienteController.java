package com.example.hugo.Controller;

import com.example.hugo.Model.Cliente;
import com.example.hugo.services.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.json.JSONObject;
import java.util.List;



@RestController
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteService;


    @GetMapping("/buscarUsuario")
    public String buscar(@RequestParam(name="fname") String nome,@RequestParam(name="sname") String sobrenome,@RequestParam(name="email") String email,@RequestParam(name="data") String data,
                         @RequestParam(name="cpf") String cpf,@RequestParam(name="estado") String estado,@RequestParam(name="sexo") String sexo) {

        List<Cliente> clientesEncontrados = clienteService.getClienteByNome(nome);

        JSONObject clienteJson = null;
        if(!clientesEncontrados.isEmpty()){
            clienteJson = new JSONObject(clientesEncontrados.get(0));

        }

        if(clientesEncontrados.size() == 0){
            return "stringteste";
        }else {
            return clienteJson.toString();
        }

       // return !clientesEncontrados.isEmpty() ? clienteJson.toString() : "null";

        //return sexo;

    }
}

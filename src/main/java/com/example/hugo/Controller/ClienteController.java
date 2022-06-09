package com.example.hugo.Controller;

import com.example.hugo.Model.Cliente;
import com.example.hugo.services.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.json.JSONObject;
import java.util.List;



@RestController
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteService;


    @GetMapping ("/buscarUsuario")
    public String buscar(@RequestParam String nome,@RequestParam  String sobrenome,@RequestParam String email,@RequestParam String data,
                         @RequestParam String cpf,@RequestParam  String estado,@RequestParam String sexo) {


            List <Cliente> clienteEncontrados = clienteService.getClienteByNome(nome);

            JSONObject clienteJson = null;
            if(clienteEncontrados != null){
                clienteJson = new JSONObject(clienteEncontrados.get(0));

            }

            return clienteEncontrados != null ? clienteJson.toString() : "null";

    }

    @PostMapping("/adicionarUsuario")
    public String adicionar(@RequestParam String nome,@RequestParam String sobrenome,@RequestParam String email,@RequestParam String data,
                            @RequestParam String cpf,@RequestParam String estado,@RequestParam String sexo) {

        if(clienteService.getClienteByCpf(cpf) != null){
            return "CPF já cadastrado. Por favor insira um novo ou faça uma busca por esse usuário";
        } else if(clienteService.getClienteByEmail(email) != null){
            return "Email já cadastrado. Por favor insira um novo ou faça uma busca por esse usuário";
        }else {

            Cliente newCliente = new Cliente(nome, sobrenome, email, cpf, data, estado, sexo);

            clienteService.adicionaCliente(newCliente);

            JSONObject clienteJson = new JSONObject(newCliente);

            return "Cliente adicionado com sucesso!";
        }
    }

    @GetMapping("/removerUsuario")
    public String remover(@RequestParam(name="cpf") String cpf){
        Cliente oldCliente = clienteService.getClienteByCpf(cpf);

        clienteService.removeCliente(oldCliente);

        return "Cliente removido com sucesso!";
    }
}

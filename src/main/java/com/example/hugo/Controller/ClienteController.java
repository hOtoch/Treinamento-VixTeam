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
    public String buscar(@RequestParam String cpf) {

            Cliente clienteEncontrado = clienteService.getClienteByCpf(cpf);

            if(clienteEncontrado == null){
                return "Cliente não encontrado";
            }else {
                return clienteEncontrado.toString();
            }
    }

    @GetMapping("/alterarUsuario")
    public String alterar(@RequestParam String email,@RequestParam String cpf) {

        if(buscar(cpf) == "Cliente não encontrado"){
            return "Cliente não encontrado";
        }else if(clienteService.getClienteByEmail(email) !=null) {
            return "Email já cadastrado. Por favor insira um novo ou faça uma busca por esse usuário";
        }else{
            if(clienteService.updateEmailByCPF(cpf,email) > 0){
                return "Email do cliente alterado com sucesso!";
            }else{
                return "Nenhum email foi alterado!";
            }

        }

    }

    @PostMapping("/adicionarUsuario")
    public String adicionar(@RequestParam String nome,@RequestParam String email,@RequestParam String cpf,@RequestParam String estado) {

        if(clienteService.getClienteByCpf(cpf) != null){
            return "CPF já cadastrado. Por favor insira um novo ou faça uma busca por esse usuário";
        } else if(clienteService.getClienteByEmail(email) != null){
            return "Email já cadastrado. Por favor insira um novo ou faça uma busca por esse usuário";
        }else {

            Cliente newCliente = new Cliente(nome, email, cpf, estado);

            clienteService.adicionaCliente(newCliente);

            //JSONObject clienteJson = new JSONObject(newCliente);
            return "Cliente adicionado com sucesso!";

        }

    }

    @GetMapping("/removerUsuario")
    public String remover(@RequestParam String cpf){
        Cliente oldCliente = clienteService.getClienteByCpf(cpf);

        if(oldCliente == null){
            return "Cliente não encontrado no nosso banco de dados.";
        }else{
            clienteService.removeCliente(oldCliente);
            return "Cliente removido com sucesso!";
        }



    }
}

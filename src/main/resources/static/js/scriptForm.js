
// Função para adicionar um cliente no banco de dados através de um POST
function adicionarCliente() {

    var nome = document.getElementById("nome").value;
    var cpf = document.getElementById("cpf").value;
    var estado = document.getElementById("estado").value;
    var email = document.getElementById("email").value;


    formData = new FormData();

    if(nome=="" || cpf == "" || estado == "" || email == ""){
        window.alert("Todos os campos devem ser informados");
    }else {
        xhttp = new XMLHttpRequest();
        xhttp.open("POST", "/adicionarUsuario", true);
        //Adiciona os pares chave/valor
        formData.append("nome", nome);
        formData.append("email", email);
        formData.append("cpf", cpf);
        formData.append("estado", estado);

        xhttp.onload = function () {
           window.alert(this.responseText);
           if(this.responseText=="Cliente adicionado com sucesso!"){
               adicionaClienteTabela(nome,cpf,estado,email);
               closeModalCadastro();
           }
        }

        xhttp.send(formData);
    }

}


// Função de buscar o cliente no banco de dados através do CPF
function buscarCliente() {
    var cpf = document.getElementById("cpfBuscar").value;

    if(cpf==""){
        window.alert("Informe o CPF do cliente desejado");
    }else{
        xhttp = new XMLHttpRequest();
        xhttp.open("GET","/buscarUsuario?cpf=" + cpf);
        xhttp.onload = function (){

            document.getElementById("modal-instruction1").textContent = this.responseText;
            //showResultsBusca(this.responseText);
            //closeModalBusca();
        }

        xhttp.send();
    }

}

function alterarCliente(){
    var cpf = document.getElementById("cpfAlterar").value;
    var email = document.getElementById("emailAlterar").value;

    if(cpf==""){
        window.alert("Informe o CPF do cliente que deseja alterar o email");
    }else if(email==""){
        window.alert("Informe o novo email do cliente");
    } else{
        xhttp = new XMLHttpRequest();
        xhttp.open("GET","/alterarUsuario?cpf=" + cpf + "&&email=" + email);
        xhttp.onload = function () {
            document.getElementById("modal-instruction3").textContent =  this.responseText;
            alteraClienteTabela(cpf,email);
        }

        xhttp.send();
    }
}

function removerCliente(){
    var cpf = document.getElementById("cpfRemover").value;


    if(cpf==""){
        window.alert("Informe o CPF do cliente que deseja excluir");
    }else{
        xhttp = new XMLHttpRequest();
        xhttp.open("GET","/removerUsuario?cpf=" + cpf);
        xhttp.onload = function (){

            document.getElementById("modal-instruction2").textContent = this.responseText;
            if(this.responseText=="Cliente removido com sucesso!"){
                removeClienteTabela(cpf);
            }
            //showResultsBusca(this.responseText);
            //closeModalBusca();
        }

        xhttp.send();
    }
}


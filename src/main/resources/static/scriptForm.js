
function adicionarCliente() {

    var nome = document.getElementById("fNameId").value;
    var sobrenome = document.getElementById("sNameId").value;
    var cpf = document.getElementById("cpf").value;
    var estado = document.getElementById("estado").value;
    var sexo = document.querySelector('input[name="sexo"]:checked').value;
    var dataN = document.getElementById("dataNasc").value;
    var email = document.getElementById("email").value;

    formData = new FormData();

    if(nome=="" || sobrenome=="" || cpf == "" || estado == "" || sexo == "" || dataN == "" || email == ""){
        window.alert("Todos os campos devem ser informados");
    }else{
        xhttp = new XMLHttpRequest();
        xhttp.open("POST","/adicionarUsuario",true);
        //Adiciona os pares chave/valor
        formData.append("nome",nome);
        formData.append("sobrenome",sobrenome);
        formData.append("email",email);
        formData.append("data",dataN);
        formData.append("cpf",cpf);
        formData.append("estado",estado);
        formData.append("sexo",sexo);

        xhttp.onload = function(){
            document.getElementById("resposta_span_id").textContent = this.responseText;
        }

        xhttp.send(formData);
    }



}

function buscarCliente(){
    // xhttp.open("GET","/buscarUsuario?fname=\"+nome+\"&&sname=\"+sobrenome+\"&&email=\"+email +\"&&data=\"+dataN+\"&&cpf=\"+cpf+\"&&estado=\"+estado\n" +
    //     "    +\"&&sexo=\"+sexo");
}


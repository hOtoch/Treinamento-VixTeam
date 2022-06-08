function buscarCliente() {
    var nome = document.getElementById("fNameId").value;
    var sobrenome = document.getElementById("sNameId").value;
    var cpf = document.getElementById("cpf").value;
    var estado = document.getElementById("estado").value;
    var sexo = document.querySelector('input[name="sexo"]:checked').value;
    var dataN = document.getElementById("dataNasc").value;
    var email = document.getElementById("email").value;

    const xhttp = new XMLHttpRequest();
    xhttp.onload = function(){

        document.getElementById("resposta_span_id").textContent = this.responseText;


    }
    xhttp.open("GET","/buscarUsuario?fname="+nome+"&&sname="+sobrenome+"&&email="+email +"&&data="+dataN+"&&cpf="+cpf+"&&estado="+estado
    +"&&sexo="+sexo);
    xhttp.send();
}


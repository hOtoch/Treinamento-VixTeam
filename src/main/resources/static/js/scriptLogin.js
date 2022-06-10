function Replace(){
    location.replace("/form");
}

function verificaLogin(){
    var email = document.getElementById("email").value;
    var pass = document.getElementById("password").value;

    formData =  new FormData();

    if(email == "" || pass == ""){
        window.alert("Informe todos os campos");
    }else{
        xhttp = new XMLHttpRequest();
        xhttp.open("POST","/buscarLogin",true);

        formData.append("email",email);
        formData.append("password",pass);

        xhttp.onload = function (){
            if(this.responseText == "Usuário não cadastrado." || this.responseText == "Email ou senha inválidos."){
                window.alert(this.responseText);
            }else{
                Replace();
            }
        }
    }

    xhttp.send(formData);
}

function adicionaLogin(){
    var email = document.getElementById("emailReg").value;
    var pass = document.getElementById("passReg").value

}
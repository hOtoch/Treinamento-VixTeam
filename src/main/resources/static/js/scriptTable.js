function adicionaClienteTabela(nome,cpf,estado,email){
    var clientes = document.getElementById("clientesTb");
    var qtdLinhas = clientes.rows.length;
    var linha = clientes.insertRow(qtdLinhas);

    var cellCodigo = linha.insertCell(0);
    var cellNome = linha.insertCell(1);
    var cellEmail = linha.insertCell(2);
    var cellCpf = linha.insertCell(3);
    var cellEstado = linha.insertCell(4);


    cellCodigo.innerHTML = qtdLinhas;
    cellNome.innerHTML = nome;
    cellCpf.innerHTML = cpf;
    cellEmail.innerHTML = email;
    cellEstado.innerHTML = estado;

    //preencheCampoForm();
}

function removeClienteTabela(cpf){
    var clientesTb = document.getElementById("clientesTb");

    for(var i = 1; i < clientesTb.rows.length; i++){
        index = clientesTb.rows[i].rowIndex;

        if(clientesTb.rows[index].cells[3].innerText == cpf){
            clientesTb.deleteRow(index);
            return;
        }

    }

}

function alteraClienteTabela(cpf,email){
    var clientesTb = document.getElementById("clientesTb");

    for(var i = 1; i < clientesTb.rows.length; i++){
        index = clientesTb.rows[i].rowIndex;

        if(clientesTb.rows[index].cells[3].innerText == cpf){
            clientesTb.rows[index].cells[2].innerText = email;
            return;
        }

    }
}
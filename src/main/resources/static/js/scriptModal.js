// Abrindo e fechando o modal de Cadastro
const openModalCadastro = () => document.getElementById('modalCadastro')
    .classList.add('active')

const closeModalCadastro = () => document.getElementById('modalCadastro')
    .classList.remove('active')

document.getElementById('cadastrarCliente')
    .addEventListener('click', openModalCadastro)

document.getElementById('modalCadastroClose')
    .addEventListener('click', closeModalCadastro)

// Abrindo e fechando o modal de Busca

const openModalBusca = () => {document.getElementById('modalBusca')
    .classList.add('active')
    document.getElementById("modal-instruction1").textContent =  "Insira o CPF do cliente que deseja buscar"}

const closeModalBusca = () => document.getElementById('modalBusca')
    .classList.remove('active')

document.getElementById('buscarCliente')
    .addEventListener('click', openModalBusca)

document.getElementById('modalBuscaClose')
    .addEventListener('click', closeModalBusca)

// Abrindo e fechando o modal de Remove

const openModalRemove = () => {document.getElementById('modalRemove')
    .classList.add('active')
    document.getElementById("modal-instruction2").textContent =  "Insira o CPF do cliente que deseja remover"}

const closeModalRemove = () => document.getElementById('modalRemove')
    .classList.remove('active')

document.getElementById('removerCliente')
    .addEventListener('click', openModalRemove)

document.getElementById('modalRemoveClose')
    .addEventListener('click', closeModalRemove)

// Abrindo e fechando o modal de Alterar

const openModalAltera = () => {document.getElementById('modalAltera')
    .classList.add('active')
    document.getElementById("modal-instruction3").textContent = "Insira o CPF do cliente que deseja alterar e seu novo Email"}

const closeModalAltera = () => document.getElementById('modalAltera')
    .classList.remove('active')

document.getElementById('alterarCliente')
    .addEventListener('click', openModalAltera)

document.getElementById('modalAlteraClose')
    .addEventListener('click', closeModalAltera)

// Abrindo e fechando o modal de RegistroLogin

const openModalRegistro = () => {document.getElementById('modalRegistro')
    .classList.add('active')
    console.log("ENTROU");}

const closeModalRegistro = () => document.getElementById('modalRegistro')
    .classList.remove('active')

document.getElementById('registraLogin')
    .addEventListener('click', openModalRegistro)

document.getElementById('modalRegistroClose')
    .addEventListener('click', closeModalRegistro)

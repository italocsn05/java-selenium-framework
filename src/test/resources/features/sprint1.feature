# language: pt
# author: Italo - Cabral
# date: 15/12/2021

  Funcionalidade: Criação de usuários

    @web
    Cenário: Valida a criação de usuário com informações enviadas do BDD
      Dado na tela Home eu clique no botão "Começar Automação Web"
      E na tela Lista de Funcionalidades eu clique no botão "Formulário"
      E na tela Lista de Funcionalidades eu clique no botão "Criar Usuários"
      E na tela Novo Usuário eu preencha o campo "Nome" com o valor "Italo"
      E na tela Novo Usuário eu preencha o campo "Último Nome" com o valor "Cabral"
      E na tela Novo Usuário eu preencha o campo "Email" com o valor "italocsn05@gmail.com"
      E na tela Novo Usuário eu preencha o campo "Endereço" com o valor "Av. Paulista, Nº7070"
      E na tela Novo Usuário eu preencha o campo "Universidade" com o valor "Fatec Franco Da Rocha"
      E na tela Novo Usuário eu preencha o campo "Profissão" com o valor "Analista de Testes"
      E na tela Novo Usuário eu preencha o campo "Gênero" com o valor "Masculino"
      E na tela Novo Usuário eu preencha o campo "Idade" com o valor "23"
      Quando na tela Novo Usuário eu clique no botão "Criar"
      Então na tela Usuário Criado eu visualizo a mensagem "Usuário Criado com sucesso"
#author: Italo-Cabral
#language: pt
#date: 11-24-2021
  Funcionalidade: Realiza testes de fluxo do site automação combatista.

    @web
    Cenário: Verifica o cadastro de um novo usuário preenchendo todos os campos do formulário.
      Dado cliquei no botão "Começar automação web"
      E cliquei no botão "Formulário"
      E cliquei no botão "Criar usuários"
      E preenchi o campo "Nome"
      E preenchi o campo "Último nome"
      E preenchi o campo "Email"
      E preenchi o campo "Endereço"
      E preenchi o campo "Universidade"
      E preenchi o campo "Profissão"
      E preenchi o campo "Gênero"
      E preenchi o campo "Idade"
      Quando cliquei no botão "Criar"
      Então a mensagem "Usuário Criado com sucesso" é exibida

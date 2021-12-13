# language: pt
# author: Italo Cabral
# date: 13/12/2021

  Funcionalidade: Google

    @web
    Cenário: Valida o titulo da página do Google
      Dado eu faça uma pesquisa por "Italo Cabral" no Google
      Então O titulo da página contem o título "Italo Cabral - Pesquisa Google"
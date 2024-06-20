# Iphone UML Diagram
Projeto criado para o desafio de POO do Bootcamp Santander 2024.

## Diagrama UML - Iphone DIO
```mermaid
classDiagram
    Iphone --* ReprodutorMusical
    Iphone --* AparelhoTelefonico
    Iphone --* NavegadorInternet
    class Iphone{
        -String serialNumber
        -String Model
        +turnOn()
        +turnOff()
        +openApp()
    }
    class ReprodutorMusical{
        +tocar()
        +pausar()
        +selecionarMusica()
        +proximaMusica()
        +musicaAnterior()
    }
    class AparelhoTelefonico{
        +ligar()
        +atender()
        -iniciarCorreioVoz()
    }
    class NavegadorInternet{
        +exibirPagina()
        +adicionarNovaAba()
        +atualizarPagina()
    }

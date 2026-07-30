package org.example;

abstract class Smartphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {

    abstract void ligar();
    abstract void reiniciar();
    abstract void exibirInfo();
    abstract void desligar();

}

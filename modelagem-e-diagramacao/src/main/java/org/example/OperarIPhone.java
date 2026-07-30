package org.example;


public class OperarIPhone {

    public static void main(String[] args) {

        IPhone meuIPhone = new IPhone();

        System.out.println("=== TESTANDO SMARTPHONE ===\n");

        meuIPhone.ligar();
        meuIPhone.exibirInfo();

        System.out.println("\n=== TESTANDO REPRODUTOR MUSICAL ===");
        meuIPhone.play();
        meuIPhone.pause();
        meuIPhone.next();
        meuIPhone.back();

        System.out.println("\n=== TESTANDO APARELHO TELEFÔNICO ===");
        meuIPhone.atender();
        meuIPhone.discar("1199999-9999");
        meuIPhone.recados();
        meuIPhone.encerrarLigacao();

        System.out.println("\n=== TESTANDO NAVEGADOR DE INTERNET ===");
        meuIPhone.buscar("www.google.com");
        meuIPhone.favoritos();
        meuIPhone.voltar();
        meuIPhone.novaAba();
        meuIPhone.fecharAba();
        meuIPhone.fechar();

        System.out.println("\n=== INFORMAÇÕES FINAIS ===");
        meuIPhone.exibirInfo();

        System.out.println("\n=== REINICIANDO SMARTPHONE ===");
        meuIPhone.reiniciar();

        System.out.println("\n=== DESLIGANDO ====");
        meuIPhone.desligar();
    }

}

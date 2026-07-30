package org.example;

public class IPhone extends Smartphone {
    @Override
    void ligar() {
        System.out.println("iPhone ligado.");
    }

    @Override
    void reiniciar() {
        System.out.println("iPhone reiniciado.");
    }

    @Override
    void exibirInfo() {
        System.out.println("Informações do iPhone:");
        System.out.println("Modelo: iPhone 14");
        System.out.println("Sistema Operacional: iOS 17");
        System.out.println("Capacidade de Armazenamento: 256GB");
    }

    @Override
    void desligar() {
        System.out.println("iPhone desligado.");
    }

    @Override
    public void buscar(String url) {
        System.out.println("Buscando: " + url);
    }

    @Override
    public void novaAba() {
        System.out.println("Nova aba aberta.");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando navegador.");
    }

    @Override
    public void fecharAba() {
        System.out.println("Fechando aba.");

    }

    @Override
    public void home() {
        System.out.println("Voltando para a página inicial.");
    }

    @Override
    public void favoritos() {
        System.out.println("Mostrando favoritos.");
    }

    @Override
    public void voltar() {
        System.out.println("Voltando para a página anterior.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação.");
    }

    @Override
    public void encerrarLigacao() {
        System.out.println("Encerrando a ligação.");
    }

    @Override
    public void discar(String numero) {
        System.out.println("Discando: " + numero);
    }

    @Override
    public void recados() {
        System.out.println("Consultando recados.");
    }

    @Override
    public void play() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pause() {
        System.out.println("Pausando música.");
    }

    @Override
    public void next() {
        System.out.println("Próxima música.");
    }

    @Override
    public void back() {
        System.out.println("Música anterior.");
    }
}
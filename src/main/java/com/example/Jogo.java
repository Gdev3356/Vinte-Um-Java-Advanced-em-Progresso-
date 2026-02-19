package com.example;

public class Jogo {

    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new Computador();

    public Jogo(){
        monte.embaralhar();
    }

    public Carta distribuirCartaParaJogador(Jogador jogador){
        if (jogador.parou()) return  null;

        var carta = monte.virar();
        jogador.receberCarta(carta);
        return carta;
    }

    public boolean acabou(){
        if (jogador.getPontos() > 21 || computador.getPontos() > 21) return true;
        if ((jogador.parou()) && computador.parou()) return true;

        return  false;
    }

    public String resutado(){
        var jogadorEstorou = jogador.getPontos() > 21;
        var computadorEstorou = computador.getPontos() > 21;

        if (jogador.getPontos() == computador.getPontos()) return "Empatou";
        if (jogadorEstorou && computadorEstorou) return "Empatou";

        if (jogador.getPontos() > computador.getPontos() && !jogadorEstorou) return "Você ganhou!";
        if (computadorEstorou) return  "Você Ganhou!";

        return  "Você Perdeu!";
    }
}

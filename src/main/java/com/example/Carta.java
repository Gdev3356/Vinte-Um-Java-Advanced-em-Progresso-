package com.example;

public class Carta {

    private int numero;
    private Naipe naipe = Naipe.Hearts;

    public Carta(int numero, Naipe naipe){
        this.numero = numero;
        this.naipe = naipe;

    }

    public String imagePath() {
        String prefixo = numero + "";
        if (numero == 1) prefixo = "Ace";
        if (numero == 11) prefixo = "Jack";
        if (numero == 13) prefixo = "King";

        return "classic-cards/" + numero + naipe + ".png";
    }

    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }

}

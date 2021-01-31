/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Irene
 */
public class Mobile implements Articolo{
    
    private final String nome;
    private final double prezzo;
    final int lunghezza;
    final int altezza;
    final int profondita;

    public Mobile(String nome, double prezzo, int lunghezza, int altezza, int profondita) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.lunghezza = lunghezza;
        this.altezza = altezza;
        this.profondita = profondita;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getProfondita() {
        return profondita;
    }
    
    

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getPrezzo() {
        return this.prezzo;
    }

    @Override
    public String toString() {
        return "Mobile{" + "nome=" + nome + ", prezzo=" + prezzo + ", lunghezza=" + lunghezza + ", altezza=" + altezza + ", profondita=" + profondita + '}';
    }
    
    
}

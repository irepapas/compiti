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
 * @param <E>
 */
public class Catalogo<E extends Articolo> implements Iterable<E>{
    
    private final List<E> catalogoArticoli;

    public <E extends Articolo> Catalogo() {
        this.catalogoArticoli = new ArrayList<>();
    }
    
    public void aggiungiArticolo(E art){
        catalogoArticoli.add(art);
        
    }
    
    public Catalogo<E> getArticoliSottoPrezzo(double prezzo) {
        Catalogo<E> articoli = new Catalogo<>();
        Iterator<E> it= this.catalogoArticoli.iterator();
        while(it.hasNext()){
            E elenco =it.next();
            if(elenco.getPrezzo()<prezzo){
                articoli.aggiungiArticolo(elenco);
            }
        }
        return articoli;
    }

    @Override
    public String toString() {
        String catalogo="Catalogo Articoli";
        catalogo+="----------------------\n";
        Iterator<E> it= this.catalogoArticoli.iterator();
        while(it.hasNext()){
            E elenco=it.next();
            catalogo+= elenco.toString()+"\n";
        }
        return catalogo;
    }

    @Override
    public Iterator<E> iterator() {
       return new CatalagoIterator();
    }

    private class CatalagoIterator implements Iterator<E> {
        
        private int idx;

        public CatalagoIterator() {
            idx=0;
        }

        @Override
        public boolean hasNext() {
           return idx<catalogoArticoli.size()-1;
        }

        @Override
        public E next() {
            return catalogoArticoli.get(idx++);
        }
    }
    
    
    
}

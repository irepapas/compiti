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
public class ProvaMobile extends Mobile{
    
        /**
         *
         * @param <E>
         * @param catalogo
         * @param prezzo
         * @param larghezza
         * @param altezza
         * @param profondita
         * @return
         */
       public  <E extends Mobile> List<E> ScegliMobile( Catalogo<E> catalogo,double  prezzo, int larghezza, int altezza, int profondita){
        
        List<E> selezionati = new ArrayList<E>();
        
        List<E> selezionatiPerPrezzo = (List<E>) catalogo.getArticoliSottoPrezzo(prezzo);
        Iterator<E> it= selezionatiPerPrezzo.iterator();
        while(it.hasNext()){
            E elenco = it.next();
            if(elenco.getLunghezza()< lunghezza && elenco.getAltezza()< altezza && elenco.getProfondita()<profondita ){
                selezionati.add(elenco);
            }
        }
        return selezionati;
       }
    
}

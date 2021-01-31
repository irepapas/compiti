/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizi;

/**
 *
 * @author Irene
 */
public interface Articolo {
    
    String getNome();
    double getPrezzo();

    @Override
    public String toString();
   
}

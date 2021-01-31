/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Irene
 */
public class App {

    public static void main(String[] args) {
            
            
    }
  public static <T extends Number> List<T> minoriDi(T[] arr, T el) {
        List<T> minori = new ArrayList<T>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].doubleValue() < el.doubleValue()) {
                minori.add(arr[i]);
            }
        }
        return minori;
  }
}

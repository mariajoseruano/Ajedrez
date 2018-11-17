/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesalandalus.programacion.caballoajedrez;

/**
 *
 * @author Usuario
 */
public class Posicion {
    
    private int fila;
    private char columna;

    // Constructor que inicializa todos los atributos a través de parámetros
    
       
    //Getter fila:Método que devuelve el valor de una fila
    public int getfila(){
	return fila;
    }

    //Getter columna:Método que devuelve el valor de una columna
    public char getcolumna(){
	return columna;
    }

    // Setter fila:Método que modifica la fila
     public void setfila(int fila) 
    {
        if (fila<=0 || fila>8)
            this.fila = fila;
        else
     
            throw new IllegalArgumentException("La fila introducida como parámetro no es válida");            
    }
   // Setter columna
     public void setcolumna(char columna) 
    {
        if (columna<a || columna>=i)
            this.columna= columna;
        else
            throw new IllegalArgumentException("La columna introducida como parámetro no es válida");            
    }
        
}

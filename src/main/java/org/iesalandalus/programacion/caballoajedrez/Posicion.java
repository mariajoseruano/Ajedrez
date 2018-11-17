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
    public int getFila(){
	return fila;
    }

    //Getter columna:Método que devuelve el valor de una columna
    public char getColumna(){
	return columna;
    }

    // Setter fila:Método que modifica la fila
     public void setFila(int fila) 
    {
        if (fila<=0 || fila>8)
            this.fila = fila;
        else
     
            throw new IllegalArgumentException("La fila introducida como parámetro no es válida");            
    }
   // Setter columna
     public void setColumna(char columna) 
    {
       if (columna<'a' || columna>='i')
            this.columna= columna;
        else
            throw new IllegalArgumentException("La columna introducida como parámetro no es válida");            
    }
       // Ejercicio: 7.Constructor que inicializa todos los atributos a través de parámetros
    
       public Posicion ( int fila, char columna)
        {  
    
        setFila(fila);
        setColumna(columna);
        }
       
       
       
}

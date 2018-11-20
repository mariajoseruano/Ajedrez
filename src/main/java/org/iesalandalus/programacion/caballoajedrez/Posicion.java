/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesalandalus.programacion.caballoajedrez;

import java.util.Objects;

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
        if (fila<0 || fila>8)
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
       
        //Ejercicio 8 Constructor Copia
         public Posicion(final Posicion pos)
        {
        //Comprobamos que el objeto pasado como parámetro no es nulo
        if (pos==null)
            throw new IllegalArgumentException("ERROR: La posicion pasada como parámetro es null");
        
        this.fila=pos.fila;
        this.columna=pos.columna;
        }
         // Ejercicio 9: Método equals: comparar la igualdad de dos objetos de esta clase
         
        public boolean equals(Posicion pos) {
           
            if (pos.getFila() == this.fila && pos.getColumna()==this.columna ){

                return true;
            }else{
                return false;
            }
        }
        
        //Ejercicio 10: Método toString devolver un String y será la representación de fila y columna.
        
        
        
        public String toString() 
        {
		return "Posicion [fila=" + fila + ", columna=" + columna + "]";
	}

}

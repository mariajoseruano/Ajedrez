/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesalandalus.programacion.caballoajedrez;

import java.util.Objects;

/*/Ejericio 5. Crea clase posicion con atributos
 *
 * @author Usuario
 */
public class Posicion {
    
    private int fila;
    private char columna;

    // Ejericio 6. Crea métodos set y getter
    
       
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
        if (fila>=0 || fila<=8)
            this.fila = fila;
        else
     
            throw new IllegalArgumentException("La fila introducida como parámetro no es válida");            
    }
   // Setter columna
     public void setColumna(char columna) 
    {
       if (columna>='a' || columna<'i')
            this.columna= columna;
        else
            throw new IllegalArgumentException("La columna introducida como parámetro no es válida");            
    }
       // Ejercicio: 7.Constructor que inicializa todos los atributos a través de parámetros

        public Posicion(int fila, char columna) {
            
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.fila;
        hash = 23 * hash + this.columna;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Posicion other = (Posicion) obj;
        if (this.fila != other.fila) {
            return false;
        }
        if (this.columna != other.columna) {
            return false;
        }
        return true;
    }
         
       
        
        
        
        //Ejercicio 10: Método toString devolver un String y será la representación de fila y columna.

    @Override
    public String toString() {
        return "Posicion{" + "fila=" + fila + ", columna=" + columna + '}';
    }
        
        
        
        

}

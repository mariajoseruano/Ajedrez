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
public class Caballo {
    
    private Color color; // enumerado
    private Posicion posicion; //Clase posicion
     
       
// Ejercicio 12: Método get y set para cada atributo
    
//Getter fila:Método que devuelve el valor de un color
    public Color getColor(){
	return color;
    }

    //Getter posicion:Método que devuelve el valor de una posicion
    public Posicion getPosicion(){
	return posicion;
    }

    // Setter color:Método que modifica el color
     public void setColor(Color color) 
    {
        if (color==null)
            throw new IllegalArgumentException("ERROR: No es posible asignar un color nulo.");
        
        this.color=color;           
    }
   // Setter columna;Método que modifica una posicion
     
     public void setPosicion(Posicion posicion) 
    {
      //Comprobamos que el objeto pasado como parámetro no es nulo
        if (posicion==null)
            throw new IllegalArgumentException("ERROR: La posicion pasada como parámetro es nula");
        
        this.posicion= posicion;
    }
    
}

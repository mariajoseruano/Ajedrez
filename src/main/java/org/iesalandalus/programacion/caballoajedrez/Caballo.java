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
     
     //Ejericio 13:Crea un contructor por defecto que cree un caballo negro en la posicion 8b.
     
     public Caballo()
     {
		color= Color.NEGRO;
                posicion=new Posicion(8,'b');
               
     }
     /*Ejercicio 14: Crea un Constructor de clase que acepte como parametro el color que creará
     un caballo de dicho color cuya posicion es 1b si es blanco 0 8b si es negro.*/
     
     public Caballo(Color color )
     {
        if (color ==Color.BLANCO)
        {
            posicion=new Posicion(1,'b');
            this.color=color;
        }
        else 
        {
            posicion=new Posicion(8,'b');
            this.color=color;
        }
     }      
     /*  Ejercicio 15 crea un constructor que acepte como parametro color y columna inicial. 
     la columna inicial debe de ser la b o la g( de lo contrario debe de lanzar una excepcion 
     y crear un caballo del color dado y colocado en dicha columna y cuya fila será la 1 
     si es blanco y la 8 si es negro.
     */            
           
    public Caballo ( Color color,char columnaInicial) 
    {
        if (columnaInicial=='b' || columnaInicial=='g')
        {
            this.color=color;
            if (color==Color.BLANCO)                   
                posicion=new Posicion(1,columnaInicial);
            else
                posicion= new Posicion(8,columnaInicial);                     
          
           
        }
        else
            throw new IllegalArgumentException("La Columna Inicial introducida no es correcta");          
    } 
           
                
                   
                
                 
    /*Ejercicio 17 Método mover: dependiendo del movimiento modificará la posicion del mismo
     o si no puede hacer el movimiento debe de lanzar una excepcion.
        Declaramos char c='A'; int i=(int)c;
     */   
     
     public void mover( Direccion dir)
     {
        int filaActual,nuevaFila=1;
        char columnaActual,nuevaColumna='a';
        
        filaActual=posicion.getFila();
        columnaActual=posicion.getColumna();
               
              
         
         switch (dir)
         {
             case ARRIBA_IZQUIERDA:
                 nuevaFila=filaActual+2;
                 nuevaColumna=(char)(columnaActual-1);
                 break;
             case ARRIBA_DERECHA:
                 nuevaFila=filaActual+2;
                 nuevaColumna=(char)(columnaActual+1);
                 break;
            case DERECHA_ARRIBA:
                 nuevaFila=filaActual+1;
                 nuevaColumna=(char)(columnaActual+2);
                 break;  
            case DERECHA_ABAJO:
                 nuevaFila=filaActual-1;
                 nuevaColumna=(char)(columnaActual+2);
                 break;  
            case ABAJO_DERECHA:
                 nuevaFila=filaActual-2;
                 nuevaColumna=(char)(columnaActual+1);
                 break;  
             case ABAJO_IZQUIERDA:
                 nuevaFila=filaActual-2;
                 nuevaColumna=(char)(columnaActual-1);
                 break;  
             case IZQUIERDA_ARRIBA:
                 nuevaFila=filaActual+1;
                 nuevaColumna=(char)(columnaActual-2);
                 break;  
             case IZQUIERDA_ABAJO:
                 nuevaFila=filaActual-1;
                 nuevaColumna=(char)(columnaActual-2);
                 break; 
             default:
                 //throw new OperationNotSupportedException("ERROR: No se puede realizar este movimiento");
            
         }         
         
         posicion= new Posicion(nuevaFila,nuevaColumna);
    }
    
    //Ejercicio 18 Crea método equals para comprar la igualdad de objetos de clase.
             
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.color);
        hash = 89 * hash + Objects.hashCode(this.posicion);
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
        final Caballo other = (Caballo) obj;
        if (this.color != other.color) {
            return false;
        }
        if (!Objects.equals(this.posicion, other.posicion)) {
            return false;
        }
        return true;
    }

    //Ejercicio 19: Método toString devolver un String y será la representación del objeto.
    @Override
    public String toString() {
        return "Caballo{" + "color=" + color + ", posicion=" + posicion + '}';
    }
        
    
       
       
}


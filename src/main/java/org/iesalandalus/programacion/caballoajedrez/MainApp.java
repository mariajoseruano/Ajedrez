package org.iesalandalus.programacion.caballoajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
    
    private static Caballo caballo=null;    
    private static Posicion posicion;
       
	 
    public static void main (String [] args)
    {
        int opcion;
        mostrarMenu();
        opcion=elegirOpcion();
        ejecutarOpcion(opcion);
        Posicion posicion;
        
    } 

// Método que nos muestra el me nú de opciones
     
    private  static void mostrarMenu()
    {
        System.out.println("");
        System.out.println("Programa para aprender a colocar y mover un caballo en el tablero de ajedrez");
	System.out.println("");
	System.out.println("1.- Crear un caballo por defecto.");
	System.out.println("2.- Crear un caballo de un color.");
	System.out.println("3.- Crear un caballo de un color en una columna inicial válida.");      	
        System.out.println("4.- Mover el caballo");
       	System.out.println("0.- Salir.");
	System.out.println("");
    }
    
    //Método que valida y nos devuelve la opción elegida por el usuario
    
    private static int elegirOpcion()
    {
        int opcion;
        
        //Comprobamos que la opcion elegida es válida
        do
        {
            System.out.println("Elige una opción (0-4): ");
            opcion=Entrada.entero();
        }while(opcion<0 || opcion>5);
        
        return opcion;
    }
    
    //Método que ejecuta la opción elegida por el usuario
    
    private static void ejecutarOpcion(int opcion)
    {
        switch(opcion)
        {
            case 1: //Crear un caballo por defecto
                crearCaballoDefecto();
                break;
            case 2: //Crear un caballo de un color                
                crearCaballoDefectoColor();
                break;
           case 3: //Crear un caballo de un color y en una columna inicial
                crearCaballoColorPosicion();
                break;
            case 4: //Mover el caballo
                //movimimiento();
                break;
          
        }
    }
    
    //Opción 1
     private static void crearCaballoDefecto()
    {
        caballo=new Caballo();
        System.out.println("Caballo creado correctamente");
    }
     
     //Opcion 2
     private static void crearCaballoDefectoColor()
    {
        
        int colorCaballo;
        Color color;                     
        color=Color.BLANCO;
                
        colorCaballo=elegirColor();
        
        switch (colorCaballo)
        {
            case 0: //Blanco
                color=Color.BLANCO;
                break;
            case 1: //Negro
                color=Color.NEGRO;
                break;
            
        }
            
        caballo=new Caballo(color);
        System.out.println("El caballo es de color:"+color);      
    }
    
     private static int elegirColor()
     {
         int colorCaballo;
         
         do
        {   System.out.println("Introduzca el color del caballo 0.Blanco, 1.Negro): ");
            colorCaballo=Entrada.entero();       
        }while (colorCaballo<0 || colorCaballo>=2);
        
         
        return colorCaballo; 
     }
    //Opción 3 Crear un caballo de un color y en una columna inicial válida
     
    private static void crearCaballoColorPosicion()
    {
            Color color;                     
            color=Color.BLANCO;
                        
            int colorCaballo;
            colorCaballo=elegirColor();
            
                      
             switch (colorCaballo)
        {
            case 0: //Blanco
                color=Color.BLANCO;
                break;
            case 1: //Negro
                color=Color.NEGRO;
                break;
            
        }
            char columnaInicial;
            columnaInicial=elegirColumnaInicial();
            
            caballo=new Caballo( color,columnaInicial);
            System.out.println("El caballo es de color:" + color+ "y esta posicionado en la columna"+columnaInicial);  
    }
    
    private static char elegirColumnaInicial()
    {
        char columnaInicial;
        do
        {   System.out.println("Introduzca una columna correcta : b o g:");
            columnaInicial=Entrada.caracter();       
        }while (columnaInicial!='b' || columnaInicial!='g');
        
        return columnaInicial;
          
    }
            
      
     //Opción 4 Movimiento
     
    private static void movimiento()
    {
    
       
        int opcionDir;
        Direccion dir;
        int nuevaFila=1;
        char nuevaColumna='a';
        mostrarMenuDirecciones();
        opcionDir=elegirDireccion();
        
        posicion= new Posicion(nuevaFila,nuevaColumna);    
    }
     // Método que nos muestra el menú de opciones para la Dirección
     
        private  static void mostrarMenuDirecciones()
        {
            System.out.println("1.ARRIBA_IZQUIERDA");
            System.out.println("2.ARRIBA_DERECHA");
            System.out.println("3.DERECHA_ARRIBA");
            System.out.println("4.DERECHA_ABAJO");
            System.out.println("5.ABAJO_DERECHA");
            System.out.println("6.ABAJO_IZQUIERDA");
            System.out.println("7.IZQUIERDA_ARRIBA");      	
            System.out.println("8.IZQUIERDA_ABAJO");
            System.out.println("0.- Salir.");
        }
    
   
     // Método que valida y nos devuelve la opción elegida por el usuario
     
     
        private static int elegirDireccion()
        {
            int opcionDir;
        
        //Comprobamos que la opcion elegida es válida
            do
            {
                 System.out.println("Elige una opción (0-8): ");
                    opcionDir=Entrada.entero();
            }while(opcionDir<0 || opcionDir>8);
        
            return opcionDir;
        
        
        }
    
            
}      
          
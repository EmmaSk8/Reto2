/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;
import java.util.Scanner;
/**
 *
 * @author pc
 * Codigo realizado por Emmanuel Bustamante Valbuena y Samuel Niño Ortega
 * Tecnicas y programacion 
 */
public class Reto2 {

    Scanner teclado = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int opcion;
        String tecla="";
        
        do{
            
            System.out.println("1. Tabla de multiplicar. ");
            System.out.println("2. Cuadrado de un numero N. ");
            System.out.println("3. Cubos de Nicómaco. ");
            System.out.println("4. Cajero Automatico. ");
            System.out.println("5. Salir.");
        
            Scanner teclado = new Scanner(System.in);
            System.out.print("Ingrese la opcion del menu que desea acceder: ");
               
            opcion = teclado.nextInt();
            switch (opcion){
            case 1:   
                multiplicar();
                break;
            case 2:    
                cuadradoN();       
                break;
            case 3:  
                nicomaco();
                break;
            case 4:  
                cajeroAutomatico();     
                break;
                
            case 5:  
                System.out.println ("Salir del programa");
                break;
                     
            default: 
                System.out.println("Ingrese un numero valido entre 1 y 5");
                break;
            }
            System.out.println("");
            System.out.println("Escoja una nueva opcion o pulse 5 para salir del menu: ");
            tecla = teclado.nextLine();
        } while(opcion!=5);
      
         {
        // instrucción switch con tipo de datos int
        
        System.out.println("Fin del menu ");
    }}
    static void multiplicar(){
        Scanner teclado = new Scanner(System.in);
           Scanner teclado2 = new Scanner(System.in);

        System.out.print("Ingrese el numero de tablas de multiplicar que desea:  ");
        int valor = teclado.nextInt(); {
        if (valor >= 0 ) {
             System.out.print("Ingrese el numero mayor a 1 que desee multiplicar: ");
        int valor2 = teclado.nextInt();{
           if (valor2 >= 0) {        
            int i, j, r;

        for (i = 1; i <= valor; i++) {
            for (j = 1; j <= valor2; j++) {
                r = i * j;
                System.out.println(i + " * " + j + " = " + r);
                
            }
           System.out.println("");
        }
    } else{System.out.println("Ingrese un numero correcto");}
}}
    else
           { System.out.println("Ingrese un numero correcto");
           }
    }
            
    }
    static void cuadradoN(){
        Scanner teclado = new Scanner(System.in);
	int numeroElevar = 0, suma = 0, potencia = 0;
	String cadena = "" ;
	System.out.print("Ingrese el número a potenciar al cuadrado: ");
	numeroElevar = teclado.nextInt();
	if(numeroElevar >= 1){
		for(int n=1; n<=numeroElevar; n++){
			potencia = 0;
			cadena = n + "^2 = ";
			for(int i=1;i<=n;i++){
				suma = (2*i)-1;
				potencia = potencia + suma;//1+3+5
				cadena = cadena + suma + " + "; 
			}
			cadena = cadena.substring(0,cadena.length()- 3);
			System.out.println(cadena + " = " + potencia);
		}
	}else{
		System.out.println("Ingrese un numero correcto");
	}
        
    }
    static void nicomaco (){
        Scanner teclado = new Scanner(System.in);
	
	int numeroCubos = 0;
	int numeroImpar = -1;
	int suma = 0;
	String cadena = "" ;
	System.out.print("Digite el numero, mayor a 1,  hasta el cual desea calcular el cubo: ");
	numeroCubos = teclado.nextInt();
	if(numeroCubos >0){
		for (int i = 1; i <= numeroCubos; i++) {
			cadena = i + "^3 = ";
			suma = 0;
			for (int j = 1; j <= i; j++) {
				numeroImpar = numeroImpar + 2;
				suma = suma + numeroImpar;
				cadena = cadena + numeroImpar + " + "; 
			}
			cadena = cadena.substring(0,cadena.length()- 3);
			System.out.println(cadena + " = " + suma);
		}
    } else {
		System.out.println("Ingrese un numero correcto");
	}
        
    }
    static void cajeroAutomatico(){
        Scanner teclado = new Scanner(System.in);
        
        int monedas1Peso, billetes100000, billetes50000, billetes20000,
            billetes10000, billetes5000, billetes2000, billetes1000,
            monedas500, monedas200, monedas100, monedas50;
        System.out.print("Digite la cantidad de dinero que desea retirar: ");
        monedas1Peso = teclado.nextInt();
        if(monedas1Peso >= 1){
        billetes100000 = (monedas1Peso-(monedas1Peso%100000))/100000;
        monedas1Peso = monedas1Peso%100000;
        billetes50000 = (monedas1Peso-(monedas1Peso%50000))/50000;
        monedas1Peso = monedas1Peso%50000;
        billetes20000 = (monedas1Peso-(monedas1Peso%20000))/20000;
        monedas1Peso = monedas1Peso%20000;
        billetes10000 = (monedas1Peso-(monedas1Peso%10000))/10000;
        monedas1Peso = monedas1Peso%10000;
        billetes5000 = (monedas1Peso-(monedas1Peso%5000))/5000;
        monedas1Peso = monedas1Peso%5000;
        billetes2000 = (monedas1Peso-(monedas1Peso%2000))/2000;
        monedas1Peso = monedas1Peso%2000;
        billetes1000 = (monedas1Peso-(monedas1Peso%1000))/1000;
        monedas1Peso = monedas1Peso%1000;
        monedas500 = (monedas1Peso-(monedas1Peso%500))/500;
        monedas1Peso = monedas1Peso%500;
        monedas200 = (monedas1Peso-(monedas1Peso%200))/200;
        monedas1Peso = monedas1Peso%200;
        monedas100 = (monedas1Peso-(monedas1Peso%100))/100;
        monedas1Peso = monedas1Peso%100;
        monedas50 = (monedas1Peso-(monedas1Peso%50))/50;
        monedas1Peso = monedas1Peso%50;
        //impresión de variables
        System.out.println("Cantidad billetes de 100.000: " + billetes100000);
        System.out.println("Cantidad billetes de 50.000: " + billetes50000);
        System.out.println("Cantidad billetes de 20.000: " + billetes20000);
        System.out.println("Cantidad billetes de 10.000: " + billetes10000);
        System.out.println("Cantidad billetes de 5.000: " + billetes5000);
        System.out.println("Cantidad billetes de 2.000: " + billetes2000);
        System.out.println("Cantidad billetes de 1.000: " + billetes1000);
        System.out.println("Cantidad monedas de 500: " + monedas500);
        System.out.println("Cantidad monedas de 200: " + monedas200);
        System.out.println("Cantidad monedas de 100: " + monedas100);
        System.out.println("Cantidad monedas de 50: " + monedas50);
        System.out.println("Cantidad monedas de 1: " + monedas1Peso);
    } else { 
    System.out.println("Ingrese un numero correcto");        
}
    }
    
        
}
        // TODO code application logic here
  
    


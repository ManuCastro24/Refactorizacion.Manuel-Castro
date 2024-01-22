package refactoring;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var sc=new Scanner(System.in);
		
		//Creacion de variables
				int eleccion,int resultado;
				
				System.out.println("Introduce que quieres realizar,1 sumar, 2 restar, 3 multiplicar y 4 dividir");
				eleccion=sc.nextInt();
				
				System.out.println("Introduce un numero");
				int numero1=sc.nextInt();
				
				System.out.println("introduce otro numero");
				int numero2=sc.nextInt();
				
				
		        switch (eleccion) {
		        
	            case 1:
	            	
	                resultado = numero1 + numero2;
	                
	                System.out.println(resultado);
	                
	                break;
	                
	            case 2:
	            	
	                resultado = numero1 - numero2;
	                
	                System.out.println(resultado);
	                
	                break;
	                
	            case 3:
	            	
	                resultado = numero1 * numero2;
	                
	                System.out.println(resultado);
	                
	                break;
	                
	            case 4:
	            	
	                resultado = numero1 / numero2;
	                
	                System.out.println(resultado);
	                
	                break;
	                
	            case 5:
	            	
	                System.out.println("Se introdujo un numero fuera de rango");
	        }
					
	  }
			
			sc.close();
}
	




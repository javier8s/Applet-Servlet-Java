package Practica2;

public class Metodos {

	public String ejercicio1_a(int A,int B,int opcion) {
		// Aqu� se calcula m�nimo com�n multiplo y el m�ximo com�n divisor
		// Opci�n 1 : m�ximo com�n divisor
		if(opcion == 1) {
			 while(A != B)
		            if(A>B)
		                A = A - B;
		            else
		                B = B - A;
			System.out.println("El MCD de A y B es : " +A);
			return "El MCD de A y B es : " +A;
		}
		// Opci�n 2 : m�nimo com�n multiplo 
		if(opcion == 2) {
			int multiplo;
	        if (A>B)
	            multiplo = A;
	        else
	            multiplo = B;
	        while (multiplo%A!=0 || multiplo%B!=0)
		            multiplo++;                  
	        System.out.println("El MCM es = " +multiplo);                                          
	        return "El MCM es = " +multiplo;
		}
		
		return "Error";
	}
	
	
	public String ejercicio1_b(int i, int j, int k){
		// Aqu� se realiza la verficaci�n de si se puede crear un �ngulo
		if((i+j<=k) ||(i+k<=j) ||(k+j<=i)) {
			System.out.println("No puede ser un triangulo.");
			return "No puede ser un triangulo.";
		}else {
			double s = (i+j+k);
			s = s/2;
			System.out.println("El area del triangulo es : "+ Math.sqrt(s*(s-i)*(s-j)*(s-k)));
			return "El area del triangulo es : "+ Math.sqrt(s*(s-i)*(s-j)*(s-k));
		}
	}
}

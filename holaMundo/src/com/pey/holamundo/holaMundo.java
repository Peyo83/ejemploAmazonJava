package com.pey.holamundo;

public class holaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");
		
		// Enteros
		byte edad = 37;
		short year = 2021;
		int id_user = 10001;
		long id_tweeter = 201598448434L;
		
		// Punto flotante
		float diametro = 12.58F;
		double precio = 1324568.946544998;
		
		// Texto
		char genero = 'M';
		
		// L�gico
		boolean isVisible = true;
		
		
		int VALOR = 0; // constante
		int VALOR_MAXIMO = 5;
		
		// CAST --> Convertir un dato en otro
		double d = 35.85;
		int i = (int) d;
		
		//Arrays
		//Declaraci�n de arrays
		
		int[] arregloEnteros = new int[3];
		double arregloDouble[];
		
		int[][] array2D = new int[2][3];
		int[][][] array3D = new int[3][3][2];
		char[][] days = {{'M','T','W'},{'T','F','S'}};
		//System.out.println(days);
		
		char[] names = new char[3];
		names[0] = 'h';
		names[1] = 'e';
		names[2] = 'y';
		//System.out.println(names[0]);
		//System.out.println(names[1]);
		//System.out.println(names[2]);
		//System.out.println(names);
		
		int n = 3;
		//n++;
		//System.out.println(n++);
		
		System.out.println("Bucle for: ");
		
		for (int c = 0; c <= 12; c++) {
			//System.out.println("El valor es: " + c);
		}
		
		System.out.println();
		int [] numeros = new int[5];
		for (int l=0;l<5;l++) {
			numeros[l]=l;
			System.out.println(numeros[l]);
		}
		
		for (int j : numeros) {
				System.out.println(j);
		}
	} 

}



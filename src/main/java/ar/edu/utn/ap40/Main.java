package ar.edu.utn.ap40;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Persona> personas = new ArrayList<>();

	public static void main(String[] args) {
		Persona persona1= new Persona(null, null, null);
		Scanner leer=new Scanner(System.in);
		String[] opciones = { "1. Cargar Persona", "2. Mostrar Personas", "3. Salir" };
		
		
		System.out.println("Elija una opcion del menu:");
		for(String op:opciones) {
			System.out.println(op);
		}
		
		int opcion=0;
		
		
		
		while (opcion < 4) {
			try {
				opcion=leer.nextInt();
				switch (opcion) {				
				case 1:
					System.out.println("Ingrese su nombre:");
					String nombre=leer.next();
					System.out.println("Ingrese su apellido:");
					String apellido=leer.next();					  
					System.out.println("Ingrese su fecha de nacimiento");
					//LocalDate fecha = LocalDate.parse(leer.next());
					
					personas.add(new Persona(nombre, apellido, null));
					break;
				case 2:
					mostrarPersonas();
					break;
				case 3:
					System.out.println("El programa termino");
				}
			} catch (Exception ex) {
				System.out.println("Ingrese un numero del 1 al 3");
				leer.next();
			}
		}
	}

	
	
	private static void mostrarPersonas() {
		for (Persona persona : personas) {
			
			System.out.println(persona.toString());
		}
	}

}

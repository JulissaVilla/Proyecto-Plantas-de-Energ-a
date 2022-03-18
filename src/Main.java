import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Boolean control =true ;
		
		do {
			System.out.println("\n***Menu***");
			System.out.println("1 Total de megavatios de consumo");
			System.out.println("2 Nuevo diccionario");
			System.out.println("3 Dinero recaudado");
			System.out.println("0 Salir del programa");
			System.out.println(" ");
			System.out.println("Ingrese opción: ");

			int numero = sc.nextInt();
			
			if (numero == 1) {
				Scanner sc1=new Scanner(System.in);
				System.out.println("Ingrese la planta: ");
				String planta = sc1.nextLine();
				
				
				System.out.println("Ingrese la ciudad: ");
				String ciudad = sc1.nextLine();
				
				consumo_energia totalconsumo = new consumo_energia();
				int totaL = totalconsumo.consumoEnergia(planta, ciudad);
				System.out.println("El total del consumo es: "+totaL);
				
			}
			else if (numero == 2) {
				Scanner sc1=new Scanner(System.in);
				System.out.println("Ingrese la cuidad:");
				String ciudad = sc1.nextLine();
				
				Nuevo_Diccionario dic = new Nuevo_Diccionario();
				Map diccionario = dic.diccionario(ciudad);
				
				System.out.println(diccionario.toString());
							
			}
			else if (numero == 3) {
				Scanner sc1=new Scanner(System.in);
				System.out.print("Insertar la region 'costa''sierra''oriente': ");
				String region = sc1.nextLine();
				
				Dinero_Recaudado din= new Dinero_Recaudado();
				double dinero= din.dineroRecaudado(region);
				System.out.println("El dinero recaudado es: $"+dinero);
			
			}
			else {
				control = false;
			}
		}

		  while (control);
	}

}

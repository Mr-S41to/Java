package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import triangulo.Triangulo;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// instânciando variável
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		// atribuindo valores aos triangulos x e y conforme os três lados definidos na classe "Triangulo" (a, b e c).
		
		System.out.println("Entre com os Lados do 1° Triangulo: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com os Lados do 2° Triangulo: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double f = (x.a + x.b + x.c)/2.0;
		double areaX = Math.sqrt(f * (f - x.a) * (f - x.b) * (f - x.c));
		
		f = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(f * (f - y.a) * (f - y.b) * (f - y.c));
		
		if (areaX > areaY) {
			System.out.println("O Triangulo X possui a maior area");
			}
			else {
			System.out.println("O Triangulo Y possui a maior area\"");
			}
	
		sc.close();
		
	}

}

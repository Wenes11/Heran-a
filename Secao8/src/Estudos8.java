import java.util.Scanner;

import entidade.triangulo;

public class Estudos8 {

	public static void main(String[] args) {
		
		triangulo x,y;
		x= new triangulo();
		y= new triangulo();
		
        Scanner sc = new Scanner(System.in);
		 
		System.out.println(" Digite os tres valores de X:");
		x.a= sc.nextDouble();
		x.b = sc.nextDouble();
		x.c= sc.nextDouble();
		
		System.out.println(" Digite os tres valores de Y:");
		y.a= sc.nextDouble();
		y.b = sc.nextDouble();
		y.c= sc.nextDouble();
	
		
		double p = (x.a + x.b + x.c)/2;
		double areaX= Math.sqrt(p*(p-x.a) * (p-x.c) * (p-x.c));
		
		p= (y.a + y.a + y.c)/2;
		double areaY= Math.sqrt(p*(p-x.a) * (p-x.b) * (p-x.c));
		
		System.out.printf("A Area do X : %.4f%n", areaX);
		System.out.printf("A Area do Y : %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.printf("Maior : X ");
		}else {
			System.out.printf("Maior : Y ");
		}
	}

}

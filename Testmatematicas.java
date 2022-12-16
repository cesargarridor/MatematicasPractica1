import java.util.Scanner;

public class Testmatematicas{
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Dime un numero");
		int numero= sc.nextInt();
		
		boolean numerotipo=Matematicas.esPar(numero);
		if(numerotipo==true){
		System.out.println("El numero es par");
		}else{
		System.out.println("El numero es impar");
			}
	}
}


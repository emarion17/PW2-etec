import java.util.Scanner;

public class TestaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ent = new Scanner(System.in);
		Triangulo tri = new Triangulo();
		System.out.println("Digite o valor de x:");
		tri.setX(ent.nextDouble());
		System.out.println("Digite o valor de y:");
		tri.setY(ent.nextDouble());
		System.out.println("Digite o valor de z:");
		tri.setZ(ent.nextDouble());
		System.out.println(tri.validaTriangulo());
	}

}

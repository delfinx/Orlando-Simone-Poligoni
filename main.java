import java.util.Scanner;
public class main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        Poligono Quadrato = new Poligono(8, 14);

        Quadrato.area();
        Quadrato.perimetro();

        Poligono Rettangolo = new Poligono(5,12);

        Rettangolo.area();
        Rettangolo.perimetro();
    }
}

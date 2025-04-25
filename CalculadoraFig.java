import java.util.Scanner;
public class CalculadoraFig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int figura, calculo;

        System.out.println("Selecciona la figura para calcular su area o perimetro:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");
        figura = scanner.nextInt();

        System.out.println("Elije que deseas calcular:");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");
        calculo = scanner.nextInt();
        double total = 0; 

        switch (figura) {
            case 1:
                System.out.print("Introduce el radio: ");
                double radio = scanner.nextDouble();
                if (calculo == 1)
                    total = Math.PI * radio * radio;
                else
                    total = 2 * Math.PI * radio;
                break;

            case 2:



    }
}
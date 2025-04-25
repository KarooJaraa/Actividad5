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

        System.out.println("Elije que es lo que deseas calcular:");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");
        calculo = scanner.nextInt();
        double total = 0; 

        switch (figura) {
            case 1:
                System.out.print("Introduce el radio: (USAR COMAS EN VES DE PUNTO:) ");
                double radio = scanner.nextDouble();
                if (calculo == 1)
                    total = Math.PI * radio * radio;
                else
                    total = 2 * Math.PI * radio;
                break;

            case 2:
                System.out.print("Introduce el tamaño del lado: (USAR COMAS EN VES DE PUNTO:)");
                double lado = scanner.nextDouble();
                if (calculo == 1)
                    total = lado * lado;
                else
                    total = 4 * lado;
                break;

            case 3:
                System.out.print("Introduce primero la base: (USAR COMAS EN VES DE PUNTO:) ");
                double base = scanner.nextDouble();
                System.out.print("Introduce la altura: (USAR COMAS EN VES DE PUNTO:) ");
                double altura = scanner.nextDouble();
                if (calculo == 1)
                    total = (base * altura)/2;
                else
                    total = 3 * base;
                break;

            case 4:
                System.out.print("Introduce primero la base: (USAR COMAS EN VES DE PUNTO:) ");
                double baseRec = scanner.nextDouble();
                System.out.print("Introduce la altura: (USAR COMAS EN VES DE PUNTO:)");
                double alturaRec = scanner.nextDouble();
                if (calculo == 1)
                    total = baseRec * alturaRec;
                else
                    total = 2 * (baseRec + alturaRec);
                break;

            case 5:
                System.out.print("Introduce el tamaño del lado: (USAR COMAS EN VES DE PUNTO:)");
                double ladoPen = scanner.nextDouble();
                System.out.print("Introduce el radio interno: (USAR COMAS EN VES DE PUNTO:) ");
                double radioInt = scanner.nextDouble();
                if (calculo == 1)
                    total = (5 * ladoPen * radioInt) / 2;
                else
                    total = 5 * ladoPen;
                break;

            default:
                System.out.println("Esta opcion no es valida.");
                return;
            }

        System.out.println("El resultado es: " + total);
        scanner.close();
    }
}
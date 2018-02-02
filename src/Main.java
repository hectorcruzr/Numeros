import java.util.Scanner;

public class Main {
    public static void main(String a[]) {
        Numero num1;
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Introdusca un numero \n(0 para salir): ");
            String valor = scanner.nextLine();
            n = Integer.parseInt(valor);
            if (n == 0) {
                System.out.println("chauchau");
                break;
            }
            num1 = new Numero(n);
            num1.mostrar();
            System.out.println("es par = " + num1.esPar());
            System.out.println("es Primo = " + num1.esPrimo());
        } while (n != 0);


        num1 = new Numero(13);
        num1.mostrar();
        System.out.println("es par = " + num1.esPar());
        System.out.println("es Primo = " + num1.esPrimo());

        num1.valorAleatorio(1, 100);
        System.out.println("Numero Aleatorio");
        num1.mostrar();


        System.out.println("numero a verificar: ");
        String valor = scanner.nextLine();
        n = Integer.parseInt(valor);

        System.out.println("es par = " + num1.esPar(n));
        System.out.println("es Primo = " + num1.esPrimo(n));

        num1.valorAleatorio(1, 100);
        System.out.println("Numero Aleatorio entre 1 y 100");
        num1.mostrar();

        num1.juego();
    }
}

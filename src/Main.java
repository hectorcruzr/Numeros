import java.util.Scanner;

public class Main {
    public static void main(String a[]) {
        Numero num1;
        num1 = new Numero(13);
        num1.mostrar();
        System.out.println("es par = " + num1.esPar());
        System.out.println("es Primo = " + num1.esPrimo());

        Scanner scanner = new Scanner(System.in);
        System.out.println("numero a verificar: ");
        String valor = scanner.nextLine();
        int n = Integer.parseInt(valor);

        System.out.println("es par = " + num1.esPar(n));
        System.out.println("es Primo = " + num1.esPrimo(n));
    }
}

public class Numero {
    int num;

    public Numero(int n) {
        num = n;
    }

    public boolean esPar() {
        if (num % 2 == 0) return true;
        else return false;
    }

    public boolean esPar(int n) {
        if (n % 2 == 0) return true;
        else return false;
    }

    public boolean esPrimo() {
        int cont = 2;
        boolean resultado = true;
        do {
            if (num % cont == 0)
                resultado = false;
            cont++;
        } while (cont < num);
        return resultado;
    }

    public boolean esPrimo(int n) {
        int cont = 2;
        boolean resultado = true;
        do {
            if (n % cont == 0)
                resultado = false;
            cont++;
        } while (cont < n);
        return resultado;
    }

    public void mostrar() {
        System.out.println("valor -> " + num);
    }

    public double valorAleatorio(int ini, int fin) {
        num = (int) (Math.random() * fin) + ini;
        return num;
    }
    public int factorial(int n){
        if(n==0) return 1;
        else
            return n*factorial(n-1);
    }
    public void juego() {
        System.out.println("valor para adivinar entre 1 y 100");
        //int valor = leerNumero();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        tabuada t = new tabuada();
        t.run();
    }
}

class tabuada implements Runnable {

    public int numero;
    public int i;

    public tabuada() {
        this.numero = numero;
        this.i = i;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
        i = 1;

        Thread thread1 = new Thread(new tabuada());

        while (i < 11) {
            int resultado = numero * i;
            System.out.println("Resultado: " + resultado);
            i++;
        }
    }
}


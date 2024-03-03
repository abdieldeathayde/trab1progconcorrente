import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        tabuada t = new tabuada();
        Thread thread1 = new Thread(new tabuada());
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class tabuada implements Runnable {
    public int numero;
    public int i;
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
        i = 1;
        while (i < 11) {
            int resultado = numero * i;
            System.out.println("Resultado: " + resultado);
            i++;
        }
    }
}


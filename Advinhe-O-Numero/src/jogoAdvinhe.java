import java.util.Scanner;
import java.util.Random;

public class jogoAdvinhe {
    public static void main(String[] args){
        try (Scanner palpite = new Scanner(System.in)) {
            Random numero = new Random();

            int numeroParaAdivinhar = numero.nextInt(100) + 1;
            int numeroDeTentativas = 0;
            int tentativa = 0;
            
            System.out.println("Tente adivinhar um número de 1 a 100");

            while(tentativa != numeroParaAdivinhar && numeroDeTentativas <7){

                System.out.println("Digite seu número: ");
                tentativa = palpite.nextInt();
                numeroDeTentativas++;

                if (tentativa < numeroParaAdivinhar)
                    System.out.println("Poxa, o número que eu quero é maior");
                else if (tentativa > numeroParaAdivinhar)
                    System.out.println("Poxa, o número que eu quero é menor");
            }
            if (tentativa == numeroParaAdivinhar)
                System.out.println("Parabens, você acertou o número em " + numeroDeTentativas + " tentativas.");
            else
                System.out.println("Infelizmente você não conseguiu, o número era: " + numeroParaAdivinhar);
        }
    }
}

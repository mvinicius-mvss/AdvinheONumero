import java.util.Scanner;

public class jogoAdvinhe {
    public static void main(String[] args){
        Scanner tentativa = new Scanner(System.in);
        int adivinhe = 0;
        
        System.out.println("Tente adivinhar um número de 1 a 100");

        System.out.println("Digite seu número: ");
        adivinhe = tentativa.nextInt();
        System.out.println(adivinhe);
    }
}

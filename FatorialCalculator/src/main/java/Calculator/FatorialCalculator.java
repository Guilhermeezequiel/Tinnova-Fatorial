package Calculator;

public class FatorialCalculator {

    public static void main(String[] args) {
        int fatorial = 1;

        for (int i = 1; i < 10; i++) {
            fatorial *= i;

            System.out.println("O Fatorial de " + i + " = " + fatorial);
        }
    }

}
import java.util.Scanner;

public class Contador {

    public static int contadorDeLetras (String frase) {
        int contagem = 0;
        frase = frase.toLowerCase();

        for (int c = 0; c < frase.length(); c++){
            char letra = frase.charAt(c);
            if(letra == 'a') {
                contagem++;
            } 
        }

        return contagem;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite qualquer coisa");
        String frase = scanner.nextLine();

        System.out.println("o numero de letras amanh'A' na frase é de " + contadorDeLetras(frase));
        scanner.close();
    }
}

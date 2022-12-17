import java.util.Locale;
import java.util.Scanner;

public class aboutMe{
    public static void main (String [] args) {
        //os argumentos começam com o indice 0
       // String nome = args[0];
        //String sobrenome = args[1];
        //int idade = Integer.valueOf(args[2]);
        //double altura = Double.valueOf(args[3]);
        //vamos falar sobre
        //int[] dadosPessoais = new int [4];
        //dadosPessoais [0] = Rosana;
        //dadosPessoais [1] = Gouveia;
       // dadosPessoais [2] = 57;
        //dadosPessoais [3] = 1.58;


        Scanner scaner = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();


        System.out.println("Ola me chamo  " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
        
    

    }
}
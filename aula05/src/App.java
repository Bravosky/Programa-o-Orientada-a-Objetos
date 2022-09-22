import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {        Scanner teclado = new Scanner(System.in);

        Aluno aluno1;
        aluno1 = new Aluno("Igor","30033799",1998);

        
        Aluno aluno2;
        aluno2 = new Aluno("Bravao","12345",1998);


        System.out.println("O nome do aluno 1 é " + aluno1.nome + " e a idade dele é: " + aluno1.calculaidade());
        System.out.println("O nome do aluno 2 é " + aluno2.nome + " e a idade dele é: " + aluno2.calculaidade());


        

        





    }
}
        
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        System.out.println("\n\n\n\n\n");
        
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Qual a fruta você vai levar? ");
        String fruta = entradaTeclado.nextLine();
  

        System.out.println("Qual o valor da fruta? ");
        double valor = entradaTeclado.nextDouble();
        
        System.out.println("Quantas frutas voce vai levar? ");
        int quantidade = entradaTeclado.nextInt();

        Double total = valor*quantidade;

        System.out.println("fruta: " + fruta);
        System.out.println("Valor de cada fruta:" + valor);
        System.out.println("Quantidade de frutas:" + quantidade);
        System.out.println("Total da compra da senhorita: " + total);
        
        





        


        System.out.println("\n\n\n\n\n");
    }
}

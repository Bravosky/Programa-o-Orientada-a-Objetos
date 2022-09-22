import java.util.Scanner;
public class exercicio02 {
public static void main(String[] args) throws Exception {
Scanner entradaTeclado = new Scanner(System.in);

System.out.println("Digite o nome do cidadão dos Céus: ");
String nome = entradaTeclado.nextLine();

System.out.println("Quantos exercicios o cidadão entregou? ");
int exercicio = entradaTeclado.nextInt();

if (exercicio > 4) {
    System.out.println("Malandro é o gato que nasceu de bigode");
} else { 
    System.out.println("Qual a nota parcial do cidadão? ");
double notaParcial = entradaTeclado.nextDouble();
if (notaParcial > 3) {
    System.out.println("Erou");    
} else {
    System.out.println("Qual a nota regimental do cidadão? ");
double notaRegimental = entradaTeclado.nextDouble();
if (notaRegimental > 5) {
    System.out.println("Erou denovo");
    
} else {
  double notaFinal = 0.5 * exercicio + notaParcial + notaRegimental;
  System.out.println(nome + ", a sua nota final foi:" + notaFinal);
}
}




}




}




}


















public class Aluno {

String nome;
String rgm;
int Anonasc;


Aluno(String nomeEntrada, String rgmEntrada, int AnonascEntrada ) { 

    this.nome = nomeEntrada;
    this.rgm = rgmEntrada;
    this.Anonasc = AnonascEntrada;

};
    
int calculaidade (){ 
    int anoatual = 2022;
    int idade = anoatual - Anonasc;
    return idade;

}



}
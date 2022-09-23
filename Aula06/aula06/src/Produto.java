import javax.swing.JOptionPane;

class Produto {

    String marca;
    int tamanho;
    double valor;

    Produto(){
        marca = "não existe";
        tamanho = 0;
        valor = 0; 
    }
    Produto(String marcaEntrada, int tamanhoEntrada, double valorEntrada){ 

        marca = marcaEntrada;
        tamanho = tamanhoEntrada;
        valor = valorEntrada;

    }

    double calculaImposto(double impostoPorcentagem){
        double valorImposto;

        valorImposto = valor*impostoPorcentagem;

        return valorImposto;
    }



    void imprimeDados(double impostoEntrada){

        JOptionPane.showMessageDialog(null,
                                            "Produto: "+ marca+
                                            "\nTamanho: "+ tamanho+
                                            "\nvalor: R$ "+ valor+
                                            "\nimposto: R$ "+ calculaImposto(impostoEntrada));
        
    }
}


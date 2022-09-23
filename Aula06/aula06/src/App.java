import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        Produto tenis1 = new Produto("Adidas",35,134.99);
        Produto tenis2 = new Produto("Havaianas",39,432.99);
        Produto tenis3 = new Produto("Nike",40,234.99);

        String entrada = JOptionPane.showInputDialog(null, "Digite O VALOR DO IMPOSTO");

        double entradaDouble = Double.parseDouble(entrada);

        tenis1.imprimeDados(entradaDouble);


        tenis1.imprimeDados(0.1);
        tenis2.imprimeDados(0.4);
        tenis3.imprimeDados(0.5);

        
       
    }
}

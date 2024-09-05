
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        String numeroString = JOptionPane.showInputDialog(null, "Ingrese un numero entero:");
        int numero = Integer.parseInt(numeroString);
        System.out.println("numero = " + numero);
    }
}

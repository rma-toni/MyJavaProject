import javax.swing.JOptionPane;

public class JOptPaneClass {
    public static void main(String[] args){

        //Para usar JOption pane debemos importarlo, se encuentra en la biblioteca swing
        //El metodo showInputDialog de esta clase nos permitira mostrar una ventana en la cual el usuario podra ingresar un String que vamos a obtener
        String text = JOptionPane.showInputDialog(null,"Ingrese texto: ");
    }
}
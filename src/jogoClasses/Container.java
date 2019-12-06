package jogoClasses;

import javax.swing.JFrame;
import jogoClasses.Fase;

public class Container extends JFrame {

    public Container(){
        add(new Fase());
        setTitle("Jogo De Digitação");
        setSize(1024,728);
        //definindo que ao apertar em close irá fechar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //centralizando a tela
        setLocationRelativeTo(null);
        //definindo que o tamanho da tela não pode alterar
        this.setResizable(false);
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new Container();
        
    }
    
}

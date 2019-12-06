package jogoClasses;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Enemy1{
    //Texto gerado aleatoriamente
    private String txtAleatorio;

    private Image imagem;
    private int x,y;
    private int largura, altura;
    private boolean isVisivel;
    
    //private static final int LARGURA = 938;
    private static int VELOCIDADE = 2;
    
    public Enemy1(int x, int y, String txt){
        this.x = x;
        this.y = y;
        txtAleatorio = txt;
        isVisivel = true;
    }
    
    public void load(){
        ImageIcon referencia = new ImageIcon("res\\meteoro.png");
        imagem =  referencia.getImage();
        
        this.largura = imagem.getWidth(null);
        this.altura = imagem.getHeight(null);
    }
    
    public void update(){
        this.y += VELOCIDADE;
           /* if(this.x > LARGURA){
                isVisivel = false;
            }*/
    }

    public boolean isVisivel() {
        return isVisivel;
    }

    public void setIsVisivel(boolean isVisivel) {
        this.isVisivel = isVisivel;
    }


    public static int getVELOCIDADE() {
        return VELOCIDADE;
    }

    public static void setVELOCIDADE(int VELOCIDADE) {
        Enemy1.VELOCIDADE = VELOCIDADE;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImagem() {
        return imagem;
    }

    public String getTxt() {
        return txtAleatorio;
    }    
}

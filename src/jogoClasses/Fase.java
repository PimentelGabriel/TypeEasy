package jogoClasses;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import jogoClasses.Enemy1;
import java.util.TimerTask;

public class Fase extends JPanel implements ActionListener{
    int tamanho=5;

    //Contador do meteoro
    private int o=0;
    //Texto gerado aleatoriamente
    String txtAleatorio;
    Random random = new Random();
    private Image fundo;
    //private Player player;
    private Timer timer;
    
    private java.util.Timer chamaMeteoro = new java.util.Timer();
    
    private List<Enemy1> enemy1;
    Font grande = new Font("Serif", Font.BOLD, 25);
    //Metodo construtor
    public Fase(){
        this.setVisible(true);
        setFocusable(true);
        setDoubleBuffered(true);
        //criando um objeto do tipo ImageIcon
        ImageIcon referencia = new ImageIcon("res\\Blackground.png");
        //adicionando a imagem a uma variavel
        fundo = referencia.getImage();
        
       // player = new Player();
        //player.load();
    
        //TecladoApadter();
        
        timer = new Timer(100,this);
        timer.start();
        
        inicializaInimigos();
        TecladoApadter();
    }
    
    public void inicializaInimigos(){
        enemy1 = new ArrayList<Enemy1>();
        //enemy1.add(new Enemy1(x, y, txtAleatorio));
        for(int i = 0; i < 20; i++){
            txtAleatorio = Character.toString((char)(random.nextInt(25)+65));
            int x = (int)(Math.random() * 680+30);
            int y = -100;
            enemy1.add(new Enemy1(x, y, txtAleatorio));
        }
    }
    
    //pintando na tela as imagens
    public void paint (Graphics g){
        Graphics2D graficos = (Graphics2D) g;
        //desenhando o background na tela
        graficos.drawImage(fundo, 0, 0, null);
        //desenhando o player na tela
       // graficos.drawImage(player.getImagem(),player.getX(), player.getY(), this);
        
        /*List<Tiro> tiros = player.getTiros();
        for(int i = 0; i< tiros.size(); i++){
            Tiro m = tiros.get(i);
                m.load();
            graficos.drawImage(m.getImagem(), m.getX(), m.getY(), this);
        }
        chamaMeteoro = new java.util.Timer();
            chamaMeteoro.scheduleAtFixedRate(new TimerTask(){
               @Override
               public void run(){
                   if(o<11){
                       System.out.println("Entrei no desenho");
                        Enemy1 in = enemy1.get(o);
                        in.load();
                        graficos.drawImage(in.getImagem(), in.getX(), in.getY(), new ImageObserver() {
                            @Override
                            public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
                                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            }
                        });
                        //graficos.draw;

                        graficos.setColor(Color.WHITE);
                        graficos.setFont(grande);
                        graficos.drawString(in.getTxt(), in.getX()+17, in.getY()+90);
                        o++;
                   }else chamaMeteoro.cancel();
               }
            }, 0, 3000);
        
        
        
        */
        
        
        for(int o = 0; o < 10 && o < enemy1.size();o++){
            Enemy1 in = enemy1.get(o);
                in.load();
                graficos.drawImage(in.getImagem(), in.getX(), in.getY(), this);
                graficos.setColor(Color.WHITE);
                graficos.setFont(grande);
                graficos.drawString(in.getTxt(), in.getX()+17, in.getY()+90);
        }
        
        if(enemy1.isEmpty()){
            inicializaInimigos();
            int delay =  timer.getDelay() > 5 ? timer.getDelay()-5 : 4;
            timer.setDelay(delay);
        }
        
        g.dispose();
    }

    //@Override;
    //metodo que vai atualizar a tela
    public void actionPerformed(ActionEvent e) {
        //player.update();
        
        /*List<Tiro> tiros = player.getTiros();
        for(int i = 0; i< tiros.size(); i++){
            Tiro m = tiros.get(i);
                if(m.isVisivel()){
                    m.update();
                }else{
                    tiros.remove(i);
                }
        }*/
        for(int i = 0; i < 10 && i < enemy1.size();i++){
            Enemy1 in =  enemy1.get(i);
            if(in.getY() < this.getWidth()){
                in.update();
            }else{
                enemy1.remove(i);
            }
        }
        
        //repinta a imagem sempre
        repaint();
    }
    
    
    
    public void TecladoApadter(){
        addKeyListener(new KeyListener(){
          
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                for(int o = 0; o < enemy1.size();o++){
                    Enemy1 in = enemy1.get(o);
                    in.load();
                    System.out.println("No obj: "+in.getTxt()+" No event: "+ e.getKeyChar());
                    if(in.getTxt() == null ? Character.toString(e.getKeyChar()) == null : in.getTxt().equals(Character.toString(e.getKeyChar()))){
                        enemy1.remove(o);
                        break;
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
               // player.KeyRelease(e);
                
            }
        });
}
}



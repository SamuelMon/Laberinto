import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Jugador {
    private int x= 36;
    private int y= 36;
    private int width= 36;
    private int height= 36;
    private int movement = 36;
    private Random rdn;


    /**
     * Pinta el personaje del jugador, que es un circulo.
     * @param g 
     */
    public void paint(Graphics g){
        g.setColor(Color.decode("#17A1D1"));
        g.fillOval(x, y, width, height); 
        g.drawOval(x, y, width, height);
    }
    
    /**
     * Detecta que tecla del teclado es presionada y si es una de las flechas, 
     * este realizara el mivimiento de posicion del jugador.
     * @param evt Objeto del tipo KeyEvent
     * @param lab Objeto de la clase Laberinto.
     */
    public void movimientoJugador(KeyEvent evt, Laberinto lab){
        int[][] matrixLab = lab.obtainsLabyrinth(Ventana.getNivel());
        if((evt.getKeyCode()==37) && (matrixLab[(x/36)-1][y/36])!= 1){
             x=x-movement;
        }
        if((evt.getKeyCode()==38) && (matrixLab[x/36][(y/36)-1] != 1)){
             y=y-movement;
        }
        if((evt.getKeyCode()==39) && (matrixLab[(x/36)+1][y/36] != 1)){
             x=x+movement;
        }
        if((evt.getKeyCode()==40) && (matrixLab[x/36][(y/36)+1] != 1)){
             y=y+movement;
        }
        
        if(matrixLab[x/36][y/36]==4){
            Ventana.setCamino(1);
        }
        if(matrixLab[x/36][y/36]==3){
            Ventana.cambiarNivel();
            Ventana.setCamino(0);
            x=36;
            y=36;
        }

    }
}

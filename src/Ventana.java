import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ventana extends JFrame{
    Laberinto lab = new Laberinto();
    Jugador player = new Jugador();
    public static int nivel = 1;
    public static int camino = 0;
    
    /**
     * Contructor de la clase Ventana
     */
    public Ventana(){
        addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                player.movimientoJugador(e,lab);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        setFocusable(true);
    }
    
    
    @Override
    /**
     * Llama los metodos para pintar tanto el laberinto como al personaje
     */
    public void paint(Graphics g){
        lab.paint(g);
        player.paint(g);
    }
    
    /**
     * Aumenta una variable que hace referencia al nivel en el que se encuentra el jugador
     * @return 
     */
    public static void cambiarNivel(){
        nivel = nivel +1;
    }    
    
    
    /**
     * Obtiene el nivel en el que se encuentra el jugador
     * @return 
     */
    public static int getNivel(){
        return nivel;
    }
    
    /**
     * Obtiene el valor de una variable que determina si el camino correcto se muestra o no.
     * @return valor de la variable camino.
     */
    public static int getCamino(){
        return camino;
    }
    
    /**
     * Cambia el valor de la variable camino.
     * @param x Valor que se le asignara a la variable camino.
     */
    public static void setCamino(int x){
        camino = x;
    }
    

    /**
     * Metodo prinipal
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException{
        Ventana vtn = new Ventana();
        vtn.setSize(504, 504);
        vtn.setVisible(true);
        vtn.setLocationRelativeTo(null);
        vtn.setResizable(false);
        vtn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while(true){
            Thread.sleep(100 );
            vtn.repaint(); 
            
            if(getNivel()>3){
                 JOptionPane.showConfirmDialog(null,"Felicitaciones has ganado!!!!","Game Over",JOptionPane.CLOSED_OPTION);
                 System.exit(0);
            }
        }
    }
    
}

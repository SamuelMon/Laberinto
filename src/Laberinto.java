import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Laberinto {
    
    public Random rdn = new Random();
    
    /**
     * Este metodo pinta el laberinto
     * @param g 
     */
    public void paint(Graphics g){
        int[][] laberinto = obtainsLabyrinth(Ventana.getNivel());
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14; j++) {
                
                if(laberinto[i][j]==0){
                    g.setColor(Color.WHITE);
                    g.fillRect(i*36,j*36,36,36);
                }
                if(laberinto[i][j]==1){
                    g.setColor(Color.BLACK);
                    g.fillRect(i*36, j*36,36,36);
                }
                if(laberinto[i][j]==2){
                    g.setColor(Color.decode("#58f5a6"));
                    g.fillRect(i*36, j*36, 36,36);
                }
                if(laberinto[i][j]==3){
                    g.setColor(Color.decode("#E55252"));
                    g.fillRect(i*36, j*36, 36,36);
                }    
                if(laberinto[i][j]==4){
                    g.setColor(Color.decode("#F4E140"));
                    g.fillRect(i*36, j*36, 36,36);
                }    
                if(laberinto[i][j]==5){
                    g.setColor(Color.WHITE);
                    g.fillRect(i*36, j*36, 36,36);
                }
                if(Ventana.getCamino() == 1){
                    if(laberinto[i][j]==5){
                        g.setColor(Color.decode("#F4E140"));
                        g.fillRect(i*36, j*36, 36,36);
                    }

                }
            }
        }
    }
    
    /**
     * Con este metodo se obtiene un Laberinto representado por una matriz.
     * @param x Es el numero indicador de el Laberinto
     * @return El metodo retorna una matriz que representa un Laberinto. 
     */
    public int[][] obtainsLabyrinth(int x){
        if(x == 1){
            int[][] laberinto = {{1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                                {1,2,1,1,0,1,0,1,1,1,0,1,0,1},
                                {1,5,5,5,5,5,5,5,5,0,0,0,0,1},
                                {1,0,1,0,1,1,1,1,5,1,0,1,0,1},
                                {1,0,1,0,0,0,0,1,5,1,0,1,0,1},
                                {1,1,1,1,0,1,0,1,5,1,0,1,0,1},
                                {1,1,4,1,1,1,0,1,5,1,0,1,0,1},
                                {1,1,0,0,0,0,0,1,5,1,0,0,1,1},
                                {1,1,1,1,1,1,1,1,5,1,1,1,1,1},
                                {1,0,5,5,5,5,5,5,5,0,0,1,1,1},
                                {1,1,5,1,1,0,1,0,1,1,1,0,1,1},
                                {1,1,5,1,1,1,1,1,1,1,5,5,5,1},
                                {1,0,5,5,5,5,5,5,5,5,5,1,3,1},
                                {1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
           return laberinto;
        } 
        if(x == 2){
           int[][] laberinto = {{1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                                {1,2,1,1,1,1,0,1,0,1,0,1,4,1},
                                {1,5,5,5,5,5,5,0,0,1,0,1,0,1},
                                {1,0,1,1,1,1,5,1,0,1,1,1,0,1},
                                {1,1,0,1,0,0,5,1,0,0,0,0,0,1},
                                {1,1,0,1,1,1,5,1,1,1,1,1,0,1},
                                {1,1,0,0,1,0,5,5,5,5,5,5,5,1},
                                {1,1,5,5,5,1,1,0,1,1,1,1,5,1},
                                {1,1,5,1,5,1,1,0,1,1,1,1,5,1},
                                {1,1,5,1,5,1,1,1,5,5,5,1,5,1},
                                {1,1,5,1,5,5,5,5,5,1,5,5,5,1},
                                {1,1,5,1,1,0,1,1,1,1,0,1,1,1},
                                {1,3,5,1,0,0,0,0,0,0,0,1,1,1},
                                {1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
           return laberinto;
        } 
        if(x == 3){
           int[][] laberinto ={{1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                                {1,2,1,1,1,1,1,1,1,1,1,1,1,1},
                                {1,5,5,0,0,0,0,0,0,0,0,0,1,1},
                                {1,1,5,1,1,1,1,1,0,1,1,1,1,1},
                                {1,1,5,5,1,0,0,0,0,1,1,1,1,1},
                                {1,1,1,5,0,0,1,1,0,0,0,0,0,1},
                                {1,1,0,5,5,5,0,1,4,1,1,1,0,1},
                                {1,1,1,1,1,5,1,0,1,1,1,1,0,1},
                                {1,1,0,1,5,5,1,5,5,5,0,1,0,1},
                                {1,1,0,1,5,1,1,5,1,5,1,1,0,1},
                                {1,1,0,1,5,1,1,5,1,5,1,1,1,1},
                                {1,1,0,0,5,5,5,5,1,5,5,5,5,1},
                                {1,1,0,1,0,1,1,1,1,1,1,1,3,1},
                                {1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
           return laberinto;
        } 
        return null;
    }

}
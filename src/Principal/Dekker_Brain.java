
package Principal;

import java.util.Arrays;
import javax.swing.JTextArea;



public class Dekker_Brain extends Thread implements Runnable{
   //Variables compartidas 
    protected int[] flag = {0,0};
    protected JTextArea Lienzo;
    protected RcCC RC;
    protected int id;
    protected String name;
    int turn = 0;
    private final int TIME = 2000;
    private int cierto = 1;
    protected boolean stop;
    
    
    
    public Dekker_Brain(int turn, JTextArea Lienzo, RcCC RC, int id, String name){
        this.turn = turn;
        this.Lienzo = Lienzo;
        this.RC = RC;
        this.id = id;
        this.name = name;
    }
    
    public void run(){
        System.out.println("Llegue al run de dekker");
        //RC.setRC(this.getName());
        while(cierto == 1){
            flag[id] = cierto;
            while(flag[1-id] == cierto){
                if(turn == (1-id)){
                    flag[id] = 0;
                    System.out.println("Esto dentro del if");
                    while(turn == (1-id)){}
                    flag[id] = 1;
                }
                RC.setRC(this.getName());
                System.out.println(RC.getRC() + "Esperando");
            }
            
            
            turn = 1-id;
            flag[id] = 0;
            
            /*Comprobar la muerte del perrito*/
            if(stop == true){
                    Lienzo.append("Ha sido asesinado");
                    break;
                }
             
            RC.setRC(this.getName().toString());
            Lienzo.append(RC.getRC()+"\n");
            try {
               
                Thread.sleep((int)(Math.random()* TIME + 1000));
            } catch (Exception e) {
            }

        }

        }//Final del run

      
        
    //Detener hilo
    synchronized void detener(){
        
        stop = true;
    }
        
    }
    
    
    
    
    
  
    
    


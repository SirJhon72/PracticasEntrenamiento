
package Principal;

import java.util.concurrent.Semaphore;
import javax.swing.JTextArea;

public class Mutex_Brain extends Thread implements Runnable{
    static Semaphore mutex = new Semaphore(1); //Solo una persona
    protected JTextArea Lienzo;
    protected RcCC RC;
    protected boolean stop = false;
    
    //Inicio del codigo
    public Mutex_Brain(JTextArea Lienzo, RcCC RC){
        this.Lienzo = Lienzo;
        this.RC = RC;
    }
    
public void run() {
        while(true){
              try {

                RC.setRC(this.getName());
                Lienzo.append(RC.getRC() + "\n");
                mutex.acquire(); //Tomamos el recurso
                try {
                    Thread.sleep(1000);
                    if(stop == true){
                        Lienzo.append(this.getName() + " \nha sido asesinado");
                        break;
                    }
                    
                } finally {
                    
                    mutex.release(); //Liberamos el recurso
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
    
    
          
        }



    synchronized void detener(){
        
        stop = true;
    }


    }
    
  
    

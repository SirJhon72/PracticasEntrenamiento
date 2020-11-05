
package Principal;

import javax.swing.JTextArea;


public class HiloCC extends Thread implements Runnable{
    protected JTextArea Lienzo;
    protected RcCC RC;
    
    //Variables para el control de los hilos
    private boolean Pausa;
    private boolean Stop;
    private final int TIME = 2000;

    
    public HiloCC(JTextArea Lienzo, RcCC RC){
        this.Lienzo = Lienzo;
        this.RC = RC;
    }
    
      public void run(){
        System.out.println("Llege al run");
             while(true){
                try {
                    RC.setRC(this.getName());
                    Lienzo.append(RC.getRC()+"\n");
                    Thread.sleep(1000);
                    

                    synchronized(this){ // <---- Para pausar el hilo
                        while(Pausa == true){
                            wait();
                        }
                    }

                    if(Stop == true){ // <---Para salir del hilo
                        Lienzo.append("\n" + this.getName() + " \nha sido asesinado :( ");
                        break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                
            }
        
    }
    
    
    
    
    //Metodos aun por comprobar si se usan o no
    //Pausar Hilo
    synchronized void pausa(){
        Pausa = true;
        Stop = false;
        notify();
    }
    
    //Reanudar hilo
    synchronized void reanudar(){
        Pausa = false;
        notify();
    }
    
    
    //Detener hilo
    synchronized void detener(){
        
        Stop = true;
    }
    
    
}

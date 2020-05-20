package exemotor;
public class Motor {
    int velocidade;
    String fabricante;
    int voltagem;
    boolean status;
    
    
    public void print(){
        System.out.println("\n" + ">>> A volocidade é de: " +this.velocidade+ " Rpm" + "\n");
        System.out.println(">>> O fabricante é: " +this.fabricante + "\n" );
        System.out.println(">>> A voltagem é:  " +this.voltagem + "\n");
    }
   public void onmotor(){
       this.status = true;
       System.out.println(">>> Motor ligado " + "\n");
    }
    
   public void offmotor(){
       System.out.println(">>> Motor desligado " + "\n");
    }
    
   public  void verificavelocidade(){
        System.out.println(">>> A velocidade está em " +this.velocidade+ " Rpm" + "\n");
    }
    
}



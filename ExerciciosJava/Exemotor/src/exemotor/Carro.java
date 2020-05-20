package exemotor;
import java.util.*;
public class Carro extends Motor {
    String cor ;
    String tipo;  
    
    public void aumentar(){
        Scanner troca = new Scanner (System.in);
        String Drive;
        System.out.println("o carro está ligado! Digite D para dar partida...");
        Drive = troca.next();
        if( "D".equals(Drive)){
        for (velocidade = 0; velocidade <= 5000; velocidade++){
            System.out.println("Acelerando... " +this.velocidade);
        }
    }
        else {
            System.out.println("Digito errado");
        }
    }
    
    public void reduzir (){
                for (velocidade = 50000; velocidade >=0; velocidade--){
            System.out.println("Reduzindo... " +this.velocidade);
        }
    }
    
    public void printC (){
        System.out.println("\n" +">>> A cor do carro é: " +this.cor+ "\n");
        System.out.println(">>> O tipo carro é: " +this.tipo+ "\n");
        System.out.println(">>> O fabricante é: " +this.fabricante + "\n" );
}
    
}

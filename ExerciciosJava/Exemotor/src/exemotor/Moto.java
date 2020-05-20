package exemotor;
import java.util.*;
public class Moto extends Carro {
    @Override
    
    public void reduzir(){
        for(velocidade = 5000; velocidade >= 0; velocidade -=50){
            System.out.println("Reduzindo... " +this.velocidade);
        }
    }
    
    @Override
    public void aumentar(){
        Scanner troca = new Scanner (System.in);
        String Drive;
        System.out.println("A moto está ligado! Digite D para dar partida...");
        Drive = troca.next();
        if ("D".equals(Drive)){
        for (velocidade = 0; velocidade <= 5000; velocidade += 50){
        System.out.println("Acelerando... "  +this.velocidade);
    }       
}
}
    public void printmot (){
        System.out.println("\n" + ">>> A cor da moto é: " +this.cor+ "\n");
        System.out.println(">>> O tipo da moto é: " +this.tipo+ "\n");
        System.out.println(">>> O fabricante é: " +this.fabricante + "\n" );
    }
}

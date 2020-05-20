package execaminhao;
import java.util.*;
public class Caminhao {
    String combustivel = "gasolina";
    int velocidade = 0;
    
    void begin(){
        System.out.println(">>> O caminhão está com " +combustivel+ " e sua velocidade é " +velocidade+ "Km");
//        this.combustivel = combustivel;
//        this.velocidade = velocidade;
    }
    
    void aumentar(){
        for (velocidade =0; velocidade <= 150; velocidade++){
            System.out.println("Aumnetando... " +this.velocidade);
        }
    }
    //= "gas" + "diesel" + "gasolina"
    void subst_combust(){ // gasosa
        Scanner troca = new Scanner (System.in);
        String pitstop;
        String pitstop4 = "gas";
        String pitstop2 = "diesel";
        String pitstop3 = "gasolina";
        System.out.println(">>> Combustiveis validos: gasolina, gas e diesel. ");
        System.out.println(">>> Digite o combustivel valido: ");
        pitstop = troca.nextLine();
        if (pitstop.equals(pitstop4) || pitstop.equals(pitstop2) || pitstop.equals(pitstop3)){
            System.out.println(">>> combustivel valido");
//            this.aumentar();
//            this.reduzir();
        }
        else {
            System.out.println(">>> combustivel " +pitstop+ " invalido");
        }
    }
    
    void reduzir (){
        for (velocidade = 150; velocidade >= 0; velocidade--){
            System.out.println("Reduzindo... " +this.velocidade);
        }
    }
}
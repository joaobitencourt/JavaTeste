package exemotor;
public class Exemotor{
    public static void main(String[] args) {
        Motor motortest = new Motor();
        motortest.velocidade = 100;
        motortest.fabricante = "Ford";
        motortest.voltagem = 12;
        motortest.print();
        motortest.status = false;
        motortest.offmotor();
        
        Motor motortest2 = new Motor();
        motortest2.velocidade = 150;
        motortest2.fabricante = "Fiat";
        motortest2.voltagem = 12;
        motortest2.print();
        motortest2.status = false;
        motortest2.offmotor();
        
        Motor motortest3 = new Motor();
        motortest3.velocidade = 200;
        motortest3.fabricante = "BMW";
        motortest3.voltagem = 12;
        motortest3.print();
        motortest3.status = false;
        motortest3.offmotor();
       
       Carro carro = new Carro ();
       carro.fabricante = "BWM";
       carro.cor = "Amarelo";
       carro.tipo = "Esporte";
       carro.status = true;
       carro.printC();
       carro.onmotor();
       carro.aumentar();
       carro.reduzir();

       Moto moto = new Moto();
       moto.cor = "Preta";
       moto.fabricante = "kawasaki";
       moto.status = true;
       moto.printmot();
       moto.onmotor();
       moto.aumentar();
       moto.reduzir();

    }
    
}

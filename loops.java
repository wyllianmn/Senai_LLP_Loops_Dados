import java.util.Random;
import java.util.Scanner;

public class loops
{
	public static void main(String[] args) {
		int i;
        String [] cubo = {"+---------+" + "\n" + "|         |" + "\n" + "|    1    |" +  "\n" + "|         |" + "\n" + "+---------+",
                          "+---------+" + "\n" + "|         |" + "\n" + "|    2    |" +  "\n" + "|         |" + "\n" + "+---------+",
                          "+---------+" + "\n" + "|         |" + "\n" + "|    3    |" +  "\n" + "|         |" + "\n" + "+---------+",
                          "+---------+" + "\n" + "|         |" + "\n" + "|    4    |" +  "\n" + "|         |" + "\n" + "+---------+",
                          "+---------+" + "\n" + "|         |" + "\n" + "|    5    |" +  "\n" + "|         |" + "\n" + "+---------+",
                          "+---------+" + "\n" + "|         |" + "\n" + "|    6    |" +  "\n" + "|         |" + "\n" + "+---------+",
};

     
       for(i=0;i < cubo.length;i ++){
          
       }                 
       Random jogar = new Random();
        int indiceAleatorio = jogar.nextInt(cubo.length); // Gera número entre 0 e 3

        System.out.println("Cubo sorteado:");
        System.out.println(cubo[indiceAleatorio]);
        
    



	}
}
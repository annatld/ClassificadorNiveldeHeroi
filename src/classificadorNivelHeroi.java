
import java.util.Scanner;

public class classificadorNivelHeroi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a quantidade de XP para saber qual o seu nível:");
        double xp = scanner.nextDouble();

        if (xp < 1.000){
            System.err.println("O Herói de nome: " +nome+ " ,esta no nível: "+xp+ "Ferro");
        }else if( xp > 1.001 && xp < 2.000 ){
            System.err.println("O Herói de nome: " +nome+ " ,esta no nível: "+xp+ "Bronze");
        }else if(xp > 2.001 && xp < 5.000){
            System.err.println("O Herói de nome: " +nome+ " ,esta no nível: "+xp+ "Prata");
        }else if (xp > 5.001 && xp < 7.000){
            System.err.println("O Herói de nome: " +nome+ " ,esta no nível: "+xp+ "Ouro");
        }else if (xp > 7.001 && xp < 8.000){
            System.err.println("O Herói de nome: " +nome+ " ,esta no nível: "+xp+ "Platina");
        }else if (xp > 8.001 && xp < 9.000){
            System.err.println("O Herói de nome: " +nome+ " ,esta no nível: "+xp+ "Ascendente");
        }else if (xp > 9.001 && xp < 10.000){
            System.err.println("O Herói de nome: " +nome+ " ,esta no nível: "+xp+ "Imortal");
        }else if (xp > 10.000){
            System.err.println("O Herói de nome: " +nome+ ",esta no nível: "+xp+ " Radiante");
        }
    }
}




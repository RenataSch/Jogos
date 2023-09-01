import java.util.Scanner;
public class Main {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        
        byte escolha;
        
        do{
            
            System.out.println("1-Jogar");
            System.out.println("0-Sair");
            System.out.println("OP:");
            escolha = sc.nextByte();
            
            switch(escolha) {
                case 1: 
                    System.out.println("Escolha sua Jogada: ");
                    System.out.println("(1)Pedra");
                    System.out.println("(2)Papel");
                    System.out.println("(3)Tesoura");
                    System.out.print("OP: ");
                    
                    byte jogada = sc.nextByte();
                    Jogo jogo = new Jogo(jogada);
                    System.out.println(jogo);
                    System.out.println("Resultado: " + jogo.verificarVencedor() + "\n");
                    break;
                    
                case 0:
                    System.out.println("JOGO ENCERRADO");
            }
        } while(escolha!=0);
    }
}
import java.util.Scanner;
public class jogo_sorte {
    public static void main (String[]args) {
        Scanner in = new Scanner (System.in);
        
        //jogo de cartas no qual quem tirar a carta com o número mais alto ganha.
        
        byte escolha;
        
        do {
            System.out.println("1-Jogar");
            System.out.println("0-Sair");
            System.out.println("OP:");
            escolha = in.nextByte();
          
            switch(escolha) {
                case 1:
                     System.out.println("***** sorte *****");
                     System.out.println("Vamos ao seu número sorteado: ");
                     int sorteio = (int)(Math.random()*10+1);
                     System.out.println("Seu número é: " + sorteio + "\n");
                     
                     
                     int sorteio2 = (int)(Math.random()*10+1);
                     System.out.println("O número do computador é: " + sorteio2 + "\n");
                     
                    if (sorteio >= sorteio2) {
                         System.out.println("Você gahou!" );
                    } else if (sorteio<=sorteio2) {
                        System.out.println("Você perdeu!");
                    } else if (sorteio == sorteio2) {
                        System.out.println("Empate");
                    }else {
                         System.out.println("O jogo deu erro :( ");
                    }
                     break;
                case 0:
                System.out.println("JOGO ENCERRADO");
             }
                
        } while(escolha!=0);
       
    }
}

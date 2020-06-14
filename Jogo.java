import java.util.*;

public class Jogo {
  
    //JOGO DESENVOLVIDO POR CAUÃ BRITO
    //AGRADECIMENTO MEU PROFESSOR DE JAVA: Adriano Ohana
  
    static int pontuacao = 0;
    static int tentativas = 0;
	
    public static void realizar(int opcao) {
        
        switch( opcao ) {
        case 1:
            Scanner reader = new Scanner (System.in);
            Random random = new Random();
            int numerog = random.nextInt(5);
            System.out.println("JOGO INICIADO");
            System.out.println("DIGITE UM NÚMERO:");
            int num = reader.nextInt();
            
            // Aqui porque sempre que eu jogar é uma tentativa, acertando ou errando
            tentativas++;

            if ( num == numerog ){
                System.out.println("Acertou");
                pontuacao++;
            } else {
                System.out.println("Errou, o número era " + numerog);
            }
            
            case 2:
                System.out.println("#=====================#");
                System.out.println("PONTUAÇÃO:" +pontuacao);
                System.out.println("TENTATIVAS:" +tentativas);
                System.out.println("ERROU:"+(tentativas-pontuacao));
                System.out.println("ACERTOU:"+pontuacao);
                System.out.println("#=====================#");
                break;
        }
    }
    
    private static void montaMenu() {
        System.out.println("");
        System.out.println("##################");
        System.out.println("## MENU DO JOGO ##");
        System.out.println("1 = JOGAR");
        System.out.println("2 = PONTUAÇÃO");
        System.out.println("0 = SAIR");
        System.out.println("##################");
        System.out.println("ESCOLHA UMA OPCÃO");
    }
    
    public static void main(String[] args) {
        
        int opcao = 1;
        Scanner sc = new Scanner(System.in);
        
        while ( opcao > 0 ) {
            montaMenu();
            opcao = sc.nextInt();
            realizar(opcao);
        }
        
        // Aqui usei o conceito de cast pra poder calcular decimais a partir de inteiros
        // Descobre como fazer para os decimais ficarem com apenas 2 casas
        double percent = (((double)pontuacao/(double)tentativas) * 100.0);
        System.out.println("Você jogou " + tentativas + " vezes e acertou " + percent + "% dos palpites.");        
        System.out.println("OBRIGADO POR JOGAR...");

        sc.close();
    }
}

import java.util.*;

public class jogo{
  
   //JOGO DESENVOLVIDO POR CAUÃ BRITO
	//AGRADECIMENTO MEU PROFESSOR DE JAVA: Adriano Ohana
  
	static int pontuacao = 0;
    static int tentaivas = 0;
	static int erros = 0;
	static int acertos = 0;
	
	
  public static void realizar(int opcao){
	
	switch( opcao ) {
	  case 1:
		Scanner reader = new Scanner (System.in);
		Random random = new Random();
		int numerog = random.nextInt(5);
		System.out.println("JOGO INICIADO");
		System.out.println("DIGITE UM NÚMERO:");
        int num = reader.nextInt();
		
		if ( num == numerog ){
		  System.out.println("GANHOU");
		  pontuacao ++;
		  acertos ++;
		  
		} else {
		  System.out.println("PERDEU");
		  tentaivas++;
		  erros++;
		  break;
		}
		case 2:
		System.out.println("#=====================#");
		System.out.println("PONTUAÇÃO:" +pontuacao);
		System.out.println("TENTATIVAS:" +tentaivas);
		System.out.println("ERROU:"+erros);
		System.out.println("ACERTOU:"+acertos);
		System.out.println("#=====================#");
		break;
	}
  }
  
  private static void montaMenu(){
	System.out.println("");
	System.out.println("##################");
	System.out.println("## MENU DO JOGO ##");
	System.out.println("1 = JOGAR");
	System.out.println("2 = PONTUAÇÃO");
	System.out.println("0 = SAIR");
	System.out.println("##################");
	System.out.println("ESCOLHA UMA OPCÃO");
  }
  
  public static void main(String[] args){
	
	int opcao = 1;
	Scanner sc = new Scanner(System.in);
	
	while ( opcao > 0 ) {
	  montaMenu();
	  opcao = sc.nextInt();
	  realizar(opcao);
	  
	}
	
	System.out.println("OBRIGADO POR JOGAR...");
	sc.close();
	
	
	
  }
}

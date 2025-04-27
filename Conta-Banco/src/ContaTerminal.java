import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        long CPF = 0; // variável long para o CPF.
        long CONTA = 0; // variável long para o CONTA.
        long AGENCIA =0;// variável long para o AGÊNCIA
        String SENHA = "";// variável long para o SENHA.
        String NOME ="A B C";// variável long para o NOME.

        // Loop para validar o CPF
        while (CPF != 11111111111L) {// while da um loop  caso erre o cpf irá pedi para digitar novamente.
            System.out.println("Digite seu CPF. Apenas números:");//Mensagem digite o CPF.
            CPF = scanner.nextLong();
            if (CPF != 11111111111L) {
                System.out.println("CPF inválido. Tente novamente.");
            }
        }
        

       
        while (CONTA != 1234567L) {
            System.out.println("Digite sua Conta. Apenas números:");
            CONTA = scanner.nextLong();
            if (CONTA != 1234567L) {
                System.out.println("Conta inválida. Tente novamente.");
            }
        }
    
     
        while (AGENCIA != 1234L) {
            System.out.println("Digite sua Agência. Apenas números:");
            AGENCIA = scanner.nextLong();
            if (AGENCIA != 1234) {
                System.out.println("Agência inválida. Tente novamente.");
            }
        }

       
         while (!SENHA.equals("12_R@e")) {
            System.out.println("Digite sua Senha. Apenas números:");
            SENHA = scanner.nextLine();
            if (!SENHA.equals("12_R@e")) {
                System.out.println("Senha Invalida. Tente novamente.");
            }
        }
        System.out.println("Bem-vindo, Sr. A B C");
        System.out.println("O Senhor Acabou de entra na sua conta BRADESCO");
        System.out.println("Nome:     "  + NOME);
        System.out.println("Conta:    " + CONTA);
        System.out.println("AGÊNCIA:  " + AGENCIA);
       
    }
}

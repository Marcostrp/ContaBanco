import java.util.Scanner; // importando a classe Scanner

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // chamando o scanner
        
        
        // definindo o número de tentativas
        int i = 0;
        while (i < 3) {

             // criando variáveis
            int conta = 2025;
            int agencia = 1234;
            String cliente = "Marcos";
            String senha = "4321";
            float saldo = 1000.35f;

            // mensagem de boas-vindas
            System.out.println("Bem-vindo ao banco!");

            // entrada de dados
            System.out.println("Por favor digite o número da conta:");
            int numeroConta = scanner.nextInt();

            System.out.println("Digite o número da agência:");
            int numeroAgencia = scanner.nextInt();

            System.out.println("Digite a senha");
            String numeroSenha = scanner.next();

            // Retornando os dados
            if ((numeroSenha.equals(senha)) && (numeroConta == conta) && (numeroAgencia == agencia)) {
                System.out.println("Olá " + cliente + "!");
                System.out.println("Sua conta " + conta + " da agência " + agencia + " possui o saldo de: R$" + saldo);
                System.out.println("Obrigado por usar nosso banco!");
                break; // encerra o loop em caso de sucesso
            } else {
                System.out.println("Dados inválidos!");
                System.out.println("Você tem mais " + (2 - i) + " tentativas.");
            }
            i++;
      
        }
    }
    
}
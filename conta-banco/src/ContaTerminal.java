import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Entrada de Dados
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o seu nome!");
        String nome = leitor.nextLine();
        System.out.println("Digite o número da agência!");
        String agencia = leitor.nextLine();
        System.out.println("Digite o número da conta!");
        int numero = leitor.nextInt();
        System.out.println("Digite o saldo!");
        double saldo = leitor.nextDouble();
        leitor.close();
        //saída de dados
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}

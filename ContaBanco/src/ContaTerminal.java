
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
            try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Olá, somos do Banco Tua Grana é meu Lucro");
            System.out.println("Por favor nos informe o número da sua conta.");
            int numero = scanner.nextInt();
            System.out.println("Por favor, agora digite sua agência");
            String agencia = scanner.next();
            System.out.println("Agora nos informe o seu nome");
            String nome = scanner.next();
            System.out.println("Agora o quanto deseja depositar em sua nova conta");
            Double saldo = scanner.nextDouble();
            scanner.close();
            System.out.println("Olá " + nome.toUpperCase() +" , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numero +" e seu saldo " + saldo + " já está disponível para saque, mas talvez seja melhor deixar ele um pouco conosco :)");
        } catch (InputMismatchException e) {
        System.err.println("Os campos devem ser preenchidos corretamente");
    }
    }
}

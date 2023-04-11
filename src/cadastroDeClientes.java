import java.util.Scanner;

public class cadastroDeClientes {
    public void  clienteNovo(String cpf){
        Scanner input = new Scanner(System.in);
        System.out.println("Verifiquei que o senhor não tem conta corrente no nosso Banco");
        System.out.println("Gostaria de fazer parte da nossa historia?");
        System.out.println("1.  Sim / 2. Não ");
        int opcao = input.nextInt();
        switch (opcao) {
            case 1 -> {
                System.out.println("Me Informe a sua data de nascimento");
                String nascimento = input.nextLine();
                System.out.println("Digite sua senha de acesso: ");
                String senhaDoCliente = input.nextLine();
            }
            case 2 -> System.out.println("NÃO!");
            default -> System.out.println("Opção Inválida, Tente Novamente!");
        }
    }
}

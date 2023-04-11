import java.util.Scanner;

public class EwBankApp {
    public static void main(String[] args) {
        cadastroDeClientes cadastrando = new cadastroDeClientes();
        Scanner input = new Scanner(System.in);
        // Iniciando o Projeto.
        System.out.println("====>> Seja Bem Vindo ao EW BANK <<====");
        System.out.print("|| Por gentileza, informe o seu nome: ");
        String nome = input.nextLine();

        System.out.print("Me Informe seu CPF: ");
        String cpfDoCliente = input.nextLine();
        String[] clientesCadastrados = {"70470961406", "70470961416"};
        boolean cpfValido = false;
        for (String cpf : clientesCadastrados) {
            if (cpf.equals(cpfDoCliente)) {
                cpfValido = true;
                break;
            }
        }
        if (cpfValido) System.out.println("Olá Bem Vindo de Volta! " + nome);
        else {
            cadastrando.clienteNovo(cpfDoCliente);
        }
    }
}
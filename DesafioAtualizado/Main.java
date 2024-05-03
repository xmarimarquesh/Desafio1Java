package Desafio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lista list = new Lista();

        System.out.println("----- Sistema de ponto -----");
        System.out.println("CPF: "); 
        String cpf_login = scanner.nextLine();
        System.out.println("Senha: ");
        String senha_login = scanner.nextLine();

        int choice = 0; // Declaração da variável choice

        while(choice != 4) {
            if((cpf_login.equals("12345678900")) && (senha_login.equals("1234"))) {
                System.out.println("-------- MENU ADM --------");
                System.out.println("1 - Cadastrar novo empregado");
                System.out.println("2 - Listar empregados");
                System.out.println("3 - Horas trabalhadas de um empregado");
                System.out.println("4 - Sair");
                System.out.println("Digite uma opção: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Digite o nome do empregado: ");
                        String name = scanner.next();
                        System.out.print("Digite o CPF do empregado: "); 
                        String cpf = scanner.next();
                        System.out.print("Data de nascimento: ");
                        String dataNasc = scanner.next();
                        System.out.print("Digite a senha do empregado: ");
                        String senha = scanner.next();
                        
                        Empregado empregado = new Empregado(name, cpf, senha, dataNasc, 0);

                        list.add(empregado);
                        break;
                    case 2:
                        System.out.println("-------- Lista de Empregados --------");
                        for (int j = 0; j < list.getSize(); j++) {
                            Empregado func = list.getIndex(j).getEmpregado();
                            System.out.println("Nome: " + func.getNome());
                            System.out.println("CPF: " + func.getCpf());
                            System.out.println("Data de Nascimento: " + func.getDataNasc());
                            System.out.println();
                        }

                        break;
                    case 3:
                        // Lógica para verificar horas trabalhadas
                        break;
                    case 4:
                        // Opção para sair
                        break;
                    default:
                        break;
                }
            } else if (VerificarFuncionario(list, cpf_login, senha_login) == true) {
                System.out.println("-------- MENU FUNCIONARIO --------");
                System.out.println("1 - Bater ponto");
                System.out.println("2 - Sair");
                System.out.println("Digite uma opção: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                    System.out.println("-----BATER O PONTO-----");
                        break;
                    default:
                        break;
                }
            }else{
                System.out.println("Login não encontrado.");
                break;
            }
        }
    }

    public static boolean VerificarFuncionario(Lista list, String cpf_login, String senha_login) {
        for(int i = 0; i < list.getSize(); i++) {
            Empregado empregado = list.getIndex(i).getEmpregado();

            if (empregado.getCpf().equals(cpf_login) && empregado.getSenha().equals(senha_login)) {
                return true;
            }
        }
        return false;
    }
}
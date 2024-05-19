import java.util.Scanner;
import java.util.ArrayList;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Empregado> empregados = new ArrayList<>();

        String nome, escolhaNome;
        int idade, escolha, escolhaDemisao;
        double salario;

        do{
            System.out.println("Menu:");
            System.out.println("1. Criar novo empregado");
            System.out.println("2. Promover empregado");
            System.out.println("3. Aumentar salário do empregado");
            System.out.println("4. Demitir empregado");
            System.out.println("5. Fazer aniversário do empregado");
            System.out.println("6. Mostrar detalhes dos empregados");
            System.out.println("7. Sair");
            System.out.println("Faça sua escolha: ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    input.nextLine();
                    System.out.print("Digite o nome do empregado: ");
                    nome = input.nextLine();

                    System.out.print("Digite a idade do empregado: ");
                    idade = input.nextInt();

                    System.out.print("Digite o salário do empregado: ");
                    salario = input.nextDouble();

                    Empregado empregadoObj = new Empregado(nome, idade, salario);
                    empregados.add(empregadoObj);
                
                    System.out.println("Empregado criado com sucesso!");
                    break;
                case 2:
                    input.nextLine();
                    System.out.print("Digite o nome do empregado que deseja promover: ");
                    escolhaNome = input.nextLine();

                    for(int i = 0; i < empregados.size(); i++){
                        Empregado empregado = empregados.get(i);
                        if (empregado.getNome().equals(escolhaNome)) {
                            empregado.Promover();
                            break;
                        }else{
                            System.out.println("Empregado não encontrado!");
                        }
                    }
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("Digite o nome do empregado que deseja aumentar o salario:");
                    escolhaNome = input.nextLine();

                    for(int i = 0; i < empregados.size(); i++){
                        double percAumento;
                        Empregado empregado = empregados.get(i);
                        if (empregado.getNome().equals(escolhaNome)) {
                            System.out.println("Informe o percentual de aumento sem o '%': ");
                            percAumento = input.nextDouble();

                            empregado.aumentarSalario(percAumento);
                        }else{
                            System.out.println("Empregado não encontrado!");
                        }
                    }
                    break;
                case 4:
                    input.nextLine();
                    System.out.println("Digite o nome do empregado que deseja demitir: ");
                    escolhaNome = input.nextLine();

                    for(int i = 0; i < empregados.size(); i++){
                        Empregado empregado = empregados.get(i);
                        if (empregado.getNome().equals(escolhaNome)) {
                            System.out.println("1-Justa causa");
                            System.out.println("2-Decisão do empregador");
                            System.out.println("3-Aposentadoria");
                            System.out.println("Digite sua escolha: ");
                            escolhaDemisao = input.nextInt();

                            empregado.demitir(escolhaDemisao);

                            empregados.remove(i);
                     
                        }else{
                            System.out.println("Empregado não encontrado");
                        }
                    }
                    break;
                case 5:
                    input.nextLine();
                    System.out.println("Digite o nome do empregado que deseja demitir: ");
                    escolhaNome = input.nextLine();

                    for(int i = 0; i < empregados.size(); i++){
                        Empregado empregado = empregados.get(i);
                        if (empregado.getNome().equals(escolhaNome)) {
                            empregado.fazerAniversario();
                        }else{
                            System.out.println("Empregado não encontrado!");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Você escolheu listar os empregados!");
                    for (int i = 0; i < empregados.size(); i++) {
                        Empregado empregado = empregados.get(i);
                        System.out.println(empregado);
                    }
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }while(escolha != 7);

        input.close();
    }
}
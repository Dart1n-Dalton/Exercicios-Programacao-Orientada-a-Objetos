/*
 * Dalton Augusto Pontes de Santis Filho 
 */
import java.util.Scanner;

public class UsaRH {
    public static void main(String[] args) {
        EmpresaRH rh = new EmpresaRH();
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n--- Menu RH ---");
            System.out.println("1 - Cadastrar Candidato");
            System.out.println("2 - Cadastrar Vaga");
            System.out.println("3 - Relacionar Candidato x Vaga");
            System.out.println("4 - Listar Vagas por Tipo");
            System.out.println("5 - Mostrar Candidatos");
            System.out.println("6 - Listar Candidatos x Vagas");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            op = Integer.parseInt(sc.nextLine());

            switch (op) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = Integer.parseInt(sc.nextLine());
                    System.out.print("Empregado (1) ou Desempregado (2)? ");
                    int tipo = Integer.parseInt(sc.nextLine());

                    if (tipo == 1) {
                        System.out.print("Empresa atual: ");
                        String empresa = sc.nextLine();
                        rh.cadastrarCandidato(new Empregado(nome, idade, empresa));
                    } else {
                        System.out.print("Meses sem trabalho: ");
                        int meses = Integer.parseInt(sc.nextLine());
                        rh.cadastrarCandidato(new Desempregado(nome, idade, meses));
                    }
                    break;

                case 2:
                    System.out.print("Descrição: ");
                    String desc = sc.nextLine();
                    System.out.print("Salário: ");
                    double sal = Double.parseDouble(sc.nextLine());
                    System.out.print("Estágio (1) ou Contrato (2)? ");
                    int tipoVaga = Integer.parseInt(sc.nextLine());

                    if (tipoVaga == 1) {
                        System.out.print("Duração (meses): ");
                        int dur = Integer.parseInt(sc.nextLine());
                        rh.cadastrarVaga(new Estagio(desc, sal, dur));
                    } else {
                        System.out.print("É temporário? (true/false): ");
                        boolean temp = Boolean.parseBoolean(sc.nextLine());
                        rh.cadastrarVaga(new Contrato(desc, sal, temp));
                    }
                    break;

                case 3:
                    System.out.print("Nome do candidato: ");
                    String nomeC = sc.nextLine();
                    System.out.print("Descrição da vaga: ");
                    String descV = sc.nextLine();
                    rh.relacionarCandidatoVaga(nomeC, descV);
                    break;

                case 4:
                    rh.listarVagasPorTipo();
                    break;

                case 5:
                    rh.mostrarCandidatos();
                    break;

                case 6:
                    rh.listarRelacoes();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (op != 0);

        sc.close();
    }
}

/*
 * Dalton Augusto Pontes de Santis Filho 
 */
import java.util.Scanner;

public class UsaColegio {
    public static void main(String[] args) {
        Colegio colegio = new Colegio();
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n--- Menu do Colégio ---");
            System.out.println("1 - Criar nova sala");
            System.out.println("2 - Adicionar professor a uma sala");
            System.out.println("3 - Adicionar aluno a uma sala");
            System.out.println("4 - Listar todas as salas");
            System.out.println("5 - Ver lucro total do colégio");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            op = Integer.parseInt(sc.nextLine());

            switch (op) {
                case 1:
                    System.out.print("Nome da sala: ");
                    String nomeSala = sc.nextLine();
                    colegio.adicionarSala(new Sala(nomeSala));
                    break;

                case 2:
                    System.out.print("Nome do professor: ");
                    String nomeP = sc.nextLine();
                    System.out.print("Idade: ");
                    int idadeP = Integer.parseInt(sc.nextLine());
                    System.out.print("Salário: ");
                    double sal = Double.parseDouble(sc.nextLine());
                    Professor p = new Professor(nomeP, idadeP, sal);

                    System.out.print("Quantas disciplinas? ");
                    int qtd = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < qtd; i++) {
                        System.out.print("Disciplina " + (i + 1) + ": ");
                        p.setDisciplina(sc.nextLine());
                    }

                    System.out.print("Sala a ser atribuída (0 até N-1): ");
                    int idxSalaP = Integer.parseInt(sc.nextLine());
                    colegio.salas[idxSalaP].setProfessor(p);
                    break;

                case 3:
                    System.out.print("Nome do aluno: ");
                    String nomeA = sc.nextLine();
                    System.out.print("Idade: ");
                    int idadeA = Integer.parseInt(sc.nextLine());
                    System.out.print("Curso: ");
                    String curso = sc.nextLine();
                    System.out.print("Mensalidade: ");
                    double mensal = Double.parseDouble(sc.nextLine());
                    Aluno a = new Aluno(nomeA, idadeA, curso, mensal);

                    System.out.print("Sala a ser atribuída (0 até N-1): ");
                    int idxSalaA = Integer.parseInt(sc.nextLine());
                    colegio.salas[idxSalaA].adicionarAluno(a);
                    break;

                case 4:
                    colegio.listarSalas();
                    break;

                case 5:
                    System.out.println("Lucro total do colégio: R$" + colegio.lucroTotal());
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

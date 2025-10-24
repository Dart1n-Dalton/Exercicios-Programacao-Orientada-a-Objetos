/*
 * Dalton Augusto Pontes de Santis Filho 
 */
import java.util.Scanner;

public class UsaZoologico {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n--- Menu Zoológico ---");
            System.out.println("1 - Cadastrar animal");
            System.out.println("2 - Listar animais");
            System.out.println("3 - Quantidade total de animais");
            System.out.println("4 - Quantidade por tipo (Voador, Terrestre, Aquático)");
            System.out.println("5 - Quantidade por tipo de habitat");
            System.out.println("6 - Área total ocupada");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            op = Integer.parseInt(sc.nextLine());

            switch (op) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Espécie: ");
                    String especie = sc.nextLine();
                    System.out.print("Tipo (Voador=1, Terrestre=2, Aquático=3): ");
                    int tipo = Integer.parseInt(sc.nextLine());
                    System.out.print("Habitat (jaula, gaiola, aquário, lago, viveiro): ");
                    String tipoHab = sc.nextLine();
                    System.out.print("Comprimento: ");
                    double comp = Double.parseDouble(sc.nextLine());
                    System.out.print("Largura: ");
                    double larg = Double.parseDouble(sc.nextLine());
                    System.out.print("Localização: ");
                    String local = sc.nextLine();
                    Habitat h = new Habitat(tipoHab, comp, larg, local);

                    if (tipo == 1) {
                        System.out.print("Cor da pena: ");
                        String cor = sc.nextLine();
                        zoo.adicionarAnimal(new Voador(nome, especie, h, cor));
                    } else if (tipo == 2) {
                        System.out.print("Qtd de patas: ");
                        int patas = Integer.parseInt(sc.nextLine());
                        zoo.adicionarAnimal(new Terrestre(nome, especie, h, patas));
                    } else {
                        System.out.print("Respira fora da água? (true/false): ");
                        boolean respira = Boolean.parseBoolean(sc.nextLine());
                        zoo.adicionarAnimal(new Aquatico(nome, especie, h, respira));
                    }
                    break;

                case 2:
                    zoo.listarAnimais();
                    break;

                case 3:
                    System.out.println("Total de animais: " + zoo.getTotalAnimais());
                    break;

                case 4:
                    System.out.println("Voador: " + zoo.contarTipo("Voador"));
                    System.out.println("Terrestre: " + zoo.contarTipo("Terrestre"));
                    System.out.println("Aquático: " + zoo.contarTipo("Aquático"));
                    break;

                case 5:
                    String[] habitats = {"jaula", "gaiola", "aquário", "lago", "viveiro"};
                    for (String hab : habitats) {
                        System.out.println(hab + ": " + zoo.contarHabitat(hab));
                    }
                    break;

                case 6:
                    System.out.println("Área total ocupada: " + zoo.calcularAreaTotal() + " m²");
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);
        sc.close();
    }
}

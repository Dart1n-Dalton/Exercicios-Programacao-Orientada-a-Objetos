/*
 * Dalton Augusto Pontes de Santis Filho 
 */
public class EmpresaRH {
    private Candidato[] candidatos = new Candidato[100];
    private Vaga[] vagas = new Vaga[100];
    private String[][] relacoes = new String[100][2];
    private int qtdCandidatos = 0, qtdVagas = 0, qtdRelacoes = 0;

    public void cadastrarCandidato(Candidato c) {
        if (qtdCandidatos < candidatos.length) {
            candidatos[qtdCandidatos++] = c;
        }
    }

    public void cadastrarVaga(Vaga v) {
        if (qtdVagas < vagas.length) {
            vagas[qtdVagas++] = v;
        }
    }

    public void relacionarCandidatoVaga(String nomeCandidato, String descricaoVaga) {
        relacoes[qtdRelacoes][0] = nomeCandidato;
        relacoes[qtdRelacoes][1] = descricaoVaga;
        qtdRelacoes++;
    }

    public void listarVagasPorTipo() {
        for (int i = 0; i < qtdVagas; i++) {
            System.out.println(vagas[i]);
        }
    }

    public void mostrarCandidatos() {
        for (int i = 0; i < qtdCandidatos; i++) {
            System.out.println(candidatos[i]);
        }
        System.out.println("Total: " + qtdCandidatos);
    }

    public void listarRelacoes() {
        for (int i = 0; i < qtdRelacoes; i++) {
            System.out.println("Candidato: " + relacoes[i][0] + " -> Vaga: " + relacoes[i][1]);
        }
    }
}

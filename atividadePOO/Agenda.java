package atividadePOO;

import java.util.*;

public class Agenda {
    private List<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(String nome) {
        contatos.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
    }

    public List<Contato> buscarContatos(String termo) {
        List<Contato> resultados = new ArrayList<>();
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(termo) ||
                c.getTelefone().equalsIgnoreCase(termo) ||
                c.getEmail().equalsIgnoreCase(termo)) {
                resultados.add(c);
            }
        }
        return resultados;
    }

    public void listarContatos() {
        for (Contato c : contatos) {
            System.out.println(c.getDetalhes());
        }
    }
}

package atividadePOO;

public class ContatoPessoal extends Contato {
    private String aniversario;
    private String endereco;

    public ContatoPessoal(String nome, String telefone, String email, String aniversario, String endereco) {
        super(nome, telefone, email);
        this.aniversario = aniversario;
        this.endereco = endereco;
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + ", Aniversário: " + aniversario + ", Endereço: " + endereco;
    }
}

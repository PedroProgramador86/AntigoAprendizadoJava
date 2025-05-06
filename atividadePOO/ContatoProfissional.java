package atividadePOO;

public class ContatoProfissional extends Contato {
    private String empresa;
    private String cargo;

    public ContatoProfissional(String nome, String telefone, String email, String empresa, String cargo) {
        super(nome, telefone, email);
        this.empresa = empresa;
        this.cargo = cargo;
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + ", Empresa: " + empresa + ", Cargo: " + cargo;
    }
}

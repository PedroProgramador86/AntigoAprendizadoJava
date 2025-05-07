package atividadePOO;

public class Contato {

    protected String nome;          // Variaveis
    protected String telefone;      //    de
    protected String email;         // Instancia

    public Contato(String nome, String telefone, String email) { // Construtor

        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    
    }

    // Retornando Valores bloqueados pelo "protected" das variaveis de instancia

    public String getNome() { 
    
        return nome; 
    
    }
    
    public String getTelefone() { 
    
        return telefone; 
    
    }
    
    public String getEmail() { 
    
        return email; 
    
    }

    public String getDetalhes() {
        return "Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email;
    
    }
}

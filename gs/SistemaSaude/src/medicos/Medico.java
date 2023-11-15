package medicos;

public class Medico {
    private int identificacao;
    private String crm;
    private String nome;
    private String telefone;
    private String especialidade;

    public Medico(int identificacao, String crm, String nome, String telefone, String especialidade) {
        this.identificacao = identificacao;
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.especialidade = especialidade;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}

package medicos;

public class Especialidade {
    private int identificacao;
    private String codigo;
    private String nome;

    public Especialidade(int identificacao, String codigo, String nome) {
        this.identificacao = identificacao;
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

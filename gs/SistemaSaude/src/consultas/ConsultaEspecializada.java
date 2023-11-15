package consultas;

import medicos.Medico;
import pacientes.Paciente;

public class ConsultaEspecializada extends Consulta {
    private String codigoEspecialidade;
    private String nomeEspecialidade;

    public ConsultaEspecializada(int identificacao, Medico medico, Paciente paciente, String descricao, 
                                 String codigoEspecialidade, String nomeEspecialidade) {
        super(identificacao, medico, paciente, descricao, null); 
        this.codigoEspecialidade = codigoEspecialidade;
        this.nomeEspecialidade = nomeEspecialidade;
    }

    @Override
    public String exibirInformacoes() {
        return String.format("Consulta Especializada %d - %s (%s)", getIdentificacao(), getPaciente().getNome(), nomeEspecialidade);
    }

    public String getCodigoEspecialidade() {
        return codigoEspecialidade;
    }

    public void setCodigoEspecialidade(String codigoEspecialidade) {
        this.codigoEspecialidade = codigoEspecialidade;
    }

    public String getNomeEspecialidade() {
        return nomeEspecialidade;
    }

    public void setNomeEspecialidade(String nomeEspecialidade) {
        this.nomeEspecialidade = nomeEspecialidade;
    }
}

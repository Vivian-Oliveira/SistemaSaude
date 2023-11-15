package consultas;

import java.util.Date;

import medicos.Medico;
import pacientes.Paciente;

public class Consulta {
    private int identificacao;
    private Medico medico;
    private Paciente paciente;
    private String descricao;
    private Date dataConsulta;

    public Consulta(int identificacao, Medico medico, Paciente paciente, String descricao, Date dataConsulta) {
        this.identificacao = identificacao;
        this.medico = medico;
        this.paciente = paciente;
        this.descricao = descricao;
        this.dataConsulta = dataConsulta;
    }

    public String exibirInformacoes() {
        return String.format("Consulta %d - %s (%tF)", identificacao, paciente.getNome(), dataConsulta);
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }
}

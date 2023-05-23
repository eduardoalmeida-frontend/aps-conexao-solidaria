package model;

public class PontoDeColeta {

    private String nome;
    private Integer cnpj;
    private Endereco endereco;
    private String email;
    private String telefone;
    private Hora horarioAbertura;
    private Hora horarioFechamento;

    public PontoDeColeta(String nome, Integer cnpj, Endereco endereco, String email, String telefone, Hora horarioAbertura, Hora horarioFechamento) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.horarioAbertura = horarioAbertura;
        this.horarioFechamento = horarioFechamento;
    }

    public PontoDeColeta() {
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Hora getHorarioAbertura() {
        return horarioAbertura;
    }

    public void setHorarioAbertura(Hora horarioAbertura) {
        this.horarioAbertura = horarioAbertura;
    }

    public Hora getHorarioFechamento() {
        return horarioFechamento;
    }

    public void setHorarioFechamento(Hora horarioFechamento) {
        this.horarioFechamento = horarioFechamento;
    }

    public String horarioFuncionamento(Hora horarioAbertura, Hora horarioFechamento) {
        String horarioAberturaFormatado = String.format("%02d:%02d", horarioAbertura.getHora(), horarioAbertura.getMinuto());
        String horarioFechamentoFormatado = String.format("%02d:%02d", horarioFechamento.getHora(), horarioFechamento.getMinuto());
        return "Das " + horarioAberturaFormatado + " às " + horarioFechamentoFormatado;
    }

}
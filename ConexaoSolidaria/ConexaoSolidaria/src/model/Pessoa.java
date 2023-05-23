package model;

public abstract class Pessoa {
    
    private String nome;
    private String CPF;
    private int qtdDependentes;
    private float rendaFamiliar;
    private String endereco;
    private String telefone;
    private String email;

    public Pessoa(String nome, String CPF, int qtdDependentes, float rendaFamiliar, String endereco, String telefone, String email) {
        
        this.nome = nome;
        this.CPF = CPF;
        this.qtdDependentes = qtdDependentes;
        this.rendaFamiliar = rendaFamiliar;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public int getQtdDependentes() {
        return qtdDependentes;
    }

    public void setQtdDependentes(int qtdDependentes) {
        this.qtdDependentes = qtdDependentes;
    }

    public float getRendaFamiliar() {
        return rendaFamiliar;
    }

    public void setRendaFamiliar(float rendaFamiliar) {
        this.rendaFamiliar = rendaFamiliar;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "\n-----------------------"+
                "\nDoador" +
                "\nNome: " + nome +
                "\nCPF: " + CPF +
                "\nQuantidade de Dependentes: " + qtdDependentes +
                "\nRenda Familiar: " + rendaFamiliar +
                "\nEndereço: " + endereco + 
                "\nTelefone: " + telefone + 
                "\nEmail: " + email +"\n";
    }

}

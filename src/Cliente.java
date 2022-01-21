
public class Cliente {

    protected String nome;
    protected int cpf;
    protected int codigo;
    protected String endereco;
    protected String tipoCliente;

    public Cliente() {

    }

    public Cliente(int codigo, String nome, int cpf, String endereco, String tipoCliente, int agencia, int numero){
        this.nome = nome;
        this.cpf = cpf;
        this.codigo = codigo;
        this.endereco = endereco;
        this.tipoCliente = tipoCliente;

    }

    public String ToString() {

        String resposta = "";
        resposta += "Nome: " + this.nome + System.lineSeparator();
        resposta += "CPF: " + this.cpf + System.lineSeparator();
        resposta += "Codigo: " + this.codigo + System.lineSeparator();
        resposta += "Endereco: " + this.endereco + System.lineSeparator();
        resposta += "Tipo Cliente: " + this.tipoCliente + System.lineSeparator();
        return resposta;

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCpf() {return cpf;}
    public void setCpf(int cpf) {this.cpf = cpf;}
    public int getCodigo() {return codigo;}
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public String getEndereco() {return endereco;}
    public void setEndereco(String endereco) {this.endereco = endereco;}
    public String getTipoCliente() {return tipoCliente;}
    public void setTipoCliente(String tipoCliente) {this.tipoCliente = tipoCliente;}

    public String retornaNome(){
        return this.nome;
    }
    public int retornaCodigo(){
        return this.codigo;
    }
    public int retornaCpf(){
        return this.cpf;
    }
    public String retornaEndereco(){
        return this.endereco;
    }
    public String retornaTipoCliente(){
        return this.tipoCliente;
    }
}

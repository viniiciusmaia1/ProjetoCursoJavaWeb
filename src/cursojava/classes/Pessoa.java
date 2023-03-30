package cursojava.classes;

public abstract class Pessoa {
  protected String nome;
  protected int idade;
  protected String dataNascimento;
  protected String registroGeral;
  protected String numeroCpf;

  public abstract boolean isActive();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getRegistroGeral() {
    return registroGeral;
  }

  public void setRegistroGeral(String registroGeral) {
    this.registroGeral = registroGeral;
  }

  public String getNumeroCpf() {
    return numeroCpf;
  }

  public void setNumeroCpf(String numeroCpf) {
    this.numeroCpf = numeroCpf;
  }
}

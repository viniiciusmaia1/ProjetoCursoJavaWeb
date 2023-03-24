package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

  String nome;
  int idade;
  String dataNascimento;
  String registroGeral;
  String numeroCpf;
  String nomeMae;
  String nomePai;
  String dataMatricula;
  String nomeEscola;

  public List<Disciplina> getDisciplinas() {
    return disciplinas;
  }

  public void setDisciplinas(List<Disciplina> disciplinas) {
    this.disciplinas = disciplinas;
  }

  String serieMatriculado;

  private List<Disciplina> disciplinas = new ArrayList<>();

  public Aluno() {

  }

  public Aluno(String nomePadrao) {
    nome = nomePadrao;
  }

  public Aluno(String nomePadrao, int idadePadrao) {
    nome = nomePadrao;
    idade = idadePadrao;
  }

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

  public String getNomeMae() {
    return nomeMae;
  }

  public void setNomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
  }

  public String getNomePai() {
    return nomePai;
  }

  public void setNomePai(String nomePai) {
    this.nomePai = nomePai;
  }

  public String getDataMatricula() {
    return dataMatricula;
  }

  public void setDataMatricula(String dataMatricula) {
    this.dataMatricula = dataMatricula;
  }

  public String getNomeEscola() {
    return nomeEscola;
  }

  public void setNomeEscola(String nomeEscola) {
    this.nomeEscola = nomeEscola;
  }

  public String getSerieMatriculado() {
    return serieMatriculado;
  }

  public void setSerieMatriculado(String serieMatriculado) {
    this.serieMatriculado = serieMatriculado;
  }

  @Override
  public String toString() {
    return "Aluno{" +
        "nome='" + nome + '\'' +
        ", idade=" + idade +
        ", dataNascimento='" + dataNascimento + '\'' +
        ", registroGeral='" + registroGeral + '\'' +
        ", numeroCpf='" + numeroCpf + '\'' +
        ", nomeMae='" + nomeMae + '\'' +
        ", nomePai='" + nomePai + '\'' +
        ", dataMatricula='" + dataMatricula + '\'' +
        ", nomeEscola='" + nomeEscola + '\'' +
        ", serieMatriculado='" + serieMatriculado + '\'' +
        '}';
  }

  public double getMediaNota() {

    double somaNotas = 0.0;

    for (Disciplina disciplina : disciplinas) {
      somaNotas += disciplina.getNota();
    }

    return somaNotas/disciplinas.size();
  }

  public boolean getAlunoAprovado() {
    double media = this.getMediaNota();
    if (media >= 70) {
      return true;
    } else {
      return false;
    }
  }

  public String getResultadoAluno() {
    double media = this.getMediaNota();
    if (media >=50) {
      if (media >=70) {
       return  "O aluno está aprovado!";
      }else {
       return "O aluno está de recuperação!";
      }
    } else {
      return "O aluno está reprovado!";
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Aluno aluno)) {
      return false;
    }
    return getIdade() == aluno.getIdade() && getNome().equals(aluno.getNome())
        && getDataNascimento().equals(aluno.getDataNascimento()) && getRegistroGeral().equals(
        aluno.getRegistroGeral()) && getNumeroCpf().equals(aluno.getNumeroCpf())
        && getNomeMae().equals(aluno.getNomeMae()) && getNomePai().equals(aluno.getNomePai())
        && getDataMatricula().equals(aluno.getDataMatricula()) && getNomeEscola().equals(
        aluno.getNomeEscola()) && getSerieMatriculado().equals(aluno.getSerieMatriculado());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getNome(), getIdade(), getDataNascimento(), getRegistroGeral(),
        getNumeroCpf(), getNomeMae(), getNomePai(), getDataMatricula(), getNomeEscola(),
        getSerieMatriculado());
  }
}

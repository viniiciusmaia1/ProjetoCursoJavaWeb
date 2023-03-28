package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

  public static void main(String[] args) {

    /*new Aluno() e uma instancia (Criacao de Objeto)
    aluno1 e uma referencia para o objeto aluno*/

    List<Aluno> alunos = new ArrayList<Aluno>();
    HashMap<String, List<Aluno>> situacaoAluno = new HashMap<>();

    for (int quantidade = 1; quantidade <= 3; quantidade++) {

      //Aluno
      String nome = JOptionPane.showInputDialog("Qual é o nome do aluno " + quantidade + "?");
//    String idade = JOptionPane.showInputDialog("Qual é a idade do aluno?");
//    String dataNascimento = JOptionPane.showInputDialog("Qual é a data de nascimento do aluno?");


      Aluno aluno1 = new Aluno();
      aluno1.setNome(nome);
//    aluno1.setIdade(Integer.parseInt(idade));
//    aluno1.setDataNascimento(dataNascimento);
//    aluno1.setRegistroGeral(registroGeral);

      Disciplina listDisciplina = new Disciplina();

      for (int pos = 1; pos <= 2; pos++) {
        String disciplina = JOptionPane.showInputDialog("Qual é a disciplina " + pos + "?");
        String notaDisciplina = JOptionPane.showInputDialog(
            "Qual é a nota do aluno na disciplina " + disciplina + "?");

        listDisciplina.setDisciplina(disciplina);
        listDisciplina.setNota(Double.parseDouble(notaDisciplina));
        aluno1.getDisciplinas().add(listDisciplina);
      }

      int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

      if (escolha == 0) { //Opção sim = 0

        int continuarRemover = 0;
        int posicao = 1;

        while (continuarRemover == 0) {
          String disciplinaRemover = JOptionPane.showInputDialog(
              "Qual disciplina deseja remover: 1,2,3,4 ?");

          aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
          posicao++;
          continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
        }
      }

      alunos.add(aluno1);

    }

    situacaoAluno.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
    situacaoAluno.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
    situacaoAluno.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

    for (Aluno aluno : alunos) {
      if (aluno.getStatusAluno().equalsIgnoreCase(StatusAluno.APROVADO)) {
        situacaoAluno.get(StatusAluno.APROVADO).add(aluno);
      } else if (aluno.getStatusAluno().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
        situacaoAluno.get(StatusAluno.RECUPERACAO).add(aluno);
      } else {
        situacaoAluno.get(StatusAluno.REPROVADO).add(aluno);
      }
    }

    System.out.println("----------------- Lista dos Aprovados ------------");
    for (Aluno aluno : situacaoAluno.get(StatusAluno.APROVADO)) {
      System.out.println("Aluno = " + aluno.getNome()
          + " Resultado = " + aluno.getStatusAluno() + " com media de = " + aluno.getMediaNota());
    }

    System.out.println("----------------- Lista dos alunos em Recuperacao ------------");
    for (Aluno aluno : situacaoAluno.get(StatusAluno.RECUPERACAO)) {
      System.out.println("Aluno = " + aluno.getNome()
          + " Resultado = " + aluno.getStatusAluno() + " com media de = " + aluno.getMediaNota());
    }

    System.out.println("----------------- Lista dos Reprovados ------------");
    for (Aluno aluno : situacaoAluno.get(StatusAluno.REPROVADO)) {
      System.out.println("Aluno = " + aluno.getNome()
          + " Resultado = " + aluno.getStatusAluno() + " com media de = " + aluno.getMediaNota());
    }

  }
}
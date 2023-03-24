package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

  public static void main(String[] args) {

    /*new Aluno() e uma instancia (Criacao de Objeto)
    aluno1 e uma referencia para o objeto aluno*/

    //Aluno
    String nome = JOptionPane.showInputDialog("Qual é o nome do aluno?");
//    String idade = JOptionPane.showInputDialog("Qual é a idade do aluno?");
//    String dataNascimento = JOptionPane.showInputDialog("Qual é a data de nascimento do aluno?");
//    String registroGeral = JOptionPane.showInputDialog("Qual é RG?");
//    String cpf = JOptionPane.showInputDialog("Qual é o CPF?");

    Aluno aluno1 = new Aluno();
    aluno1.setNome(nome);
//    aluno1.setIdade(Integer.parseInt(idade));
//    aluno1.setDataNascimento(dataNascimento);
//    aluno1.setRegistroGeral(registroGeral);
//    aluno1.setNumeroCpf(cpf);

    Disciplina listDisciplina = new Disciplina();

    for (int pos = 1; pos <= 4; pos++) {
      String disciplina = JOptionPane.showInputDialog("Qual é a disciplina " + pos + "?");
      String notaDisciplina = JOptionPane.showInputDialog("Qual é a nota do aluno na disciplina " + disciplina + "?");

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

    System.out.println("A média da nota do aluno " + aluno1.getNome() + " é: " + aluno1.getMediaNota());
    System.out.println("////////////////////////");
    System.out.println("Estado do aluno: " + aluno1.getResultadoAluno());

  }
}
package InstanciaAtributosObjeto;

import javax.swing.JOptionPane;

public class ProgramaAluno {

	public static void main(String[] args) {
		// New Aluno é uma instância (Criação do Objeto)
		// aluno1 é uma referência para o Objeto Aluno
		Aluno aluno1 = new Aluno();

		String nome = JOptionPane.showInputDialog("Qual o Nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String sexo = JOptionPane.showInputDialog("Qual o Sexo do aluno?");
		String turma = JOptionPane.showInputDialog("Qual o nome da turma?");

		// Instanciando a primeira nota e a primeira Disciplina
		Nota nota1 = new Nota();
		nota1.setDisciplina("Banco de Dados");
		nota1.setNota(9);

		// Instanciando a segunda nota e a segunda Disciplina
		Nota nota2 = new Nota();
		nota2.setDisciplina("JavaScript");
		nota2.setNota(10);

		// Instanciando a terceira nota e a terceira Disciplina
		Nota nota3 = new Nota();
		nota3.setDisciplina("CSS");
		nota3.setNota(8);

		// Inserindo todas as Discuplinas e notas na Lista que foi criada na classe
		// Aluno.
		aluno1.getNotas().add(nota1);
		aluno1.getNotas().add(nota2);
		aluno1.getNotas().add(nota3);

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setSexo(sexo);
		aluno1.setTurma(turma);
		
		System.out.println("Nome aluno: " +aluno1.getNome());
		System.out.println("Idade: " +aluno1.getIdade());
		System.out.println("Turma: " +aluno1.getTurma());
		System.out.println("Sexo: " +aluno1.getSexo());
		System.out.println("Media: " +aluno1.MediaAluno());
		

	}

}

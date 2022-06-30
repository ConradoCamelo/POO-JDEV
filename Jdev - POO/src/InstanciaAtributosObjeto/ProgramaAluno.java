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
		//Adicionando uma lista de forma Dinâmica
		for (int i = 0; i<4; i++) {
			String disciplina = JOptionPane.showInputDialog("Qual a Disciplina");
			String notaDisciplina = JOptionPane.showInputDialog("Qual a Nota "+(i+1));
			
			Nota nota = new Nota();
			nota.setDisciplina(disciplina);
			nota.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getNotas().add(nota);	
			
		}
		//Removendo da Lista 
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja Remover uma Disciplina?");
		
		if (escolha == 0 ) {
			String discilpinaRemover = JOptionPane.showInputDialog("Qual Disciplina deseja remover 1,2,3,4?");
			aluno1.getNotas().remove(Integer.valueOf(discilpinaRemover)-1);
		}
		
				
		
				

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

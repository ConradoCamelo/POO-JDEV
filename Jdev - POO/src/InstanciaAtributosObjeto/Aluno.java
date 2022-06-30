package InstanciaAtributosObjeto;
//Para Criar Listas é preciso lembrar de importar essas Classes.
import java.util.ArrayList;
import java.util.List;

public class Aluno {
	//Atributos
	private String nome;
	private Integer idade;
	private String turma;
	private String sexo;
	
	//instanciando Notas e criando Listas (Interpreta de acordo com oque estar entre "<>" que é uma lista de notas
	private List<Nota>  notas = new ArrayList <Nota>(); 
	
	public List<Nota> getNotas() {
		return notas;
	}
	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	//Método que retorna a média 
	public double MediaAluno () {
		
		double somaNota = 0;
		for (Nota nota : notas) {
			somaNota = somaNota + nota.getNota(); 
		}
		
		double media = somaNota/notas.size();
		return media;
		
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", turma=" + turma + ", sexo=" + sexo + "]";
	}
	
	
	
	

}

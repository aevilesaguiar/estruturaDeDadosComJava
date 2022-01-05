package arrays;

public class Curso {
	
	
	private String nomeCurso;
	private int minutos;
	
	
	public Curso(String curso) {
		this.nomeCurso=curso;


	}
	

	public int getMinutos() {
		return minutos;
	}
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Curso: "+this.nomeCurso +"]\n";
	}
	
	//O "equals" é o método que serve para comparar dois objetos,
	//no caso curso
	//Faremos um casting do object para curso:
	@Override
	public boolean equals(Object obj) {
		Curso outro = (Curso) obj;
		return outro.getNomeCurso().equals(this.nomeCurso);
	}
}

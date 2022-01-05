package arrays;
public class VetorTesteCurso {

public static void main(String[] args) {
	
	
	Curso c1= new Curso("Estrutura de Dados");
	Curso c2 = new Curso("Algoritmos");
	Curso c3 = new Curso("Armazenamento de Vetores");
	
	VetorCurso curso = new VetorCurso();
	System.out.println( curso.tamanho());
	curso.adiciona(c1);
	System.out.println( curso.tamanho());
	curso.adiciona(c2);
	System.out.println( curso.tamanho());
	curso.adiciona(c3);
	System.out.println( curso.tamanho());

	
	
	System.out.println(curso);

	
	System.out.println(curso.contem(c3));
	
	Curso x = curso.pega(1);
	
	System.out.println(x);
	
	curso.adiciona(1, c3);
	
	System.out.println(curso);
	
	System.out.println("Remoção");
	
	curso.remove(0);

	System.out.println(curso);
	
}

}

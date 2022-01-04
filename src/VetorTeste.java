
public class VetorTeste {

	public static void main(String[] args) {

			Aluno a1 = new Aluno("Joao");
			Aluno a2=new Aluno("Maria");
			
			Vetor lista = new Vetor();
			
			System.out.println(lista.tamanho());
			lista.adiciona(a1);
			System.out.println(lista.tamanho());
			lista.adiciona(a2);
			System.out.println(lista.tamanho());
			System.out.println(lista);
			
			System.out.println(lista.contem(a2));
			Aluno a3=new Aluno("Jose");
			System.out.println(lista.contem(a3));
			
			lista.adiciona(a3);
			System.out.println(lista);
			lista.remove(1);
			System.out.println(lista);
			
			for(int i = 0; i < 300; i++) {
			    Aluno y = new Aluno("Joao" + i);
			    lista.adiciona(y);
			}
			System.out.println(lista);
	}

}

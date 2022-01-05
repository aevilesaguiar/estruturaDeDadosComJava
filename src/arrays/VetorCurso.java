package arrays;
import java.util.Arrays;

public class VetorCurso {
	
	private Curso[] cursos=new Curso[10];

	private int totalCursos=0;

	
	public void adiciona(Curso curso) {
		
		this.cursos[totalCursos]=curso;
		this.garanteEspaco();

		totalCursos++;

			}
			
	public void adiciona(int posicao, Curso curso) {
		this.garanteEspaco();
		
		if(!posicaoValida(posicao)) {
			 throw new IllegalArgumentException("posicao invalida");
	    }
		
		for(int i = totalCursos - 1; i >= posicao; i-=1) {
	        cursos[i+1] = cursos[i];
	    }
	    cursos[posicao] = curso;
	    totalCursos++;

			}
	private boolean posicaoValida(int posicao) {
		return posicao >=0 && posicao <totalCursos;
	}


	public void remove(int posicao) {
		for (int i = posicao; i < this.totalCursos; i++) {
			this.cursos[i]=this.cursos[i+1];
		}
			totalCursos --;
		
			}
	
	public Curso pega(int posicao) {
		if(!posicaoOcupada(posicao)) {
			//Essa parte é muito importante pois é nossa responsabilidade a implementação da estrutura para garantir que ela trate bem qualquer dado errado passado pelo usuário.
			throw new IllegalArgumentException("posiçao invalida");
		}
		
		return cursos[posicao] ;
		
	}
	


	public boolean contem(Curso curso) {
		
		
		for (int i = 0; i < totalCursos; i++) {
			if(curso.equals(cursos[i])) {
				return true;
			}
			
		}
		return false;
	}
	
	public int tamanho() {
		return totalCursos;
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >=0 && posicao <totalCursos;
	}
	
	private void garanteEspaco() {
	    if(totalCursos == cursos.length) {
	        Curso[] novoArray = new Curso[cursos.length*2];
	        for(int i = 0; i < cursos.length; i++) {
	            novoArray[i] = cursos[i];
	        }
	        this.cursos= novoArray;
	    }

	}

	@Override
	public String toString() {
		return Arrays.toString(this.cursos);
	}






}

import java.util.ArrayList;
import java.util.Queue;

public class Fila {
	
	private static Fila f;
	private int IdFilosofo;
	
	private ArrayList<Integer> fila = new ArrayList<>();

	public int getIdFilosofo() {
		return IdFilosofo;
	}

	public void setIdFilosofo(int idFilosofo) {
		IdFilosofo = idFilosofo;
	}
	
	public static synchronized Fila getInstance() {
		if(f==null) {
			return f = new Fila();
		}else {
			return f;
		}
	}
	
	public void addFila(int id) {
		
		int tamanhoFila = fila.size();
		
		if(tamanhoFila==0) {
			
			fila.add(id);
			System.out.println("Filosofo "+id+" entrou na posição "+fila.size()+" da fila");
			
		}else {
			
			boolean v = false;
			
			for(int i=0;i<tamanhoFila;i++) {
				
				if(fila.get(i)==id) {
					
					v=true;
				}
			}
			if(v==true) {
				
			}else {
				
				fila.add(id);
				System.out.println("+++++++ Filosofo "+id+" entrou na posição "+fila.size()+" da fila ++++++++");
			}
			
		}		
		
	}
	
	public void removerFila(int id) {
		
		if(fila.get(0)==id) {
			
			fila.remove(0);
			System.out.println("----- O filosofo "+id+ "saiu da fila -----");
		}
	}
	
	public boolean consultarPrimeiroDaFila(int id) {
		
		if(fila.get(0)==id) {
			
			return true;
		}else {
			
			return false;
		}
		
	}
	
	public boolean consultarPresençaNaFila(int id) {
		
		
		for(int i =0;i<fila.size();i++) {
			
			if(id==fila.get(i)) {
				
				return true;
			}		
			
		}
		return false;
		
	}
	
	

}

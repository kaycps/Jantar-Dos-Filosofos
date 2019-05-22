import java.util.concurrent.Semaphore;

public class Garfo extends Semaphore{
	
	private int id;
	private boolean uso;
	private int filosofo;

	
	public Garfo(int permits, int id, boolean uso) {
		
		super(permits);
		this.setId(id);
		this.uso = uso;		
		
	}


	public boolean isUso() {
		return uso;
	}


	public void setUso(boolean uso) {
		this.uso = uso;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getFilosofo() {
		return filosofo;
	}


	public void setFilosofo(int filosofo) {
		this.filosofo = filosofo;
	}
	

}

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Main extends Thread {
	
	
	public static void main(String[] args) {
		
		
		Garfo g1 = new Garfo(1, 1, false);
		Garfo g2 = new Garfo(1, 2, false);
		Garfo g3 = new Garfo(1, 3, false);
		Garfo g4 = new Garfo(1, 4, false);
		Garfo g5 = new Garfo(1, 5, false);
		
		Filosofo f1 = new Filosofo(1,g1,g5);
		Filosofo f2 = new Filosofo(2,g2,g1);
		Filosofo f3 = new Filosofo(3,g3,g2);
		Filosofo f4 = new Filosofo(4,g4,g3);
		Filosofo f5 = new Filosofo(5,g5,g4);		
				
		
		f1.start();		
		f2.start();
		f3.start();
		f4.start();
		f5.start();		
		
		
	}

}

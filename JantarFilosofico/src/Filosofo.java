import java.sql.Savepoint;
import java.util.Random;
import java.util.concurrent.Semaphore;

import javax.swing.SingleSelectionModel;

public class Filosofo extends Thread{
	
		private int id;	
		private Garfo garfoDireita;
		private Garfo garfoEsquerda;
		Fila f = Fila.getInstance();
		View v = View.getInstance();
		

		public Filosofo(int id, Garfo garfoDireita, Garfo garfoEsquerda) {
			
			this.id = id;	
			this.garfoDireita = garfoDireita;
			this.garfoEsquerda = garfoEsquerda;
			
		}		


		
		public Garfo getGarfoDireita() {
			return garfoDireita;
		}



		public void setGarfoDireita(Garfo garfoDireita) {
			this.garfoDireita = garfoDireita;
		}



		public Garfo getGarfoEsquerda() {
			return garfoEsquerda;
		}



		public void setGarfoEsquerda(Garfo garfoEsquerda) {
			this.garfoEsquerda = garfoEsquerda;
		}


		

		private void pensar() {
			
			System.out.println("O filosofo " +id+" está pensando!");
			int tempo = (int) (Math.random()*5000);	
			
		
		 v.setVisible(true);
		 
		  
		  if(id==1) { v.ComidaF1.setVisible(false); }else if(id==2) {
		 v.ComidaF2.setVisible(false); }else if(id==3) { v.ComidaF3.setVisible(false);
		 }else if(id==4) { v.ComidaF4.setVisible(false); }else if(id==5) {
		  v.ComidaF5.setVisible(false); }
		 
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		private void fome() {
			
			if(f.consultarPresençaNaFila(id)==false) {
			System.out.println("O filosofo "+id+" está com fome!");
			int tempo = (int) (Math.random()*5000);			
			
			f.addFila(id);
			
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		private void pegarGarfoDireita() {
			
			
				try {
					if(!garfoDireita.isUso()&&id==garfoDireita.getId()&&f.consultarPrimeiroDaFila(id)) {	
					garfoDireita.acquire();
					garfoDireita.setUso(true);
					garfoDireita.setFilosofo(id);	
					
				
				 if(id==1) { v.lbGarfo1.setVisible(true); }else if(id==2) {
				 v.lbGarfo2.setVisible(true); }else if(id==3) { v.lbGarfo3.setVisible(true);
				 }else if(id==4) { v.lbGarfo4.setVisible(true); }else if(id==5) {
				 v.lbGarfo5.setVisible(true); }
				 
						
					int tempo = (int) (Math.random()*5000);					
					System.out.println("O filosofo "+id+" pegou o carfo da direita "+garfoDireita.getId());
					Thread.sleep(tempo);
					
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			
		}
		
		private void pegarGarfoEsquerda() {
			
			try {
				
				if(!garfoEsquerda.isUso()&&(garfoDireita.getId()-1==garfoEsquerda.getId())&&f.consultarPrimeiroDaFila(id)) {
					garfoEsquerda.acquire();
					garfoEsquerda.setUso(true);
					garfoEsquerda.setFilosofo(id);
					
				
				 if(id==2) { v.lbGarfo1.setVisible(true); }else if(id==3) {
				 v.lbGarfo2.setVisible(true); }else if(id==4) { v.lbGarfo3.setVisible(true);
				 }else if(id==5) { v.lbGarfo4.setVisible(true); }
				 
					
					int tempo = (int) (Math.random()*5000);					
					System.out.println("O filosofo "+id+" pegou o carfo da esquerda "+garfoEsquerda.getId());
					Thread.sleep(tempo);
					
				}else if(!garfoEsquerda.isUso()&&(id+4==garfoEsquerda.getId())&&f.consultarPrimeiroDaFila(id)) {
					
					
					garfoEsquerda.acquire();
					garfoEsquerda.setUso(true);
					garfoEsquerda.setFilosofo(id);
					v.lbGarfo5.setVisible(true);
					int tempo = (int) (Math.random()*5000);					
					System.out.println("O filosofo "+id+" pegou o carfo da esquerda "+garfoEsquerda.getId());
					Thread.sleep(tempo);
				}
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
		private void comer() {
			
			
				try {
					
					if(garfoDireita.isUso()&&garfoEsquerda.isUso()&&(garfoDireita.getFilosofo()==id)&&(garfoEsquerda.getFilosofo()==id)&&f.consultarPrimeiroDaFila(id)) {
						int tempo = (int) (Math.random()*5000);	
						System.out.println("==== O filosofo "+id+" está comendo! ====");
						f.removerFila(id);
						
				
				  if(id==1) { v.ComidaF1.setVisible(true); }else if(id==2) {
				  v.ComidaF2.setVisible(true); }else if(id==3) { v.ComidaF3.setVisible(true);
				  }else if(id==4) { v.ComidaF4.setVisible(true); }else if(id==5) {
				  v.ComidaF5.setVisible(true); }
				 
						
						Thread.sleep(tempo);						
						
					}
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		private void soltarGarfoDireita() {
			
			if(garfoDireita.isUso()&&garfoDireita.getFilosofo()==id) {
				
				garfoDireita.release();
				garfoDireita.setUso(false);
				garfoDireita.setFilosofo(0);
				
			
			  if(id==1) { v.lbGarfo1.setVisible(false); }else if(id==2) {
			 v.lbGarfo2.setVisible(false); }else if(id==3) { v.lbGarfo3.setVisible(false);
			  }else if(id==4) { v.lbGarfo4.setVisible(false); }else if(id==5) {
			  v.lbGarfo5.setVisible(false); }
			 
				
				System.out.println("O filosofo "+id+" soltou o carfo da direita "+garfoDireita.getId());
				
				
			}
		}
		
		private void soltarGarfoEsquerda() {
					
					if(garfoEsquerda.isUso()&&garfoEsquerda.getFilosofo()==id) {
						
						garfoEsquerda.release(1);
						garfoEsquerda.setUso(false);
						garfoEsquerda.setFilosofo(0);
						
						if(id==2) {
							v.lbGarfo1.setVisible(false);
						}else if(id==3) {
							v.lbGarfo2.setVisible(false);
						}else if(id==4) {
							v.lbGarfo3.setVisible(false);
						}else if(id==5) {
							v.lbGarfo4.setVisible(false);
						}else if(id==1) {
							v.lbGarfo5.setVisible(false);
						}
						
						System.out.println("O filosofo "+id+" soltou o carfo da esquerda "+garfoEsquerda.getId());
						
						
					}
				}		
	
		
		@Override
		public void run() {			
		
			while(true){	
				
				pensar();
				fome();			
				pegarGarfoDireita();
				pegarGarfoEsquerda();
				comer();
				soltarGarfoDireita();
				soltarGarfoEsquerda();			
				
				
				
			}
		}	
	

}

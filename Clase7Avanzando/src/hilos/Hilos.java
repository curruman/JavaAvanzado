package hilos;

public class Hilos extends Thread {
	
	
	public void run() {
		for (int i = 0; i<100; i++) {
			System.out.println("i " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

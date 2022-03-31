
public class Demo1 {
	public static void main(String[] args) {
//		Thread t1 = new Worker();
//		t1.start();
//		
//		Thread t2 = new Worker();
//		t2.start();
		
		Thread t3 = new Thread(new Worker1());
		t3.start();
//		for(;;) {
//			System.out.println(Thread.currentThread());
//		}
	}
}

class Worker1 implements Runnable {
	@Override
	public void run() {
		for(int i=0; i< 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		System.out.println(Thread.currentThread().toString() + i);
		}
}
}

		class Worker extends Thread {
			@Override
			public void run() {
				for(int i=0; i< 10; i++) {
					try {
						sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				System.out.println(Thread.currentThread().toString() + i);
				}
	}
}

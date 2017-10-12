/**
 * @author alan_
 *
 */
class ThreadMult implements Runnable {

	Thread thread;

	/**
	 * 
	 */
	public ThreadMult(String nome) {
		thread = new Thread(this, nome);
		thread.start(); // Inicia a thread
	}

	// Começa a execulção da nova thread
	@Override
	public void run() {
		System.out.println(thread.getName() + " Starting");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + thread.getName() + ", count is " + count);
			}
		} catch (InterruptedException e) {
			System.out.println(thread.getName() + " interrupted");
		}
		System.out.println(thread.getName() + " terminating");
	}
}
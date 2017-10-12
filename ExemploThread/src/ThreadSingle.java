/**
 * @author alan_
 *
 */
class ThreadSingle implements Runnable {

	Thread thrNome;

	ThreadSingle(String nome) {
		thrNome = new Thread(this, nome);
		thrNome.start(); // Inicia a thread
	}

	@Override
	public void run() {
		System.out.println(thrNome.getName() + " Starting");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + thrNome.getName() + ", count is " + count);
			}
		} catch (InterruptedException e) {
			System.out.println(thrNome.getName() + " interrupted");
		}
		System.out.println(thrNome.getName() + " terminating");
	}
}
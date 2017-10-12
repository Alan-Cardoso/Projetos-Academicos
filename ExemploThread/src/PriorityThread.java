/**
 * @author alan_
 *
 * Demonstra as prioridades das threads
 * 
 */
class PriorityThread implements Runnable {

	int count;
	Thread thread;
	static boolean stop = false;
	static String currentName;

	/*
	 * Constroi uma thread. Observe que esse construtor não inicia realmente a
	 * execulção das threads
	 */
	PriorityThread(String name) {
		thread = new Thread(this, name);
		count = 0;
		currentName = name;
	}

	// Começa a execução da nova thread
	@Override
	public void run() {
		System.out.println(thread.getName() + "Starting.");

		do {
			count++;

			if (currentName.compareTo(thread.getName()) != 0) {
				currentName = thread.getName();
				System.out.println("In " + currentName);
			}
		} while (stop == false && count < 10/*_000_000*/);
		stop = true;
		System.out.println("\n" + thread.getName() + " terminating.");
	}
}
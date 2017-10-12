import java.util.Scanner;

class UsingThread {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		startExemploThread();
	}

	@SuppressWarnings("resource")
	public static void startExemploThread() {
		int escolha;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha:\n 1 - Thread Simples\n 2 - Thread Multi\n 3 - Prioridade Thread.\n");
		escolha = sc.nextInt();

		if (escolha == 1) {
			UsingThreadSingle();
		} else if (escolha == 2) {
			UsingThreadMult();
		} else if (escolha == 3) {
			PriorityThread();
		} else {
			System.out.println("Digite somente 1, 2 ou 3.");
			startExemploThread();
		}
	}

	public static void UsingThreadSingle() {
		System.out.println("Main thread starting.");

		// Primeiro, constrói um objeto ThreadSingle
		ThreadSingle threadSingle = new ThreadSingle("Child #1");

		do {
			System.out.println(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Main thread interrupted.");
			}
		} while (threadSingle.thrNome.isAlive());
		System.out.println("Main thread ending.");
	}

	public static void UsingThreadMult() {
		System.out.println("Main thread starting.");

		// Constrói 3 objetos ThreadSingle
		ThreadMult thread1 = new ThreadMult("Child #1");
		ThreadMult thread2 = new ThreadMult("Child #2");
		ThreadMult thread3 = new ThreadMult("Child #3");

		try {
			thread1.thread.join();
			System.out.println("Child #1 joined.");
			thread2.thread.join();
			System.out.println("Child #2 joined.");
			thread3.thread.join();
			System.out.println("Child #3 joined.");
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread ending.");
	}

	public static void PriorityThread() {
		PriorityThread priorityThread1 = new PriorityThread("High Priority");
		PriorityThread priorityThread2 = new PriorityThread("Low Priority");

		// Define as prioridades
		priorityThread1.thread.setPriority(Thread.NORM_PRIORITY + 2);
		priorityThread2.thread.setPriority(Thread.NORM_PRIORITY - 2);

		// Inicia as threads
		priorityThread1.thread.start();
		priorityThread2.thread.start();

		try {
			priorityThread1.thread.join();
			priorityThread2.thread.join();

		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("\nHigh priority thread counted to " + priorityThread1.count);
		System.out.println("\nLow priority thread counted to " + priorityThread2.count);
	}
}
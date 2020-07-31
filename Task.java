package homeWork1;

public class Task implements Runnable {

	Data data = new Data();
	Storage storage;

	Task(long first, long last, Storage storage) {
		this.data.first = first;
		this.data.last = last;
		this.storage = storage;
	}

	@Override
	public void run() {
		long result = 0;
		for (long i = data.first; i <= data.last; i++) {

			result += i;

		}

		System.out.println(Thread.currentThread().getName() + " " + result);
		storage.add(result);
	}
}

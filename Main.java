package homeWork1;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Data data = new Data(2, 13);
		Storage storage = new Storage();
		Thread t1 = new Thread(new Task(data.first, (data.first + (data.last - data.first) / 4), storage));
		Thread t2 = new Thread(new Task((data.first + (data.last - data.first) / 4 + 1),
				(data.first + (data.last - data.first) / 2), storage));
		Thread t3 = new Thread(new Task((data.first + (data.last - data.first) / 2 + 1),
				(data.first + ((data.last - data.first) / 2) + (data.last - data.first) / 4), storage));
		Thread t4 = new Thread(new Task(
				(data.first + ((data.last - data.first) / 2) + (data.last - data.first) / 4 + 1), data.last, storage));

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		t1.join();
		t2.join();
		t3.join();
		t4.join();

		System.out.println("--------------");
		System.out.println("Summ: " + storage.getSumm());
	}
}

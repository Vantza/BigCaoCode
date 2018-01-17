package PaperTest;

/**
 * print world hello
 * neither "hello world" nor "world hello"
 * @author cary.cao
 *
 */

public class ThreadTest {
	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void run() {
				printMessage();
			}
		};
		thread.run();
		System.out.println("hello");
	}
	
	static void printMessage() {
		System.out.println("world");
	}
}

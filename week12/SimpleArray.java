package week12;

import java.security.SecureRandom;
import java.util.Arrays;

public class SimpleArray {
	private static final SecureRandom generator = new SecureRandom();
	private final int[] array; // the shared integer array
	private int writeIndex = 0; // shared index of next element to write

	public SimpleArray(int size){
		array = new int[size];
	}

	public synchronized void add(int value) {
		int position = writeIndex; // store the write index

		try {
			// put thread to sleep for 0-499 milliseconds
			Thread.sleep(generator.nextInt(500));
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt(); // re-interrupt the thread
		}
		// put value in the appropriate element
		array[position] = value;
		System.out.printf("%s wrote %2d to element %d.%n", Thread.currentThread().getName(), value, position);

		writeIndex++;
		System.out.printf("Next write index: %d%n", writeIndex);
	}

	// used for outputting the contents of the shared integer array
	public synchronized String toString() {
		return Arrays.toString(array);
	}

}

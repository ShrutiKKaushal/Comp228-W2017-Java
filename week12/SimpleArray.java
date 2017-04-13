package week12;

import java.security.SecureRandom;
import java.util.Arrays;

public class SimpleArray {
	private static final SecureRandom generator = new SecureRandom();
	private final int[] array;	// the shared integer array
	private int writeIndex = 0; // shared index of element to write
	
	public SimpleArray(int size) {
		array = new int[size];
	}
	
	public synchronized void add(int value) {
		int position = writeIndex;
		
		try {
			// Put thread to sleep (DEMONSTRATION PURPOSE ONLY)
			Thread.sleep(generator.nextInt(500)); // Just for show
		}
		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		// Add value to array at index "position"
		array[position] = value;
		System.out.printf("%s wrote %2d to element %d.%n", Thread.currentThread().getName(), value, position);
		
		// Increment our writeIndex
		writeIndex++;
		System.out.printf("Next write index: %d%n", writeIndex);
	}
	
	// Format array to look nice
	public synchronized String toString() {
		return Arrays.toString(array);
	}
}














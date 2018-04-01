/*
 * Student Name: Usman Sattar
 * Student Number: G00345816
 * 
 * Title: Rapid Encryption using the Four-Square Cipher
 */

// Package Name: ie.gmit.sw
package ie.gmit.sw;

public class Pair<T> {

	public Pair() {
		dataOne = null;
		dataTwo = null;
	}

	public Pair(T dOne, T dTwo) {
		dataOne = dOne;
		dataTwo = dTwo;
	}

	public T get_first() {
		return dataOne;
	}

	public T get_second() {
		return dataTwo;
	}

	public void set_first(T dOne) {
		dataOne = dOne;
	}

	public void set_second(T dTwo) {
		dataTwo = dTwo;
	}

	private T dataOne;
	private T dataTwo;
}
package de.louidev.sdk;

import de.louidev.sdk.simpletimer.SimpleTimer;

public class Main {

	public static void main(String[] args) {
		
		SimpleTimer.repeatFor(2000, 0, 5, () -> {
			System.out.println("Hallo :)");
		});
		
	}

}

package com.tasks6.rle_decoder;

public class Application {
	public static void main(String[] args) {
		
		if (args[0].equals("") || Character.isDigit(args[0].charAt(0))) {
			System.out.println("");
		}
		else {
			StringBuilder s = new StringBuilder();

			for (int i = 1; i < args[0].length(); i++) {
				char symbol = args[0].charAt(i);
				if (Character.isDigit(args[0].charAt(i)) && Character.isDigit(args[0].charAt(i - 1))) {
					System.out.println("");
					return;
				}
				if (args[0].charAt(i) == args[0].charAt(i - 1)) {
					System.out.println("");
					return;
				}
				if (!Character.isDigit(args[0].charAt(i))) {
					if (i == 1) {
						s.append(args[0].charAt(0)).append(symbol);
					}
					if (i != args[0].length() - 1 && Character.isDigit(args[0].charAt(i + 1))) {
						continue;
					}
					else {
						s.append(symbol);
					}
				}
				if (Character.isDigit(args[0].charAt(i))) {
					for (int j = 0; j < Character.getNumericValue(args[0].charAt(i)); j++) {
						s.append(args[0].charAt(i - 1));
					}
				}
			}
			System.out.println(s.toString());
		}
	}
}
package com.epam.exercises.main;

public class BitwiseMain {

	public static void main(String[] args) {
		byte b = (byte) 16;
		byte rightShift, leftShift;
		rightShift = (byte) (b >> 3);
		leftShift = (byte) (b<<2);
		System.out.println(rightShift);
		System.out.println(leftShift);
	}

}

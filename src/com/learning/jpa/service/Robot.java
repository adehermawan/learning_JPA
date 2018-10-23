package com.learning.jpa.service;

class Robot {
	private int X;
	private int Y;
	private int previousX;
	private int previousY;
	private int dx;
	private char lastMove;

	public Robot(int x, int y) {
		super();
		X = x;
		Y = y;
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	public Robot() {
		X = 0;
		Y = 5;
	}

	void moveX(int dx) {
		previousX = X;
		X = X + dx;
		Y = Y;
		previousY = Y;
		lastMove = 'x';
		this.dx = dx;
	}

	void moveY(int dy) {
		previousX = X;
		X = X;
		previousY = Y;
		Y = Y + dy;
		lastMove = 'y';
	}

	void printCurrentCoordinates() {
		System.out.println(X + " " + Y);
	}

	public void printLastMove() {
		System.out.println(lastMove + " " + dx);
	}

	public void printLastCoordinates() {
		System.out.println(previousX + " " + previousY);

	}
	
	public static void main(String[] args) {

		int x = 2;
		int y = 1;
		int dx = 1;
		int dy = 1;

		Robot firstRobot = new Robot();
		firstRobot.printCurrentCoordinates();

		Robot secondRobot = new Robot(x, y);
		secondRobot.printCurrentCoordinates();

		for (int i = 1; i < 3; i++) {
			secondRobot.moveX(dx);
			secondRobot.printLastMove();
			secondRobot.printCurrentCoordinates();
			secondRobot.moveY(dy);
			secondRobot.printLastCoordinates();

			dx += i * i;
			dy -= i * i;

		}

	}
}


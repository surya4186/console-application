package game;

import java.util.Scanner;

public class Main {
	static char[][] board = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };

	static boolean draw = false;
	static char turn = 'x';
	static int row = 0;
	static int column = 0;

	public static boolean gameOver() {
		for (int row = 0; row < 3; row++) {
			if (board[row][0] == board[row][1] && board[row][0] == board[row][2]
					|| board[0][row] == board[1][row] && board[0][row] == board[2][row]) {
				return false;

			} else if (board[0][0] == board[1][1] && board[0][0] == board[2][2]
					|| board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
				return false;

			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] != 'x' || board[i][j] != 'o') {
					return true;
				}
			}
		}
		draw = true;
		return false;
	}

	public static void playerTurn() {
		Scanner scan = new Scanner(System.in);
		if (turn == 'x') {
			System.out.println("Player 1(x) turn");
		}
		if (turn == 'o') {
			System.out.println("player 2(o) turn");
		}
		int choice = 0;
		choice = scan.nextInt();
		switch (choice) {
		case 1: {
			row = 0;
			column = 0;
			break;
		}
		case 2: {
			row = 0;
			column = 1;
			break;
		}
		case 3: {
			row = 0;
			column = 2;
			break;
		}
		case 4: {
			row = 1;
			column = 0;
			break;
		}
		case 5: {
			row = 1;
			column = 1;
			break;
		}
		case 6: {
			row = 1;
			column = 2;
			break;
		}
		case 7: {
			row = 2;
			column = 0;
			break;
		}
		case 8: {
			row = 2;
			column = 1;
			break;
		}
		case 9: {
			row = 2;
			column = 2;
			break;
		}
		}
		if (turn == 'x' && board[row][column] != 'x' && board[row][column] != 'o') {
			board[row][column] = 'x';
			turn = 'o';
		} else if (turn == 'o' && board[row][column] != 'x' && board[row][column] != 'o') {
			board[row][column] = 'o';
			turn = 'x';
		} else {
			System.out.println("box already full");
			playerTurn();
		}

	}

	static void displayBoard() {
		System.out.println("A " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("-----");
		System.out.println("B " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("-----");
		System.out.println("C " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
	}

	public static void main(String[] args) {
		
		while (gameOver()) {
			displayBoard();
			playerTurn();
			gameOver();
		}
		if (turn == 'x' && draw == false) {
			System.out.println("Player 1(x) win");
		}
		if (turn == 'o' && draw == false) {
			System.out.println("Player 2(o) win");
		} else {
			System.out.println("Game end draw");
		}
	}

}

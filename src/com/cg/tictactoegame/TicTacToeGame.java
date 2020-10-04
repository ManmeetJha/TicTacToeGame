package com.cg.tictactoegame;

import java.util.Scanner;

public class TicTacToeGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] board = new char[10];

		System.out.println("WELCOME TO TIC-TAC-TOE");
		assignBlankSpace(board);
		
		System.out.println("Player:Enter the choice(X | O)");
		char player = Character.toUpperCase(input.next().charAt(0));
		char computer = (player == 'X' ? 'O' : 'X');
		System.out.println("Player choice: " + player + "\nComputer choice: " + computer);
	}

	public static void assignBlankSpace(char[] board) {

		for (int i = 1; i < 10; i++)
			board[i] = ' ';

	}

}

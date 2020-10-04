package com.cg.tictactoegame;

import java.util.Scanner;

public class TicTacToeGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] board = new char[10];

		System.out.println("WELCOME TO TIC-TAC-TOE");
		assignBlankSpace(board);
	}

	public static void assignBlankSpace(char[] board) {

		for (int i = 1; i < 10; i++)
			board[i] = ' ';

	}

}

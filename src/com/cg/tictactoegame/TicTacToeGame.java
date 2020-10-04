package com.cg.tictactoegame;

import java.util.Scanner;

public class TicTacToeGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] board = new char[10];

		System.out.println("WELCOME TO TIC-TAC-TOE");
		assignBlankSpace(board);
		showBoard(board);
		System.out.println("Player:Enter the choice(X | O)");
		char player = Character.toUpperCase(input.next().charAt(0));
		char computer = (player == 'X' ? 'O' : 'X');
		System.out.println("Player choice: " + player + "\nComputer choice: " + computer);
	}

	public static void assignBlankSpace(char[] board) {

		for (int i = 1; i < 10; i++)
			board[i] = ' ';

	}
	
	public static void showBoard(char[] board) {
		System.out.println("\tBOARD FORMAT");
		System.out.println("\t  " + board[1] + "| " + board[2] + " | " + board[3] + "\n\t-----------");
		System.out.println("\t  " + board[4] + "| " + board[5] + " | " + board[6] + "\n\t-----------");
		System.out.println("\t  " + board[7] + "| " + board[8] + " | " + board[9]);
	}



}

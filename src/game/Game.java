package game;

import java.util.Random;
import java.util.Scanner;


public class Game {
    private static final char EMPTY = ' ';
    private static final char X = 'X';
    private static final char O = 'O';

    private final char[] board = {' ',' ',' ',' ',' ',' ',' ',' ',' '};
    private char currentPlayer = X;

    public Game() {
        for (int i = 0; i < 9; i++) {
            board[i]=EMPTY;
        }
    }

//    public void play2() {
//        int min=1;
//        int max=3;
//        Scanner scanner2=new Scanner(System.in);
//        Random random=new Random();
//        random.nextInt()
//        boolean gameEnded2 = false;
//        while (!gameEnded2) {
//            printBoard();
//            System.out.println("Ход игрока " + currentPlayer + ". Введите строку и столбец (от 1 до 3):");
//
//            int x = 0, y = 0;
//
//            while (true) {
//                if (scanner2.hasNextInt()) {
//                    x = scanner2.nextInt() - 1;
//                } else {
//                    System.out.println("Введите число от 1 до 3!");
//                    scanner2.next();
//                    continue;
//                }
//                if (scanner2.hasNextInt()) {
//                    y = scanner2.nextInt() - 1;
//                } else {
//                    System.out.println("Введите число от 1 до 3!");
//                    scanner2.next();
//                    continue;
//                }
//
//                if (x < 0 || x > 2 || y < 0 || y > 2) {
//                    System.out.println("Значения должны быть от 1 до 3. Попробуйте еще раз.");
//                } else if (board[x][y] != EMPTY) {
//                    System.out.println("Клетка уже занята. Выберите другую.");
//                } else {
//                    break;
//                }
//            }
//
//            board[x][y] = currentPlayer;
//
//            if (checkWin(currentPlayer)) {
//                printBoard();
//                System.out.println("Игрок " + currentPlayer + " выиграл!");
//                gameEnded2 = true;
//            } else if (isBoardFull()) {
//                printBoard();
//                System.out.println("Ничья!");
//                gameEnded2 = true;
//            } else if (currentPlayer == X) {
//                currentPlayer = O;
//            } else {
//                currentPlayer = X;
//
//            }
//        }
//        scanner2.close();
//    }
//

    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean gameEnded = false;

        while (!gameEnded) {
            printBoard();
            System.out.println("Ход игрока " + currentPlayer + ". Введите число от 1 до 9");

            int pos = -1;

            while (true) {
                if (scanner.hasNextInt()) {
                    pos = scanner.nextInt() - 1;
                } else {
                    System.out.println("Введите число от 1 до 9!");
                    scanner.next();
                    continue;
                }
//                if (scanner.hasNextInt()) {
//                    y = scanner.nextInt() - 1;
//                } else {
//                    System.out.println("Введите число от 1 до 3!");
//                    scanner.next();
//                    continue;
//                }

                if (pos<0||pos>8) {
                    System.out.println("Значения должны быть от 1 до 9. Попробуйте еще раз.");
                } else if (board[pos]!=(EMPTY)) {
                    System.out.println("Клетка уже занята. Выберите другую.");
                } else {
                    break;
                }
            }

            board[pos] = currentPlayer;

            if (checkWin(currentPlayer)) {
                printBoard();
                System.out.println("Игрок " + currentPlayer + " выиграл!");
                gameEnded = true;
            } else if (isBoardFull()) {
                printBoard();
                System.out.println("Ничья!");
                gameEnded = true;
            } else if (currentPlayer == X) {
                currentPlayer = O;
            } else {
                currentPlayer = X;

            }
        }
        scanner.close();
    }

    private void printBoard() {
        System.out.println("\n  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                int index=i*3+j;
                System.out.print(board[index]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println(" - - - - ");
        }
        System.out.println();
    }

    private boolean checkWin(char player) {
        int[][] winPositions = {
                {0,1,2}, {3,4,5}, {6,7,8}, // строки
                {0,3,6}, {1,4,7}, {2,5,8}, // столбцы
                {0,4,8}, {2,4,6}           // диагонали
        };

        for (int[] positions : winPositions) {
            if (board[positions[0]] == player &&
                    board[positions[1]] == player &&
                    board[positions[2]] == player) {
                return true;
            }
        }
        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
                if (board[i] == EMPTY) return false;
            }
        return true;
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}


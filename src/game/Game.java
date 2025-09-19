package game;

import java.util.Random;
import java.util.Scanner;


public class Game {
    private static final char EMPTY = ' ';
    private static final char X = 'X';
    private static final char O = 'O';

    private final char[] board = new char[9];
    private char currentPlayer = X;
    private static final Scanner scanner = new Scanner(System.in);

    public Game() {
        for (int i = 0; i < 9; i++) {
            board[i] = EMPTY;
        }
    }

    public void startGame() {
        while (true) {
            System.out.println("Игра Крестики-Нолики");
            System.out.println("Выберите уровень");
            System.out.println("1--> Игра с человеком");
            System.out.println("2--> Игра с компьютером");
            System.out.println("3--> Игра с умным компьютером");
            System.out.println("4--> Выход");


            if (!scanner.hasNextInt()) {
                System.out.println("Введите корректное числовое значение!");
                scanner.next();
                continue;
            }

            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    play();
//                    if (checkWin(currentPlayer)) {
//                             printBoard();
//                             System.out.println("Игрок " + currentPlayer + " выиграл!");
//                             return;
//                         }
                    return;
                case 2:
                    try {
                        play2();
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                   return;
                case 3:
                    //game.play3();
                   break;
                case 4:
                    System.out.println("Выход!");
                    return;
                default:
                    System.out.println("Введите корректное значение !");
            }
            //return;
        }
    }

    public void play2() throws InterruptedException {
        Random random = new Random();
        boolean gameEnded2 = false;
        while (!gameEnded2) {
            printBoard();
            System.out.println("Ход игрока " + currentPlayer + ". Введите число от 1 до 9");

            int pos = -1;
            if (currentPlayer == X) {
                while (true) {
                    if (scanner.hasNextInt()) {
                        pos = scanner.nextInt() - 1;
                    } else {
                        System.out.println("Введите число от 1 до 9!");
                        scanner.next();
                        continue;
                    }

                    if (pos < 0 || pos > 8) {
                        System.out.println("Значения должны быть от 1 до 9. Попробуйте еще раз.");
                    } else if (board[pos] != (EMPTY)) {
                        System.out.println("Клетка уже занята. Выберите другую.");
                    } else {
                        break;
                    }
                }
            }

            if (currentPlayer != X) {
                Thread.sleep(3000);
                do {
                    pos = random.nextInt(9);
                }
                while (board[pos] != EMPTY);
                System.out.println("Компьютер выбрал клетку " + (pos + 1));

            }

            board[pos] = currentPlayer;

            if (checkWin(currentPlayer)) {
                printBoard();
                System.out.println("Игрок " + currentPlayer + " выиграл!");
                gameEnded2 = true;
            } else if (isBoardFull()) {
                printBoard();
                System.out.println("Ничья!");
                gameEnded2 = true;
            } else if (currentPlayer == X) {
                currentPlayer = O;
            } else {
                currentPlayer = X;

            }
        }
    }


    public void play() {
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

                if (pos < 0 || pos > 8) {
                    System.out.println("Значения должны быть от 1 до 9. Попробуйте еще раз.");
                } else if (board[pos] != (EMPTY)) {
                    System.out.println("Клетка уже занята. Выберите другую.");
                } else {
                    break;
                }
            }

            board[pos] = currentPlayer;

            if (checkWin(currentPlayer)) {
                printBoard();
                System.out.println("Игрок " + currentPlayer + " выиграл!");
               // gameEnded = true;
                return;

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
    }

    private void printBoard() {
        System.out.println("\n  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                int index = i * 3 + j;
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
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
                {0, 4, 8}, {2, 4, 6}
        };

        for (int[] positions : winPositions) {
            if (board[positions[0]] == player && board[positions[1]] == player && board[positions[2]] == player) {
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
        try{
            game.startGame();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }




    }
}


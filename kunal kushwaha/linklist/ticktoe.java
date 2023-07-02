public class ticktoe {
        private char[][] board;
        private char currentPlayer;

        public TicTacToe() {
            board = new char[3][3];
            currentPlayer = 'X';
            initializeBoard();
        }

        private void initializeBoard() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = '-';
                }
            }
        }

        public void play() {
            boolean gameEnded = false;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Let's play Tic-Tac-Toe!");
            printBoard();

            while (!gameEnded) {
                System.out.print("Player " + currentPlayer + ", enter your move (row[1-3] column[1-3]): ");
                int row = scanner.nextInt() - 1;
                int col = scanner.nextInt() - 1;

                if (isValidMove(row, col)) {
                    makeMove(row, col);
                    printBoard();

                    if (hasWon()) {
                        System.out.println("Player " + currentPlayer + " wins!");
                        gameEnded = true;
                    } else if (isBoardFull()) {
                        System.out.println("It's a tie!");
                        gameEnded = true;
                    } else {
                        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                    }
                } else {
                    System.out.println("Invalid move! Try again.");
                }
            }

            scanner.close();
            System.out.println("Game Over.");
        }

        private boolean isValidMove(int row, int col) {
            return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-');
        }

        private void makeMove(int row, int col) {
            board[row][col] = currentPlayer;
        }

        private boolean hasWon() {
            // Check rows
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                    return true;
                }
            }

            // Check columns
            for (int j = 0; j < 3; j++) {
                if (board[0][j] == currentPlayer && board[1][j] == currentPlayer && board[2][j] == currentPlayer) {
                    return true;
                }
            }

            // Check diagonals
            if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                    (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
                return true;
            }

            return false;
        }

        private boolean isBoardFull() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '-') {
                        return false;
                    }
                }
            }
            return true;
        }

        private void printBoard() {
            System.out.println("-------------");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " | ");
                }
                System.out.println();
                System.out.println("-------------");
            }
        }

        public static void main(String[] args) {
            TicTacToe game = new TicTacToe();
            game.play();
        }
    }


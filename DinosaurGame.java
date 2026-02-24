import java.util.Random;
import java.util.Scanner;

public class DinosaurGame {

    static boolean isJumping = false;
    static boolean gameOver = false;
    static int score = 0;
    static int obstaclePosition = 20;

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Press ENTER to Jump!");
        System.out.println("Game Started...\n");

        // Thread for jumping
        Thread jumpThread = new Thread(() -> {
            while (!gameOver) {
                scanner.nextLine();  // Wait for Enter key
                isJumping = true;
                try {
                    Thread.sleep(500); // Jump duration
                } catch (InterruptedException e) {}
                isJumping = false;
            }
        });

        jumpThread.start();

        while (!gameOver) {

            printGame();

            if (obstaclePosition == 0) {
                if (!isJumping) {
                    gameOver = true;
                    break;
                }
            }

            obstaclePosition--;

            if (obstaclePosition < 0) {
                obstaclePosition = 20 + random.nextInt(10);
                score++;
            }

            Thread.sleep(200);
        }

        System.out.println("\nGAME OVER!");
        System.out.println("Final Score: " + score);
        scanner.close();
    }

    static void printGame() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        for (int i = 0; i < obstaclePosition; i++) {
            System.out.print(" ");
        }
        System.out.println("|");

        if (isJumping) {
            System.out.println("   D");
            System.out.println("------");
        } else {
            System.out.println("D");
            System.out.println("------");
        }

        System.out.println("Score: " + score);
    }
}
import java.util.Random;
import java.util.Scanner;

public class CAI {
  private static final int NUM_QUESTIONS = 10;
  private static final String[] POSITIVE_RESPONSES = {
    "Very good!",
    "Excellent!",
    "Nice work!",
    "Keep up the good work!"
  };
  private static final String[] NEGATIVE_RESPONSES = {
    "No. Please try again.",
    "Wrong. Try once more.",
    "Don't give up!",
    "No. Keep trying."
  };

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      int correctCount = 0;
      Random random = new Random();

      for (int i = 0; i < NUM_QUESTIONS; i++) {
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        int answer = num1 * num2;

        System.out.printf("How much is %d times %d?\n", num1, num2);
        int response = scanner.nextInt();

        if (response == answer) {
          correctCount++;
          String positiveResponse =
              POSITIVE_RESPONSES[random.nextInt(POSITIVE_RESPONSES.length)];
          System.out.println(positiveResponse);
        } else {
          String negativeResponse =
              NEGATIVE_RESPONSES[random.nextInt(NEGATIVE_RESPONSES.length)];
          System.out.println(negativeResponse);
          System.out.printf("The correct answer is %d.\n", answer);
        }
      }

      double percentage = (double) correctCount / NUM_QUESTIONS * 100;
      System.out.printf("You got %d out of %d questions correct.\n", correctCount, NUM_QUESTIONS);

      if (percentage < 75) {
        System.out.println("Please ask your teacher for extra help.");
      } else {
        System.out.println("Congratulations, you have successfully completed the exercise!");
      }

      System.out.println("Press n to exit ");
      String response = scanner.next();

      if (response.equalsIgnoreCase("n")) {
        break;
      }
    }
  }
}

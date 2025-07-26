package beginner;

/**
 * Using labeled breaks to end out of specific loops.
 * 
 * @author strategide
 */
public class LabeledBreak {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.printf("i = %d, j = %d\n", i, j);
                break outerLoop;
            }
        }
    }
}

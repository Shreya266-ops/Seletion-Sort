import java.util.Scanner;

public class SportDayFinishTimes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of athletes: ");
        int n = sc.nextInt();

        double[] time = new double[n];

        System.out.println("Enter finish times:");
        for (int i = 0; i < n; i++) {
            time[i] = sc.nextDouble();
        }

        int swaps = 0;

        // Optimized Selection Sort
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (time[j] < time[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                double temp = time[i];
                time[i] = time[minIndex];
                time[minIndex] = temp;

                swaps++;
            }
        }

        System.out.print("Sorted Finish Times: ");
        for (double t : time) {
            System.out.print(t + " ");
        }

        System.out.println("\nTotal Swaps: " + swaps);

        sc.close();
    }
}
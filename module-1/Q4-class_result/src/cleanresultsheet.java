public class cleanresultsheet {

    public static void main(String[] args) {
        int[] marks = {75, 82, 68, 91, 55, 88};
        int highest = marks[0];
        int lowest = marks[0];
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }
        double average = (double) sum / marks.length;
        int abvAVG = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > average) {
                abvAVG++;
            }
        }
        System.out.println("highest mark: " + highest);
        System.out.println("lowest Mark: " + lowest);
        System.out.printf("average Mark: %.2f%n", average);
        System.out.println("Students Above Average: " + abvAVG);
    }
}
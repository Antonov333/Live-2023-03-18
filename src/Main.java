public class Main {
    static String liveDate = "18.03.2023";

    public static void main(String[] args) {
        printTitle();
        task_();

        printBottomMessage();
    }

    public static void printTitle() {
        System.out.println("Решение задач, поставленных наставником на вебинаре " + liveDate);
        System.out.println(" ");
    }

    public static void task_() {
        System.out.println("Problem #_");
        System.out.println("Solution to be provided soon");
        System.out.println("");
    }


    public static void printBottomMessage() {
        String status = "в процессе выполнения..." ;
        System.out.println("Решение задач, поставленных наставником на вебинаре " + liveDate + ", " + status);
        System.out.println(" ");
    }

}
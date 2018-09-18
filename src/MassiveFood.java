public class MassiveFood {
    public static void main(String[] args) {
        String[] food = {"картофель", "мука", "макароны", "масло", "сыр"};
        for (String s : food)
            System.out.println(s);
        for (String s : food) {
            if (s.startsWith("м"))
                System.out.print(s + " начинается с с, ");
        }
    }
}

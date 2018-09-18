public class Massive1 {
    public static void main(String[] args) {
        int [] mice = {4, 6, 8, 10, 14, 16};
        float result = 0f;
        for (int i = 0; i < mice.length; i++) {
            result = result + mice[i];
        }
        result = result / mice.length;
        System.out.println("Среднее арифметическое: " + result);
    }
}

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        String input = "Hello world, Java is cool";

        List<String> parts = splitString(input, 5);
        for (String part : parts) {
            System.out.println(part);
        }
    }

    public static List<String> splitString(String input, int partSize) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < input.length() ; i+=partSize) {
            int end;
            if (i + partSize < input.length()) {
                end = i + partSize;
            } else {
                end = input.length();
            }
            result.add(input.substring(i, end));
        }
        return result;
    }
}

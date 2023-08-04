import java.util.*;

public class Solution {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int firstValue = readIntiger();
        int secondValue = readIntiger();
        System.out.println(firstValue+secondValue);
        scanner.close();
    }
    public static int readIntiger(){
        int value = scanner.nextInt();
        return value;
    }
}
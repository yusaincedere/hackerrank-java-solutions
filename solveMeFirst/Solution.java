/**
 Complete the function solveMeFirst to compute the sum of two integers.

Example
a = 7
b = 3

Return 10.

Function Description

Complete the solveMeFirst function in the editor below.

solveMeFirst has the following parameters:

int a: the first value
int b: the second value
Returns
- int: the sum of a and b
 */
package solveMeFirst;
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
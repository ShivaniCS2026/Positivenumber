import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter a number: "+ a);
        if(a>0) {
            System.out.println("The number is positive.");
        }
        else{
            System.out.println("The number is not positive.");
        }
    }
}

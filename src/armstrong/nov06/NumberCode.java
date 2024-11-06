package armstrong.nov06;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberCode {
    
    static boolean isBalanced(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        int temp = n;
        while(temp > 0) {
            int rem = temp % 10;
            arr.add(rem);
            temp = temp / 10;
        }

        System.out.println("Array: " + arr);

        int targetSum = arr.get(0) + arr.get(arr.size() - 1);
        System.out.println("Target sum for each pair: " + targetSum);
        
        for(int i = 0; i < arr.size() / 2; i++) {
            int sum = arr.get(i) + arr.get(arr.size() - i - 1);
            System.out.println("Pair sum at index " + i + " and " + (arr.size() - i - 1) + " is: " + sum);
            
            if (sum != targetSum) {
                return false;
            }
        }

        if (arr.size() % 2 != 0) {
            int middleIndex = arr.size() / 2;
            int middleElement = arr.get(middleIndex);
            System.out.println("Middle element at index " + middleIndex + " is: " + middleElement);
            if (middleElement != targetSum) {
                return false;
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        sc.close();
        
        System.out.println("Is balanced? " + isBalanced(n));
    }
}

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        int len = a.length;
        for(int i = 0; i < len; i++) {
        	a[i] = input.nextInt();
        }
        
        //Retain the first element
        int temp = a[0];
        //Shift elements left
        for(int i = 1; i < len; i++) {
        	a[i-1] = a[i];
        }
        //Move the first element to fill in the last position
        a[len-1] = temp;

        //output arr
        for(int i = 0; i < len; i++) {
        	System.out.print(a[i]);
        	if(i != len-1) {
        		System.out.print("*");
        	}
        }
        input.close();
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Decinding_order {
	public static void main(String[] args) {
		int num, i, j, temp;
	    Scanner input = new Scanner(System.in);
	 
	    System.out.println("Enter the number of integers to sort:");
	    num = input.nextInt();
	 
	    int array[] = new int[num];
	 
	    System.out.println("Enter " + num + " integers: ");
	 
	    for (i = 0; i < num; i++) 
	      array[i] = input.nextInt();
	 
	    for (i = 0; i < num; i++) {
	      for (j = 0; j < num - i - 1; j++) {
	        if (array[j] < array[j+1])   //Here Sign indicate decending and Ascending order
	        {
	          temp = array[j];
	          array[j] = array[j+1];
	          array[j+1] = temp;
	        }
	      }
	    }
	 
	    System.out.println("Sorted list of integers:");
	 
	 System.out.println(Arrays.toString(array));
	  } 
	}
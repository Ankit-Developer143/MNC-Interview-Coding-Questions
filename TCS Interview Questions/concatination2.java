public class concatination2 {
    public static void main(String[] args) {
        System.out.println(10 * 20 + "Javatpoint");   
        System.out.println("Javatpoint" + 10 * 20); 

    }
}

// 200Javatpoint
// Javatpoint200
// In the first case, The numbers 10 and 20 will be multiplied first and then the result 200 is treated as the string and concatenated with the string Javatpoint to produce the output 200Javatpoint.

// In the second case, The numbers 10 and 20 will be multiplied first to be 200 because the precedence of the multiplication is higher than addition. The result 200 will be treated as the string and concatenated with the string Javatpointto produce the output as Javatpoint200.
public class ArrayPrinter {

    public static void main(String[] args) {

              System.out.println("Name= Abdurrehman Munir"+" "+ "Roll no = 2K23-BSCS-524"+" "+"Section: M");


        // Initialize a 2D array with prime numbers
        int[][] array = {
            {2, 3, 5},
            {7, 11, 13},
            {17, 19, 23}
        };

        // Call the function to print the array
        print2DArray(array);
    }

    // Function to print a 2D array with fixed row and column values in the loop
    public static void print2DArray(int[][] array) {
        // Using fixed values (3 for rows and 3 for columns)
        for (int i = 0; i < 3; i++) {       // Row count
            for (int j = 0; j < 3; j++) {   // Column count
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

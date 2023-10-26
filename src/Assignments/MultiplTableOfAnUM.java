package Assignments;

public class MultiplTableOfAnUM {

	public static void main(String[] args) {
		 // number n for which we have to print the
        // multiplication table.

        int N = 7;
 
        int range = 10;
     // looping from 1 to range to print the
        // multiplication table of the number. 
        int i = 1;
        // using while loop
       
        while (i <= range) {
 
           
            System.out.println(N + " * " + i + " = "
                               + N * i);
            i++;
        }

	}

}

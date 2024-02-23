package demo9.iteration;


	
	import java.util.Scanner;

	public class SeriesGeneration {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the number of queries
	        int q = scanner.nextInt();

	        // Process each query
	        for (int i = 0; i < q; i++) {
	            int a = scanner.nextInt();
	            int b = scanner.nextInt();
	            int n = scanner.nextInt();

	            // Print the series for the current query
	            printSeries(a, b, n);
	        }

	        scanner.close();
	    }

	    private static void printSeries(int a, int b, int n) {
	        int result = a;
	        for (int i = 0; i < n; i++) {
	            result += Math.pow(2, i) * b;
	            System.out.print(result + " ");
	        }
	        System.out.println();
	    }
	}




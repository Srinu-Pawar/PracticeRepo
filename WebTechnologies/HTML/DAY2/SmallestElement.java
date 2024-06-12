import java.util.Scanner;

public class SmallestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = sc.nextInt();
		System.out.println("Enter the elements:");
		int[] a = new int[size];
		for(int i=0; i<size ;i++) {
			System.out.print("a[ "+i+" ]?:");
			a[i] = sc.nextInt();
		}
		int smallNo = a[0];
		for(int i:a) {
			if(smallNo>i) {
				smallNo =i;
				
			}
		}
		System.out.println("Smallest Element inside array = "+smallNo);
	}

}

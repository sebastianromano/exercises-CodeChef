import java.util.Scanner;

/* package codechef; // don't place package name! */

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int aPenNo, xPenPrice, bPencilNo, yPencilPrice, totalAmount;
		aPenNo = sc.nextInt();
		xPenPrice = sc.nextInt();
		bPencilNo = sc.nextInt();
		yPencilPrice = sc.nextInt();
		sc.close();
		totalAmount = (aPenNo * xPenPrice) + (bPencilNo * yPencilPrice);
		System.out.println(totalAmount);
	}
}
package statements;

public class Myarray {

	public static void main(String[] args) {


		int[][] myA = new int[4][3];
		int num =2;
		for (int outer=0; outer<myA.length; outer++){
		for (int inner=0; inner<myA[outer].length; inner++){
		myA[outer][inner] = num;
		num+=2;
		}
		}
		for (int outer=0; outer<myA.length; outer++){
		for (int inner=0; inner<myA[outer].length; inner++){
		System.out.print(myA[outer][inner] +" ");
		}
		System.out.println();
		}

	}

}

package exceptionExample;

public class exception {

	public static void main(String[] args) {
		try {
			int[] arr=new int[4];
			System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException is handled");
		}
		catch(Exception e) {
			System.out.println("parentException is handled");
		}

	}

}

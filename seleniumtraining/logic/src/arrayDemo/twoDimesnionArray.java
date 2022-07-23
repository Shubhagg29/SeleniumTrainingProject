package arrayDemo;

public class twoDimesnionArray {

	public static void main(String[] args) {

		int [][]data = new int[2][3];
		data[0][0] = 12;
		data[0][1] = 13;
		data[0][2] = 14;
		data[1][0] = 20;
		data[1][1] = 30;
		data[1][2] = 40;
		
		

	 int arr=data.length;
		for (int i=0;i<arr; i++) {
			for (int j = 0; j < data[i].length; j++) {

				System.out.println(data[i][j]);

			}

		}
		
	}
}
package chapter06;

public class MultipleArrayTest01 {

	public static void main(String[] args) {
		// 3*3 => 3행 3열의 배열 생성
		int [][] matrix = new int[3][3];
		
		int [][] matrix2 = new int [3][]; //행은 3행이나 몇열 까지 사용할지는 모르는 상태
		matrix2[0] = new int [3]; 
		matrix2[1] = new int [3]; 
		matrix2[2] = new int [3];
		
		int matrix3[][] = {{10,20,30},{40,50,60},{70,80,90}};
		
		matrix[0][0] = 100;
		matrix[2][1] = 500;
		
		//matrix1
		for (int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[i].length;j++) {
				System.out.print("["+i+","+j+"] = "+matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		//matrix2
		for (int i=0;i<matrix2.length;i++) {
			for (int j=0;j<matrix2[i].length;j++) {
				System.out.print("["+i+","+j+"] = "+matrix2[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		//matrix3
		for (int i=0;i<matrix3.length;i++) {
			for (int j=0;j<matrix3[i].length;j++) {
				System.out.print("["+i+","+j+"] = "+matrix3[i][j]+"\t");
			}
			System.out.println();
		}

	}

}

package unlam.paradigmas.diagnostico;

public class Main {

	public static void MostrarVector(int[] m) {
		for(int i = 0 ; i<m.length ; i++) {	
				System.out.print(m[i]+" ");
		}
		System.out.println();
	}
	
	public static void MostrarMatriz(int[][] m) {
		for(int i = 0 ; i<m.length ; i++) {
			for(int j = 0 ; j<m[i].length ; j++) {	
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	}

}

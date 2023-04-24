import java.util.Scanner;
class cube{
	
	static void perfectCube(int N)
	{
		int cube;
	
		
		for (int i = 0; i <= N; i++) {
	
			cube = i * i * i;
	
			if (cube == N) {
				System.out.println("Prefect Cube");
				return;
			}
			else if (cube > N) {
				System.out.println("Not Pefect Cube");
				return;
			}
		}
	}
	

	public static void main (String[] args)
	{
        Scanner obj= new Scanner(System.in);
		int N = obj.nextInt();
	
		perfectCube(N);

	}
}


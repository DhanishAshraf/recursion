
public class triangleStars {
	
	public static void asterisksTri(int n){
		
			if (n == 0) {
				System.out.println();
				}
			else {
				for(int i = 0; i < n; i++)
					System.out.print("*");
				System.out.println();
				asterisksTri(n-1);
				}
			}


	public static void main(String[] args) {
		asterisksTri(4);
	}

}

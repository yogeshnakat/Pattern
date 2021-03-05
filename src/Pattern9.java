
public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=9;j++) {
				if(j<=6-i || j>=4+i) {
					System.out.print("*");
			}
				else {
					System.out.print(" ");
				}
		}
			System.out.print("\n");
	}

}
}
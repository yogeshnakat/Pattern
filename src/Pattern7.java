
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=9;j++) {
				if(j<=6-i || j>=4+i) {
					System.out.print(j);
			}
				else {
					System.out.print(" ");
				}
		}
			System.out.print("\n");
	}
		for(i=2;i<=5;i++) {
			for(j=1;j<=9;j++) {
				if(j<=i || j>=10-i) {
					System.out.print(j);
					
			}
				else {
					System.out.print(" ");
				}
		}
			System.out.print("\n");
	}

	}

}

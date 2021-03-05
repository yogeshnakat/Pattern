
public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=9;j++) {
				if(j>=i && j<=10-i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.print("\n");
		}
		
	}

}

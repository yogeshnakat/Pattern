
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k=0;
		for( i=1;i<=5;i++) {k=1;
			for( j=1;j<=5;j++) {
							if(j>=6-i) {
								System.out.print(k);		
								k++;
									}
							else {
								System.out.print(" ");
							}
			}
			System.out.println();				
			
		}

		for( i=2;i<=5;i++) {k=1;
			for( j=1;j<=5;j++) {
							if(j>=i) {
								System.out.print(k);
								k++;
								
									}
							else {
								System.out.print(" ");
							}
			}
			System.out.println();

	}

}}


public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k=0;
		
		// For First half diamond
		for(i=1;i<=5;i++) {k=1;
							for(j=1;j<=9;j++) {
												if(j>=6-i && j<=4+i) {
																		System.out.print(k);
																		k++;
																	}
												else {
														System.out.print(" ");	
													}
												}
							
							System.out.println();	
						}
		
		// For Second half diamond
		for(i=2;i<=5;i++) { k=1;
							for(j=1;j<=9;j++) {
												if(j>=i && j<=10-i) {
																		System.out.print((k));
																		k++;
																	}
												else {
														System.out.print(" ");	
													}
												}
			
							System.out.println();	
						}


						}
				}

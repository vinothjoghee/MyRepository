package com.vjs.Examples;

public class forEq {

	//int i=0;
	public static void pgn() {
		int i=1;
		for(System.out.println("vinoth") ;i<=5;i++) {
		System.out.println(i);
		System.out.println("is good");
		
		}
	}
	
	//to print 0	1	3	6	10	15	21	28	36	45	55	55
		public static void printval1() {
			int a=0;
			for(int i=0;i<=10;i++) {
				a=a+i;
				System.out.print(a + "\t");
			}
			System.out.print(a);
		}
		
		/*to print  
		1	2	
		1	2	3	
		1	2	3	4	
		1	2	3	4	5
		 */
		
		public static void printval2() {
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(j+"\t");
				}
				System.out.println();
			}
		}
		
		/* to print  5	4	3	2	1	
5	4	3	2	
5	4	3	
5	4	
5   */
		 
		public static void printval3 () {
			for(int i=0;i<5;i++) {
				for(int j=5;j>i;j--) {
					System.out.print(j+"\t");
				}
				System.out.println();
			}
		}
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//pgn();
		//printval1();
		printval2();
		
		printval3();
	}

}

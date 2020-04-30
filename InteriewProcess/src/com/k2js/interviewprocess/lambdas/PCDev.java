package com.k2js.interviewprocess.lambdas;

public class PCDev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using anonymous class // anonymous class can be used as an argument also.
		//i.e (PCDev.PPC(p1,int a,int b))
		PCDev.PPC(new PC() {
			public int performCalc(int i,int j) {
				return(i+j);
			}
		} ,30,40);
	}
		
		
		/*PC p1=new PC() {
			public int performCalc(int i,int j) {
				return(i+j);
			}
		};
		int a=5,b=10;
		//System.out.println(p1.performCalc(a, b));
	}*/
	
	static void PPC(PC p1,int a,int b) {
		System.out.println(p1.performCalc(a,b));
	}

}

package vjPrograms.BasicPgms;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="this is going to be reversed";
		int len=s.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.print(rev);
		
		
		int a=0;
		int b=1;
		int f=20;
		int c=0;
		System.out.print(a);
		System.out.print(b);
		for(int i=0;i<f;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c);
		}

	}

}

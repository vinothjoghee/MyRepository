package TypeCasting;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		carrot c=new carrot();
		c.cook();
		c.chop();
		c.Boil();
		c.addsugar();
		c.fry();
		c.carrotalwa();
		
		/*---------------Upcasting-----------------------*/
		System.out.println("***********************************");
		veg v=new carrot();
		v.cook();
		v.chop();
		v.Boil();
		v.fry();
		
		/*----------------Downcasting-------------------------------*/
		System.out.println("***********************************");
		veg v1=new carrot();
		carrot d=(carrot)v1;
		d.cook();
		d.chop();
		
		d.Boil();
		d.fry();
		d.addsugar();
		d.carrotalwa();
		
		
		
		
		
	}

}

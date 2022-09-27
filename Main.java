
public class Main {

	public static void main(String[] args) {
		car c=new car("Adithi","white",1500000,"TATA");
		
		System.out.println("car name:" +c.name);
		System.out.println("car color:" +c.Color);
		System.out.println("car price:" +c.price);
		System.out.println("car brand:" +c.brand);
		
		
       bike b=new bike("Ani","black",2300000,"Hero");
		
		System.out.println("bike name:" +b.name);
		System.out.println("bike color:" +b.Color);
		System.out.println("bike price:" +b.price);
		System.out.println("bike brand:" +b.brand);
	}

}

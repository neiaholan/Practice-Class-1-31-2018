

public class cartest {
public static void main(String[]args){
	
	CarProject car1=new CarProject("Ford", 15000, 1992);
	System.out.println(car1.carBrand);
	
	
	CarProject car2=new CarProject("Toyota", 10000, 2000);
	System.out.println(car2.carBrand);
	
	System.out.println(car2.carBrand);
	car2.carBrand="Nissan";
	System.out.println(car2.carBrand);
}
}

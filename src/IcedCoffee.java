
public class IcedCoffee  extends Coffee{
	
	private int icedCubes;
	
	public IcedCoffee (String size , double price , int icedCubes  ) {
		super (size, price);
		
		this.icedCubes = icedCubes ;
	
	}
	@Override
	public String toString() {
	return super.toString() + ",IcedCubes:" + icedCubes ;
}
	@Override
	public void displayInfo() {
	    System.out.println(toString());
	}
	public int getIcedCubes () {
	    return  icedCubes; 
	}
	public void setIcedCubes(int icedCubes) { 
	    this.icedCubes = icedCubes; 
	}
}
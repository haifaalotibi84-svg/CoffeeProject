public class FlavoredCoffee extends Coffee {

  private String flavor;
  
  public  FlavoredCoffee(String size , double price , String flavor) {
    super (size , price);
    
    this.flavor = flavor;
  }      
  
@Override
public String toString() {
return super.toString() + ",Flavor:" + flavor ;
}
@Override
public void displayInfo() {
    System.out.println(toString());
}
public String getFlavor() { 
    return flavor; 
}
public void setflavor(String flavor) { 
    this.flavor = flavor; 
}
} 
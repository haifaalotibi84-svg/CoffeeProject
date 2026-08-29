
public abstract class Coffee {

	    private String size;
	    private double price;
	      

	    public Coffee(String size, double price) {
	        this.size = size;
	        this.price = price;
	    }

	    public String getSize() { 
	        return size; 
	    }
	    public void setSize(String size) { 
	        this.size = size; 
	    }

	    public double getPrice() { 
	        return price; 
	    }
	    public void setPrice(double price) { 
	        this.price = price; 
	    }

	    @Override
	    public String toString() {
	       return "Size: " + size + ", Price: " + price;
	       
	    }
	    public abstract void displayInfo();
	}



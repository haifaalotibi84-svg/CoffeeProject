
public class Customer {
	
private String name;
private Coffee coffee; // composition

	    public Customer(String name , Coffee coffee) {
	        this.name = name;
	        this.coffee = coffee;
	    }

	    public String getName() {
	        return name;
	    }
	    public Coffee getCoffee() {
	        return coffee;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public void setCoffee(Coffee coffee) {
	        this.coffee = coffee;
	    }
	}



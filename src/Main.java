
public class Main {

	public static void main(String[] args) {
		
		// انشاء objects 
		FlavoredCoffee c2 = new FlavoredCoffee("Large", 15.0, "Vanilla");
		IcedCoffee c3 = new IcedCoffee("Medium", 18.0, 3);
		Customer customer1 = new Customer("Sara", c2);
		
		// كومبوزيشن
		System.out.println(customer1.getName());
		System.out.println(customer1.getCoffee());
		
// (tostring) طباعة البيانات عبر دالة 
		System.out.println(c2);
		System.out.println(c3);	
		
		// انشاء مصفوفة من نوع كوفي تحتوي على عنصرين
	Coffee[] menu = new Coffee [2];
	
	menu[0] =  c2;
	menu[1] =  c3 ;
		
	// المرور على كل عنصر في المصفوفة
	for (Coffee currentCoffee : menu) 
	{
		//  (tostring)   طباعة بيانات الكائن الحالي  عبر دالة
		System.out.println (currentCoffee);
		
	// التحقق من نوع الكائن قبل اجراء التحويل 
	if (currentCoffee instanceof FlavoredCoffee )
	{
		//(Downcasting) تحويل من كلاس الاب الى كلاس الابن 
		FlavoredCoffee Coffee = (FlavoredCoffee) currentCoffee;
		
		Coffee.getFlavor();
	}
	// التحقق من نوع الكائن قبل اجراء التحويل 
	if (currentCoffee instanceof IcedCoffee )
	{
		//(Downcasting) تحويل من كلاس الاب الى كلاس الابن  
		IcedCoffee Coffee = (IcedCoffee) currentCoffee;
		
		Coffee.getIcedCubes();
	}
	}
	// الحصول على اسم كل نوع في المصفوفة
	for (int j = 0; j < menu.length; j++)
		System.out.printf ("Coffee %d is a %s\n",j, menu [j] .getClass().getName() );
	}
		
			
	

		
	}

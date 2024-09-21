//Name : Timothy Pham
//Period : 2nd

public class productRunner
{	
	public static void main (String[] args)
	{	
		Product oven  = new Item("ZapIt Microwave Oven", 90.0);
		Product toaster = new Item("NeverBurn Toaster", 20.0);
		Product toasterPack = new Pack(4, toaster);

		Bundle homeCookingKit = new Bundle();
		homeCookingKit.add(oven) ;
		homeCookingKit .add(toaster) ;

		Bundle restaurantStarterKit = new Bundle();
		restaurantStarterKit.add(homeCookingKit);
		restaurantStarterKit.add(toasterPack);

		Product homeKitPack = new Pack(5, homeCookingKit);



	}
}


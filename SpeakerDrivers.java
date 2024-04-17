class Speaker
{
	String brand;
	int price;
	String modelName;
	String type;
	int bluetoothRange;

	public void displaySpeaker()
	{
		System.out.println("******* Speaker Details ********");
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
		System.out.println("Model Name : "+modelName);
		System.out.println("Type : "+type);
		System.out.println("Bluetooth Range : "+bluetoothRange);
	}
}


class SpeakerDrivers
{
	public static void main(String[] args) 
	{
		Speaker obj = new Speaker();
		obj.brand = "Sony";
		obj.price = 5000;
		obj.modelName = "150SONY";
		obj.type = "Reachargeable";
		obj.bluetoothRange = 10;
		obj.displaySpeaker();
		
	}
}
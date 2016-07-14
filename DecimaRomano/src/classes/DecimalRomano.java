package classes;

public class DecimalRomano {

	@SuppressWarnings("unused")
	public static void conversor(String romano, int decimal) {
		
		//String romano = null;
		
		if (decimal >= 1000) {
			romano += "" + "M";
			conversor(romano, decimal -= 1000);
		}
		System.out.println(romano);
	}
}

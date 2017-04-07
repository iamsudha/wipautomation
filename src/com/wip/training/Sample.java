
public class Sample {

	public static void main(String[] args) {
		String text = "199";
		try {
			text = text.concat(".5");
			double decimal = Double.parseDouble(text);
			System.out.println("double value with parsedouble method" + decimal);
			text = Double.toString(decimal);
			System.out.println(
					"value of text to double using doublevalue method is" + Double.valueOf(text).doubleValue());
			int status = (int) Math.ceil(Double.valueOf(text).doubleValue());
			System.out.println(status);
		} catch (NumberFormatException e) {
			System.out.println("Invalid number");
		}
	}

}

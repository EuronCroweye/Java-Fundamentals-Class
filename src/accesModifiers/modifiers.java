package accesModifiers;
/*
 * 
 * Access Levels
 * Modifier				Class		Package		Subclass	World
 * public				Y				Y			Y		Y	
 * protected			Y				Y			Y		N
 * no modifier			Y				Y			N		N			
 * private				Y				N			N		N
 * 
 */
public class modifiers {

	public static String GetInfo() {
		return ("If you are declaring member variable with private or no mod you heve to"
				+ "write a getter and setter for them to use "
				+ "and this key word is reffering directly to the class member variable");
	}
	
	public static void main (String []args ) {
		System.out.println(GetInfo());
		FinalKeyWord fin=new FinalKeyWord();
		System.out.println(fin.GetInfo());
	}
	
}

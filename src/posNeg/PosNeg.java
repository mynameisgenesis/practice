package posNeg;

public class PosNeg {
	
	/*Given 2 int values, return true if one is negative
	and one is positive. Except if the parameter "negative" 
	is true, then return true only if both are negative.*/

	public static boolean posNeg(int a, int b, boolean negative) {
			 if (((a < 0 && b >0) || (a > 0 && b < 0) ) && !negative){
			   return true;
			 }else if ((a < 0 && b < 0)  && negative){
			   return true;
			 }
			  return false;
			}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		System.out.println(posNeg(1,-2,true));
	}
}

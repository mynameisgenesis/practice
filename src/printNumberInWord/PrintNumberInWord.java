package printNumberInWord;

public class PrintNumberInWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;
		
		if(number == 1){
			System.out.println("One");
		}else if(number == 2){
			System.out.println("Two");
		}else if(number == 3){
			System.out.println("Three");
		}else if(number == 4){
			System.out.println("Four");
		}else if(number == 5){
			System.out.println("Five");
		}else if(number == 6){
			System.out.println("Six");
		}else if(number == 7){
			System.out.println("Seven");
		}else if(number == 8){
			System.out.println("Eight");
		}else if(number == 9){
			System.out.println("Nine");
		}else if(number == 10){
			System.out.println("Ten");
		}else {
			System.out.println("This will only change the number 1 - 10 to words.");
		}
		
		switch(number){
		case 1:System.out.println("ONE");
		break;
		case 2: System.out.println("TWO");
		break;
		case 3: System.out.println("THREE");
		break;
		case 4: System.out.println("FOUR");
		break;
		case 5: System.out.println("FIVE");
		break;
		case 6: System.out.println("SIX");
		break;
		case 7: System.out.println("SEVEN");
		break;
		case 8: System.out.println("EIGHT");
		break;
		case 9: System.out.println("NINE");
		break;
		case 10: System.out.println("TEN");
		break;
		default: System.out.println("his will only change the number 1 - 10 to words.");
		
		}
	}

}

package QAC.Project;

public class Fizz {
	static String[] str = new String[25];
	int i;

	public String fizzbuzzMethod() {
		int count = 0;
		for (i = 1; i <= 20; i++) {
			if (i % 15 == 0) {
				str[i] = "fizzbuzz";
				count++;
			}
		}
		if (count > 0) {
			return ("fizzbuzz");
		} else {
			return "";
		}
	}

	public String buzzMethod() {
		int count = 0;
		for (i = 1; i <= 20; i++) {
			if (i % 5 == 0 && i % 15 != 0) {
				str[i] = "buzz";
				count++;
			}
		}
		if (count > 0) {
			return ("buzz");
		} else {
			return "";
		}
	}

	public String fizzMethod() {
		int count = 0;
		for (i = 1; i <= 20; i++) {
			if (i % 3 == 0 && i % 15 != 0) {
				str[i] = "fizz";
				count++;
			}
		}
		if (count > 0) {
			return ("fizz");
		} else {
			return "";
		}
	}

	public void intMethod() {

		for (i = 1; i <= 20; i++) {
			if (i % 3 != 0 && i % 5 != 0) {
				str[i] = Integer.toString(i);
			}
		}

	}

	public void printfizzbuzz() {
		for (int j = 1; j <= 20; j++) {
			System.out.print("    " + str[j]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Elliott's code on fizzbuzz
	
	
	public String fizzBuzz(int j) {
		String totalOutput = "";
		for(int i =1; i <= j; i++) {
			totalOutput += fizzOrBuzzOrBoth(i);
		}
		return totalOutput;
	}
	public String fizzOrBuzzOrBoth(int i ) {
		String returnResult = " ";
		if(i % 15 == 0) {
			returnResult += "fizzbuzz";
		}
		else if (i% 5 == 0) {
			returnResult += "buzz";
		}
		else if(i % 3 == 0) {
			returnResult +="fizz";
		}
		else {
			returnResult += i;
		}
		return returnResult;
	}
	
	public static void main(String[] args) {
		Fizz f = new Fizz();
		
		System.out.println(f.fizzBuzz(20).trim().replaceAll(" ", "\n"));
	}

}// class

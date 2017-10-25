package QAC.Project;

public class example {
	
	public String output35(int k) {
		String outResult="";
		for(int i=1;i<=k;i++) {
			outResult += select35(i);
		}
		return outResult;
	}
	
	public String select35(int p) {
		String showEach = " ";
		if(p%15 == 0) {
			showEach += "fizzbuzz";
			}
		else if(p%5 == 0) {
			showEach += "buzz";
			}
		else if (p%3 == 0) {
			showEach += "fizz";
			}
		else{
			showEach += p;
		}
		return showEach;
	}

	public static void main(String[] args) {
		example e = new example();
		System.out.print(e.output35(5));
	}
}

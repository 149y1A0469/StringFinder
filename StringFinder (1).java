import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringFinder {

	private final static String WhenValue = "when";
	private final static String WhatValue = "what";
	private final static String WhoValue = "who";

	public static void main(String[] args) {
		BufferedReader br = null;
		String input = "";

		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter Setntence : ");
			input = br.readLine();  
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (input!=null) {
			String arr[] = input.split(" ",2);
			String firstWord = arr[0];  
			StringFinder stringFinder = new StringFinder();
			String switchResult = stringFinder.usingSwitch(firstWord.toLowerCase());
			String ifhResult = stringFinder.usingIf(firstWord.toLowerCase());
			String containsResult = stringFinder.usingContains(input.toLowerCase());
			System.out.println("Switch Result");
			System.out.println(switchResult);
			System.out.println("If Result");
			System.out.println(ifhResult);
			System.out.println("Contains Result");
			System.out.println(containsResult);
		} else {
			System.out.println("Entered vlaue is null ");
		}

	}
	public String usingSwitch(String firstWord) {
		String result = "";
		switch(firstWord){    
		case WhenValue:    
			result = "This sentence having--WHEN";
			break;    
		case WhatValue:    
			result = "This sentence having--What";
			break;  
		case WhoValue:    
			result = "This sentence having--Who";
			break;  
		default:     
			result = "This sentence having--Unknown value";
		} 
		return result;

	}
	public String usingIf(String firstWord) {
		String result = "";
		if(firstWord.equalsIgnoreCase(WhenValue)) {
			result = "This sentence having--WHEN";
		}
		else if (firstWord.equalsIgnoreCase(WhatValue)) {
			result = "This sentence having--What";
		}
		else if (firstWord.equalsIgnoreCase(WhoValue)) {
			result = "This sentence having--Who";
		} else {
			result = "This sentence having--Unknown value";
		}
		return result;

	}
	public String usingContains(String input) {
		String result = "";
		if(input.contains(WhenValue)) {
			result = "This sentence having--WHEN";
		}
		else if (input.contains(WhatValue)) {
			result = "This sentence having--What";
		}
		else if (input.contains(WhoValue)) {
			result = "This sentence having--Who";
		} else {
			result = "This sentence having--Unknown value";
		}
		return result;

	}
}

package test.parctice;

import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Scanner;

public class Country {

	
	public static void main(String args[]) {
		
		
		HashMap<String, String> countrymap = new HashMap<String, String>();
		
		countrymap.put("India", "Asia");
		countrymap.put("Bangladesh", "Asia");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the ountry:-");
		String country = s.nextLine();
		
		if(countrymap.containsKey(country)) {
			
			System.out.println("The Continent For "+country+" is - "+countrymap.get(country));
			
		}
		
	}
}

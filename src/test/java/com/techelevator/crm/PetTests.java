package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PetTests {

	
	
	@Test
	public void pet_vaccinations_list_test() {
		
		List<String> test = new ArrayList<String>();
		test.add("Corona");
		test.add("Flu");
		test.add("Diarrhea");
		
				
		Pet objectToTest = new Pet();
		
		String output = objectToTest.listVaccinations();
		
		Assert.assertEquals("Corona, Flu, Diarrhea", output);
		
	}
	
	
	
}

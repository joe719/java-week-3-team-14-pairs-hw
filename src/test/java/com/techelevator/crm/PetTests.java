package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PetTests {

	
	
	@Test
	public void pet_vaccinations_list_test() {
		
		Pet objectToTest = new Pet();
		
		List<String> test = new ArrayList<>();
		test.add("Corona");
		test.add("Flu");
		test.add("Diarrhea");
		
				
		objectToTest.setVaccinations(test);
		String output = objectToTest.listVaccinations();
		
		Assert.assertEquals("Corona, Flu, Diarrhea", output);
		
	}
	
	
	
}

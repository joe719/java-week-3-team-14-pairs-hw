package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PetTests {

	private Pet objectToTest = new Pet();
	
	@Test
	public void pet_vaccinations_list_test() {
		
		Pet objectToTest = new Pet();
		
		List<String> test = new ArrayList<>();
		test.add("Corona");
		test.add("Flu");
		test.add("Diarrhea");
		
				
<<<<<<< HEAD
		objectToTest.setVaccinations(test);
		String output = objectToTest.listVaccinations();
=======
		//Pet objectToTest = new Pet();
		
		String output = objectToTest.listVaccinations(test);
>>>>>>> 05881b48ef1d4ac3948af6560f3a818ca3595da2
		
		Assert.assertEquals("Corona, Flu, Diarrhea", output);
		
	}
	
	
	
}

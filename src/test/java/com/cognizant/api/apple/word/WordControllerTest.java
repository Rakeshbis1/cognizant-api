package com.cognizant.api.apple.word;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.api.apple.word.service.ResponseWordService;

@SpringBootTest(classes = WordApplication.class) 
public class WordControllerTest  {
	
	@Autowired
	private ResponseWordService responseWordService;

	
	
	@Test
	public void contextLoads() {
	}

	/*@Test
	public void testgetwordDetails()  {
		
		
		try{
			
			 int count;

			
		 Collection<List<String>> words;	
		ResponseWords responseWords= responseWordService.getWordDetails("general");
		assertTrue(responseWords.getWords().size()==6);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
				
		
		*/
		
	
	
	

}

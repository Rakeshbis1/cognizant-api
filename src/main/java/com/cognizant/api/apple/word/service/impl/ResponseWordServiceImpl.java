package com.cognizant.api.apple.word.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.api.apple.word.exception.PayLoadException;
import com.cognizant.api.apple.word.model.ResponseWords;
import com.cognizant.api.apple.word.service.ResponseWordService;
import com.cognizant.api.apple.word.service.WordService;

@Component("ResponseWordService")
public class ResponseWordServiceImpl implements ResponseWordService {

	@Autowired
	private WordService wordService;
	
	Collection<List<String>> result = new ArrayList<>();

	final int pageSize = 5;
	final AtomicInteger counter = new AtomicInteger();
	ResponseWords responseWords;

	
	@Override
	public ResponseWords getWordDetails(String word) throws PayLoadException {

		boolean specialChar;
		specialChar = getSpecialCharacter(word);

		if (specialChar == true || word.trim().length() <= 0) {
			throw new PayLoadException();
		}

		List<String> wordList = wordService.dictionaryMethod(word);
		Collections.sort(wordList);
		saveList(wordList);

		final Collection<List<String>> result = wordList.stream()
				.collect(Collectors.groupingBy(it -> counter.getAndIncrement() / pageSize)).values();

		responseWords = new ResponseWords(word.length(), result);

		return responseWords;
	}

	/**
	 * This Method validate special character and integer value
	 * @param word
	 * @return
	 */
	private boolean getSpecialCharacter(String word) {

		Pattern p = Pattern.compile("[^A-Za-z0-9]");
		Matcher m = p.matcher(word);
		boolean b = m.find();
		return b;
	}
	
	
	@Override
	public Collection<List<String>> getWordDataStorebyUser() throws PayLoadException {
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public Collection<List<String>> saveList(List<String> wordList) throws PayLoadException {
		// TODO Auto-generated method stub
		result.add(wordList);
		
		return result;
	}

}

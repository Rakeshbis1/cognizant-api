package com.cognizant.api.apple.word.service;

import java.util.List;

public interface WordService {
	/**
	 * This Method take input as word and get the list of Word
	 * @param words
	 * @return
	 */
	public List<String> dictionaryMethod(String words);

}

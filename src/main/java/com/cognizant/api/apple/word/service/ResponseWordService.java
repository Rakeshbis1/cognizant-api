package com.cognizant.api.apple.word.service;

import java.util.Collection;
import java.util.List;

import com.cognizant.api.apple.word.exception.PayLoadException;
import com.cognizant.api.apple.word.model.ResponseWords;

public interface ResponseWordService {

	/**
	 * 
	 * @param word
	 * @return
	 * @throws PayLoadException
	 */
	public ResponseWords getWordDetails(String word,int limit) throws PayLoadException;
	
	public Collection<List<String>> getWordDataStorebyUser() throws PayLoadException;
	
	public Collection<List<String>> saveList(List<String> wordList) throws PayLoadException;
	
	
	
	

}

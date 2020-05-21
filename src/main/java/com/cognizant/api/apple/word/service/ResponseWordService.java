package com.cognizant.api.apple.word.service;

import com.cognizant.api.apple.word.exception.PayLoadException;
import com.cognizant.api.apple.word.model.ResponseWords;

public interface ResponseWordService {

	/**
	 * 
	 * @param word
	 * @return
	 * @throws PayLoadException
	 */
	public ResponseWords getWordDetails(String word) throws PayLoadException;

}

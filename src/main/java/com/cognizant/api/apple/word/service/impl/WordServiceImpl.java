package com.cognizant.api.apple.word.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cognizant.api.apple.word.service.WordService;

@Component("WordService")
public class WordServiceImpl implements WordService {

	@Override
	public List<String> dictionaryMethod(String words) {
		// TODO Auto-generated method stub

		List<String> wordList = new ArrayList<>();

		for (int i = 0; i < words.length(); i++) {

			wordList.add(words + getRandomChars(i));

		}
		return wordList;
	}

	/**
	 * 
	 * @param length
	 * @return
	 */
	private String getRandomChars(int length) {
		String r = "";
		for (int i = 0; i < length; i++) {

			r += (char) (Math.random() * 26 + 97);
		}
		return r;
	}

}

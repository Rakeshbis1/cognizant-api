package com.cognizant.api.apple.word.model;

import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseWords {

	@JsonProperty("count")
	private int count;

	@JsonProperty("words")
	private Collection<List<String>> words;

	public ResponseWords(int count, Collection<List<String>> words) {
		super();
		this.count = count;
		this.words = words;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Collection<List<String>> getWords() {
		return words;
	}

	public void setWords(Collection<List<String>> words) {
		this.words = words;
	}

}

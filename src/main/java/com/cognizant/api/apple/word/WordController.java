package com.cognizant.api.apple.word;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.api.apple.word.exception.PayLoadException;
import com.cognizant.api.apple.word.model.ResponseWords;
import com.cognizant.api.apple.word.service.ResponseWordService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/v1")
@Api(value = "Word Mangement System", description = "Printing list of generated word")
public class WordController {

	@Autowired
	private ResponseWordService responseWordService;

	/**
	 * 
	 * @param word
	 * @return
	 * @throws PayLoadException
	 */
	@ApiOperation(value = "Get word list by given word")
	@GetMapping(value = "/getRandomWord", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseWords getRes(@ApiParam(value = "word details list get by given word", required = true) @NotNull @Valid String word)
			throws PayLoadException {

		
		return this.responseWordService.getWordDetails(word.toString());
	}

}
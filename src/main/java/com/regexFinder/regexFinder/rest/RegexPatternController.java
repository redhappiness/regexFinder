/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.regexFinder.regexFinder.rest;

/**
 *
 * @author weiya
 */
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegexPatternController {
    private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/pattern")
	public RegexPattern pattern(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new RegexPattern(counter.incrementAndGet(), String.format(template, name));
	}
}

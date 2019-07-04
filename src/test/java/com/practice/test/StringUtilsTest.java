package com.practice.test;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilsTest {

	private String emptyString = "";
	private String normalString = "abc";
	private String blankString = "  ";

	@Test
	public void should_is_empty_false_when_string_is_normal() {
		//given
		//when
		boolean result = new StringUtils().isEmpty(normalString);
		//then
		assertThat(result).isFalse();
	}

	@Test
	public void should_is_empty_true_when_string_is_empty() {
		//given
		//when
		boolean result = new StringUtils().isEmpty(emptyString);
		//then
		assertThat(result).isTrue();
	}

	@Test
	public void should_is_empty_true_when_string_is_null() {
		//given
		//when
		boolean result = new StringUtils().isEmpty(null);
		//then
		assertThat(result).isTrue();
	}

	@Test
	public void should_is_blank_true_when_string_is_empty() {
		//given
		//when
		boolean result = new StringUtils().isBlank(emptyString);
		//then
		assertThat(result).isTrue();
	}

	@Test
	public void should_is_blank_false_when_string_is_normal() {
		//given
		//when
		boolean result = new StringUtils().isBlank(normalString);
		//then
		assertThat(result).isFalse();
	}

	@Test
	public void should_is_blank_false_when_string_is_null() {
		//given
		//when
		boolean result = new StringUtils().isBlank(null);
		//then
		assertThat(result).isTrue();
	}

	@Test
	public void should_is_blank_true_when_string_is_blank() {
		//given
		//when
		boolean result = new StringUtils().isBlank(blankString);
		//then
		assertThat(result).isTrue();
	}

	@Test
	public void should_is_Alpha_true_when_string_is_alpha() {
		//given

		//when
		boolean result = new StringUtils().isAlpha(normalString);
		//then
		assertThat(result).isTrue();
	}

	@Test
	public void should_is_Alpha_false_when_string_is_empty() {
		//given

		//when
		boolean result = new StringUtils().isAlpha(emptyString);
		//then
		assertThat(result).isFalse();
	}

	@Test
	public void should_is_Alpha_false_when_string_is_blank() {
		//given

		//when
		boolean result = new StringUtils().isAlpha(blankString);
		//then
		assertThat(result).isFalse();
	}

	@Test
	public void should_is_Alpha_false_when_string_is_number() {
		//given
		String numberString = "123";
		//when
		boolean result = new StringUtils().isAlpha(numberString);
		//then
		assertThat(result).isFalse();
	}
}
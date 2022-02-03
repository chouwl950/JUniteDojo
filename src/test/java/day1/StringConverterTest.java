package day1;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class StringConverterTest extends StringConverter {

	@Test
	void Setup() throws Exception {
		fail("Not yet implemented");
	}

	@Nested
	class 文字の場合そのまま返す {

		@Test
		void 引数がabcの場合abcを返す() {
			StringConverter stringConverter = new StringConverter();
			assertThat(stringConverter.sanitizeName("abc"), is("abc"));
		}

		@Test
		void 引数がABCの場合abcを返す() {
			StringConverter stringConverter = new StringConverter();
			assertThat(stringConverter.sanitizeName("ABC"), is("abc"));
		}
	}

	@Nested
	class 空白文字はまとめてハイフンに置き換えしてください {

		@Test
		void 引数が半角の場合ハイフンを返す() {
			StringConverter stringConverter = new StringConverter();
			assertThat(stringConverter.sanitizeName(" "), is("-"));
		}

		@Test
		void 引数が改行の場合ハイフンを返す() {
			StringConverter stringConverter = new StringConverter();
			assertThat(stringConverter.sanitizeName("¥n"), is("-"));
		}

	}
}

package strings;

import static org.junit.Assert.*;

import org.junit.Test;


public class AnagramaTeste {
	
	@Test
	public void test(){
		assertTrue(Anagrama.isAnagram("", ""));
		assertTrue(Anagrama.isAnagram("a", "b"));
		assertTrue(Anagrama.isAnagram("ab", "a b"));
		assertTrue(Anagrama.isAnagram("ab", "ba"));
	}

}

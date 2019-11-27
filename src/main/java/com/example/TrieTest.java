package com.example;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.example.Trie.TrieNode;

public class TrieTest {

	private static final String[] KEYS = {"the", "a", "there", "answer", "any", 
            "by", "bye", "their"};
	private static final String[] OUTPUT = {"Not present in trie", "Present in trie"};
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Trie.root=new TrieNode();
	}

	@Test
	public void testSearch() {
		for(String key:KEYS) {
			Trie.insert(key);
		}
		if(Trie.search("the")) {
			System.out.printf("the: %s\n", OUTPUT[1]);
		} else {
			System.out.printf("the: %s\n", OUTPUT[0]);
		}
		if(Trie.search("these")) {
			System.out.printf("these: %s\n", OUTPUT[1]);
		} else {
			System.out.printf("these: %s\n", OUTPUT[0]);
		}
		if(Trie.search("their")) {
			System.out.printf("their: %s\n", OUTPUT[1]);
		} else {
			System.out.printf("their: %s\n", OUTPUT[0]);
		}
		if(Trie.search("thaw")) {
			System.out.printf("thaw: %s\n", OUTPUT[1]);
		} else {
			System.out.printf("thaw: %s\n", OUTPUT[0]);
		}
	}

}

package com.qa.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.main.BlackJack;

public class RunnerTest {
	
	static BlackJack b;
	
	@BeforeClass
	public static void setup() {
		b = new BlackJack();
	}
	
	@Test
	public void dealerBustTest() {
		assertEquals(1, b.play(22, 1));
	}
	
	@Test
	public void playerBustTest() {
		assertEquals(1, b.play(1, 22));
	}
	
	@Test
	public void dealerWinsTest() {
		assertEquals(21, b.play(21, 1));
	}
	
	@Test
	public void playerWinsTest() {
		assertEquals(21, b.play(1, 21));
	}
	
	@Test
	public void dealerWinsTieTest() {
		assertEquals(21, b.play(21, 21));
		assertTrue(b.dealerWins);
	}

}

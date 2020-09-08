package com.qa.main;

public class BlackJack {
	
	public boolean playerWins = false;
	public boolean dealerWins = false;
	
	public int play(int dealer, int player) {
		
		if(dealer > 21 && player > 21) {
			return 0;
		} else if (dealer > 21) {
			playerWins = true;
			return player;
		} else if (player > 21) {
			dealerWins = true;
			return dealer;
		} else if (player == dealer) {
			dealerWins = true;
			return dealer;
		}
		return Math.max(dealer, player);
	}

}

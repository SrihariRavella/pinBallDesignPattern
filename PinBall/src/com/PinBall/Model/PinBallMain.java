package com.PinBall.Model;

public class PinBallMain {

	public static void main(String[] args) {
		
		PinBall object = new PinBall();
		
		BuyPinBall buy = new BuyPinBall(object);
		PlayPinBall play = new PlayPinBall(object);
		Score score = new Score(object);
		StopGame stop = new StopGame(object);
		SellPinBall sell = new SellPinBall(object);
		
		buy.pinball.buyPinBallMachine();
		play.pinball.playPinBall();
		score.pinball.score();
		stop.pinball.stopGame();
		sell.pinball.sellPinBallMachine();
		
	}
}

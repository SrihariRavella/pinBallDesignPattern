package com.PinBall.Model;

import com.PinBall.Command.CommandOverPinBall;

public class BuyPinBall implements CommandOverPinBall{

	PinBall pinball;
	
	public BuyPinBall(PinBall pinball) {
		super();
		this.pinball = pinball;
	}

	@Override
	public void execute() {
		this.pinball.buyPinBallMachine();
	}

}

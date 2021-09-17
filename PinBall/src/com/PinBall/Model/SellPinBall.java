package com.PinBall.Model;

import com.PinBall.Command.CommandOverPinBall;

public class SellPinBall implements CommandOverPinBall{

	PinBall pinball;
	
	public SellPinBall(PinBall pinball) {
		super();
		this.pinball = pinball;
	}

	@Override
	public void execute() {
		this.pinball.sellPinBallMachine();
	}

}

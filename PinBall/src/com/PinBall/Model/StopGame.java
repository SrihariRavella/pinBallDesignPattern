package com.PinBall.Model;

import com.PinBall.Command.CommandOverPinBall;

public class StopGame implements CommandOverPinBall{

	PinBall pinball;
	
	public StopGame(PinBall pinball) {
		super();
		this.pinball = pinball;
	}

	@Override
	public void execute() {
		this.pinball.stopGame();
	}

}

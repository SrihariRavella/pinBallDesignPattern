package com.PinBall.Model;

import com.PinBall.Command.CommandOverPinBall;

public class PlayPinBall implements CommandOverPinBall{

	PinBall pinball;
	
	public PlayPinBall(PinBall pinball) {
		super();
		this.pinball = pinball;
	}

	@Override
	public void execute() {
		this.pinball.playPinBall();
	}

}

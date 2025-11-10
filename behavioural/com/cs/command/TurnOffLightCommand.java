package com.cs.command;

//Step 3: Concrete Command classes implementing specific actions
class TurnOffLightCommand implements Command {
	private Light light;

	public TurnOffLightCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOff(); // Delegates to receiver
	}
}
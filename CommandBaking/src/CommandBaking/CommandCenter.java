package CommandBaking;

public class CommandCenter {

	public static void main(String[] args) {
	
		Dashboard remote = new Dashboard();
	
		Light light = new Light();
		LightOn lightOn = new LightOn(light);
		LightOff lightOff = new LightOff(light);	
 
		Mixer mixer = new Mixer();
		MixerOn mixerOn = new MixerOn(mixer);
		MixerOff mixerOff = new MixerOff(mixer);
		
		Oven oven = new Oven();
		OvenOn ovenOn = new OvenOn(oven);
		OvenOff ovenOff = new OvenOff(oven);
		
		DishWasher dishwasher = new DishWasher();
		DishWasherOn dishwasherOn = new DishWasherOn(dishwasher);
		DishWasherOff dishwasherOff = new DishWasherOff(dishwasher);
		
		
		remote.setCommand(lightOn);
		remote.switchWasPressed();
		remote.setCommand(mixerOn);
		remote.switchWasPressed();
		remote.setCommand(ovenOn);
		remote.switchWasPressed();
		remote.setCommand(dishwasherOn);
		remote.switchWasPressed();
		System.out.println("This bakery is open for business!!");
		
		
		remote.setCommand(dishwasherOff);
		remote.switchWasPressed();
		remote.setCommand(mixerOff);
		remote.switchWasPressed();
		remote.setCommand(ovenOff);
		remote.switchWasPressed();
		remote.setCommand(lightOff);
		remote.switchWasPressed();
		
		System.out.println("We are closed for the night, come back bright and early tomorrow morning");
	}

}

package CommandBaking;

public class LightOff implements CommandInterface {

	Light light;
	  
	public LightOff(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}

}

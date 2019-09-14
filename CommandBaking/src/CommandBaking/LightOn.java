package CommandBaking;

public class LightOn implements CommandInterface {
	
	Light light;
	  
	public LightOn(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.on();
	}

}

package CommandBaking;

public class OvenOn implements CommandInterface {

	Oven oven;
	  
	public OvenOn(Oven oven) {
		this.oven = oven;
	}
 
	public void execute() {
		oven.on();
	}


}

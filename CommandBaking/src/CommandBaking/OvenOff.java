package CommandBaking;

public class OvenOff implements CommandInterface {

	Oven oven;
	  
	public OvenOff(Oven oven) {
		this.oven = oven;
	}
 
	public void execute() {
		oven.off();
	}

}

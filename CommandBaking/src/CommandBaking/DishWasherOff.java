package CommandBaking;

public class DishWasherOff implements CommandInterface {
	
	DishWasher dishwasher;
	  
	public DishWasherOff(DishWasher dishwasher) {
		this.dishwasher = dishwasher;
	}
 
	public void execute() {
		dishwasher.off();
	}

}

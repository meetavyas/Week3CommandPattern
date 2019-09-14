package CommandBaking;

public class DishWasherOn implements CommandInterface {

	DishWasher dishwasher;
	  
	public DishWasherOn(DishWasher dishwasher) {
		this.dishwasher = dishwasher;
	}
 
	public void execute() {
		dishwasher.on();
	}

}

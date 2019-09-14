package CommandBaking;

public class Dashboard {
	
	CommandInterface switchBoard;
	 
	public Dashboard() {}
 
	public void setCommand(CommandInterface command) {
		switchBoard = command;
	}
 
	public void switchWasPressed() {
		switchBoard.execute();
	} 

}

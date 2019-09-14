package CommandBaking;

public class MixerOff implements CommandInterface {

	Mixer mixer;
	  
	public MixerOff(Mixer mixer) {
		this.mixer = mixer;
	}
 
	public void execute() {
		mixer.off();
	}

}

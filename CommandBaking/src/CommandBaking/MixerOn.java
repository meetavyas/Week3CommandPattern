package CommandBaking;

public class MixerOn implements CommandInterface {

	Mixer mixer;
	  
	public MixerOn(Mixer mixer) {
		this.mixer = mixer;
	}
 
	public void execute() {
		mixer.on();
	}

}

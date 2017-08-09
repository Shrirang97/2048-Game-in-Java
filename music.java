import javax.sound.midi.*;
public class music {

	public void play()
	{
		try
		{
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			
			Sequence seq = new Sequence(Sequence.PPQ,4);
			Track tra = seq.createTrack();
			
			ShortMessage s = new ShortMessage();
			s.setMessage(144,1,20,100);
			MidiEvent eventOn = new MidiEvent(s,1);
			tra.add(eventOn);
			
			ShortMessage s1 = new ShortMessage();
			s1.setMessage(128,1,44,100);
			MidiEvent eventOff = new MidiEvent(s1,3);
			tra.add(eventOff);
			
			player.setSequence(seq);
			
			player.start();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("System is not working : "+e);
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		music m = new music();
		m.play();
	}

}

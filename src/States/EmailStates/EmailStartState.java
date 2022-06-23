package States.EmailStates;

import Detectors.Detector;
import States.State;

public class EmailStartState extends State {
    public EmailStartState(Detector detector){
        isAccepting = false;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        if (character.equals(" ") || character.equals("@")){
            detector.setState(new EmailInvalidState(detector));
        }
        else{
            detector.setState(new EmailPart1State(detector));
        }
    }
}

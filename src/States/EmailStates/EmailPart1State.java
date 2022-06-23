package States.EmailStates;

import Detectors.Detector;
import States.State;

public class EmailPart1State extends State {
    public EmailPart1State(Detector detector) {
        isAccepting = false;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        if (character.equals(" ")){
            detector.setState(new EmailInvalidState(detector));
        }
        else if(character.equals("@")){
            detector.setState(new EmailAtState(detector));
        }
    }
}

package States.EmailStates;

import Detectors.Detector;
import States.State;

public class EmailPart2State extends State {
    public EmailPart2State(Detector detector) {
        isAccepting = false;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        if(character.equals(" ") || character.equals("@")){
            detector.setState(new EmailInvalidState(detector));
        }
        else if(character.equals(".")){
            detector.setState(new EmailPeriodState(detector));
        }
    }
}

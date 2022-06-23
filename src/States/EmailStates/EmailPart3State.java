package States.EmailStates;

import Detectors.Detector;
import States.State;

public class EmailPart3State extends State {
    public EmailPart3State(Detector detector) {
        isAccepting = true;
        this.detector = detector;
    }

    @Override
    public void consumeInput(String character) {
        if (character.equals(" ") || character.equals("@") || character.equals(".")){
            detector.setState(new EmailInvalidState(detector));
        }
    }
}

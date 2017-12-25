package Devices;

import datatTypes.EventDataImp;
import datatTypes.HomePosition;
import datatTypes.Position;
import org.springframework.stereotype.Controller;

import java.util.Optional;

import static javafx.scene.input.KeyCode.T;

@Controller
public class FireAlaram extends Agent{
    public FireAlaram(Position pos) {
        super(pos);
    }

//    @Override
//    public void subscribe(Flow.Subscriber<? super Device> subscriber) {
//
//    }

    @Override
    public void request(long n) {

    }

    void event()
    {
        EventDataImp eventDataImp = new EventDataImp(position,"Fire Fire", Optional.empty());
        sendEvent(eventDataImp);
    }

    @Override
    public Position getListenPosition() {
        return new HomePosition(1,1,1);
    }
}

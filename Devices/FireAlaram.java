package Devices;

import datatTypes.HomePosition;
import datatTypes.Position;
import org.springframework.stereotype.Controller;

@Controller
public class FireAlaram extends Agent{
    FireAlaram(HomePosition pos) {
        super(pos);
    }

//    @Override
//    public void subscribe(Flow.Subscriber<? super Device> subscriber) {
//
//    }

    @Override
    public void request(long n) {

    }

    @Override
    public Position getListenPosition() {
        return new HomePosition(1,1,1);
    }
}

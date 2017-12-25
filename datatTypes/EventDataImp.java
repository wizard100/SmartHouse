package datatTypes;

import java.util.Optional;

public class EventDataImp implements EventData {
    public EventDataImp(Position position, String msg, Optional<String> senderAddress) {
        this.position = position;
        this.msg = msg;
        this.senderAddress = senderAddress;
    }

    public Position position;
    public String msg;
    public Optional<String> senderAddress;
}

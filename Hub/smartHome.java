package Hub;

import Devices.Agent;
import Devices.Device;
import datatTypes.EventDataImp;
import datatTypes.Position;
import observers.Observer;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class smartHome implements  Home {
    public smartHome(@Autowired ArrayList<Observer> observers,@Autowired ArrayList<Device> subscribers) {
        this.observers = observers;
        subscribeDevices(subscribers);
    }

    private void subscribeDevices(ArrayList<Device> subscribers)
    {
        for(Device device : subscribers)
        {
            List<Device> devices = subscribersMap.get(device.getListenPosition());
            if (devices == null) {
                devices = new ArrayList<>();
                subscribersMap.put(device.getListenPosition(), new ArrayList<Device>());
            }
            devices.add(device);
        }
    }

    public void onSubscribe() {

    }

    public void onNext(Device item) {

    }

    public void onError(Throwable throwable) {

    }

    public void onComplete() {

    }

    public void event(EventDataImp eventDataImp)
    {

    }

    private ArrayList<Observer> observers;
    private HashMap<Position,List<Device>> subscribersMap;

    public void subscribe(Agent agent) {

    }
}


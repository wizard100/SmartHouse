package Devices;

import comm.CommToHome;
import comm.DeviceRestComm;
import comm.Subscription;
import datatTypes.EventData;
import datatTypes.EventDataImp;
import datatTypes.HomePosition;
import datatTypes.Position;

public abstract class Agent implements Device , CommToHome, Subscription {

    Agent(Position pos)
    {
        position = pos;
    }

    public void subscribe() {

    }


    public void request(long n) {

    }

    public void cancel() {

    }



    @Override
    public void sendEvent(EventDataImp eventDataImp) {
        deviceRestComm.sendEvent(eventDataImp);
    }

    @Override
    public void reportEvent() {

    }

    @Override
    public void Subscribe() {

    }

    @Override
    public void unSubscribe() {

    }

    protected Position position;
    private DeviceRestComm deviceRestComm;
}

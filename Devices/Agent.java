package Devices;

import comm.CommToHome;
import comm.Subscription;
import datatTypes.HomePosition;

public abstract class Agent implements Device , CommToHome, Subscription {

    Agent(HomePosition pos)
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
    public void sendEvent() {

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

    HomePosition position;
}

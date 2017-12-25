package comm;

import datatTypes.EventDataImp;

public interface CommToHome {
    void sendEvent(EventDataImp eventDataImp);
    void reportEvent();
}

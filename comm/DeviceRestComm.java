package comm;

import datatTypes.EventDataImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DeviceRestComm implements  Subscription{

    @Autowired
    String HouseAddress;// =  "http://localhost:8080/House/";

    @Autowired
    String EventHappen;// = Event/Happen


    @RequestMapping(method = RequestMethod.POST)
    public void sendEvent(EventDataImp eventDataImp) {
        List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
        acceptableMediaTypes.add(MediaType.APPLICATION_JSON);

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(acceptableMediaTypes);
        HttpEntity<EventDataImp> entity = new HttpEntity<EventDataImp>(eventDataImp, headers);
        String url = HouseAddress + EventHappen;

        RestTemplate restTemplate = new RestTemplate();
        try {
            ResponseEntity<EventDataImp> result = restTemplate.exchange(url, HttpMethod.POST, entity, EventDataImp.class);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void reportEvent() {

    }

    @Override
    public void Subscribe() {

    }

    @Override
    public void unSubscribe() {

    }
}

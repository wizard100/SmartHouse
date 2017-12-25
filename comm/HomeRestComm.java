package comm;

import Hub.smartHome;
import datatTypes.EventDataImp;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "House/")
public class HomeRestComm {

    public HomeRestComm(@Autowired final smartHome home, @Autowired final String eventHappen) {
        this.home = home;
        EventHappen = eventHappen;
    }

    final private smartHome home;

    final private String EventHappen;

    @ResponseBody
    @RequestMapping(value = "Event/Happen", method = RequestMethod.POST)
    public void eventHappen(HttpServletRequest request, EventDataImp eventDataImp)
    {
        home.event(eventDataImp);
    }


}

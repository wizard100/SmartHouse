//package Devices;
//
//import Hub.Home;
//import Hub.smartHome;
//import datatTypes.HomePosition;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import static org.mockito.Mockito.*;
//
//public class AgentTest {
//
//    private class myException extends Exception {
//
//    }
//
//    Agent agent;
//
////    @Mock
////    private Home home;
//
//    @Before
//    public void setUp() throws Exception {
//        agent = new FireAlaram(new HomePosition(1,1,1));
//
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }
//
//    @Test(expected = myException.class)
//    public void subscribe() {
//        Home home = mock(Home.class);
//        doThrow(myException.class).when(home).subscribe(agent);
//        agent.subscribe();
//    }
//
//    @Test
//    public void cancel() {
//
//    }
//}
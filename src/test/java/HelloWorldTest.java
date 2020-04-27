import learn.helloworld.Dependency;
import learn.helloworld.HelloWorld;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HelloWorldTest {
    @Test
    public void should_be_mocked() {
        Dependency dependency = mock(Dependency.class);
        when(dependency.say()).thenReturn("Hello World");
        HelloWorld helloWorld = new HelloWorld(dependency);

        helloWorld.beenCalled();
    }
}

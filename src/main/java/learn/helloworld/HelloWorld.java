package learn.helloworld;

/**
 * Created by spring on 3/28/20.
 *
 * @author spring
 */
public class HelloWorld {
    private Dependency dependency;

    public HelloWorld(Dependency dependency) {

        this.dependency = dependency;
    }

    public String beenCalled() {
        return dependency.say();
    }
}

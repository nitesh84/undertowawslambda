package package2;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject; 


@ApplicationScoped
public class myfuntion {

    @Inject
    @ConfigProperty(name="message",defaultValue="hello m quarkus as lambda")
    String message;

    public String test() {
        return this.message;
    }
}

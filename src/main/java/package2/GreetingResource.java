package package2;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import io.undertow.Undertow;
import io.quarkus.runtime.Startup;



@ApplicationScoped
@Path("/hello")
public class GreetingResource {
 
    @Inject
    myfuntion mess;

   

    private Undertow server;

        @PostConstruct
    void init() {
        // Configure and start the Undertow server here
        server = Undertow.builder()
                .addHttpListener(8080, "0.0.0.0")
                .setHandler(new GreetingResourceHandler()) // Create this handler class
                .build();
        server.start();
    }


    public String hello() {
        return this.mess.test();
    }
}

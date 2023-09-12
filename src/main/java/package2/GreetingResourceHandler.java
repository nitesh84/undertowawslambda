package package2;

import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import jakarta.ws.rs.core.MediaType;
import io.undertow.util.Headers;

public class GreetingResourceHandler implements HttpHandler {
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, MediaType.TEXT_PLAIN.toString());



        exchange.getResponseSender().send("Hello from Undertow within Quarkus!");
    }
}

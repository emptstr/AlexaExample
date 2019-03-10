package alexaexample.intent.handler;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorldIntentHandler implements RequestHandler {
    private static final Logger LOG = LogManager.getLogger(HelloWorldIntentHandler.class);

    @Override
    public boolean canHandle(HandlerInput input) {
        LOG.info("Received request: " + input);
        return input.matches(Predicates.intentName("HelloWorldIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Hello world";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("HelloWorld", speechText)
                .build();
    }
}

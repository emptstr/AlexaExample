package alexaexample.skill.handler;

import alexaexample.intent.handler.HelloWorldIntentHandler;
import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import alexaexample.intent.handler.CancelAndStopIntentHandler;
import alexaexample.intent.handler.HelpIntentHandler;
import alexaexample.intent.handler.LaunchRequestHandler;
import alexaexample.intent.handler.SessionEndedRequestHandler;

public class AlexaExampleSkillModule extends AbstractModule {

    @Provides
    @Singleton
    public Skill provideSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelAndStopIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new HelloWorldIntentHandler())
                .build();
    }

    @Override
    protected void configure() {}
}

package alexaexample.skill.handler;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.google.inject.Guice;
import com.google.inject.Injector;


public class AlexaExampleSkillStreamHandler extends SkillStreamHandler {

    private static final Injector injector = Guice.createInjector(new AlexaExampleSkillModule());

    public AlexaExampleSkillStreamHandler() {
        super(injector.getInstance(Skill.class));
    }
}

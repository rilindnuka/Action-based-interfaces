package rilind.actioninterfaces.services.impl;

import org.springframework.stereotype.Component;
import rilind.actioninterfaces.models.ActionSteps;
import rilind.actioninterfaces.services.Action;

import java.util.logging.Logger;

@Component
public class FirstAction implements Action<ActionSteps> {
    private static final Logger LOG = Logger.getLogger(FirstAction.class.getName());
    private final Action<ActionSteps> nextAction;

    public FirstAction(final Action<ActionSteps> secondAction) {
        this.nextAction = secondAction;
    }

    @Override
    public void performAction(ActionSteps actionSteps) {
        LOG.info("First action called");
        actionSteps.setStepOne("Step One completed");
        LOG.info("First action finished");
        nextAction.performAction(actionSteps);
    }
}

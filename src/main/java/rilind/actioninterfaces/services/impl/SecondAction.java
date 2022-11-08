package rilind.actioninterfaces.services.impl;

import org.springframework.stereotype.Component;
import rilind.actioninterfaces.models.ActionSteps;
import rilind.actioninterfaces.services.Action;

import java.util.logging.Logger;

@Component
public class SecondAction implements Action<ActionSteps> {
    private static final Logger LOG = Logger.getLogger(SecondAction.class.getName());
    private final Action<ActionSteps> nextAction;

    public SecondAction(final Action<ActionSteps> thirdAction) {
        this.nextAction = thirdAction;
    }

    @Override
    public void performAction(ActionSteps actionSteps) {
        LOG.info("Second action called");
        actionSteps.setStepTwo("Step Two completed");
        LOG.info("Second action finished");
        nextAction.performAction(actionSteps);
    }
}

package rilind.actioninterfaces.services.impl;

import org.springframework.stereotype.Component;
import rilind.actioninterfaces.models.ActionSteps;
import rilind.actioninterfaces.services.Action;
import rilind.actioninterfaces.services.ActionService;

import java.util.logging.Logger;

@Component
public class ActionWorkflowService implements ActionService {
    private static final Logger LOG = Logger.getLogger(ActionWorkflowService.class.getName());
    private final Action<ActionSteps> nextAction;

    public ActionWorkflowService(Action<ActionSteps> firstAction) {
        this.nextAction = firstAction;
    }

    @Override
    public ActionSteps start() {
        LOG.info("Started the workflow");
        ActionSteps steps = ActionSteps.builder().build();
        nextAction.performAction(steps);
        return steps;
    }
}

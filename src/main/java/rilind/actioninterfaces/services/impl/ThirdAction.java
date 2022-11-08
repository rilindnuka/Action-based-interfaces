package rilind.actioninterfaces.services.impl;

import org.springframework.stereotype.Component;
import rilind.actioninterfaces.models.ActionSteps;
import rilind.actioninterfaces.services.Action;

import java.util.logging.Logger;

@Component
public class ThirdAction implements Action<ActionSteps> {
    private static final Logger LOG = Logger.getLogger(ThirdAction.class.getName());


    @Override
    public void performAction(ActionSteps actionSteps) {
        LOG.info("Third action called");
        actionSteps.setStepThree("Step Three completed");
        LOG.info("Third action finished");

    }
}

package rilind.actioninterfaces.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rilind.actioninterfaces.models.ActionSteps;
import rilind.actioninterfaces.services.ActionService;
import rilind.actioninterfaces.services.impl.ActionWorkflowService;

@RestController
public class ActionController {
    private final ActionService service;

    public ActionController(ActionWorkflowService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ActionSteps doTheActions() {
        return service.start();
    }
}

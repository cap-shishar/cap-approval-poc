package com.camundaCAPApprovalMain.capApprovalMain;

import io.camunda.zeebe.client.ZeebeClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/process")
public class CapController {
    private static final Logger LOG = (Logger) LoggerFactory.getLogger(CapController.class);
    @Autowired
    ZeebeClient zeebe;

    @PostMapping("/start")
    public void startProcessInstance(@RequestBody StartForm variable) {
        LOG.info(
                "Starting process `" + "Quote Return Order Approval" + "` with variables: " + variable.toString());
        zeebe
                .newCreateInstanceCommand()
                .bpmnProcessId("contractApprovalProcess")
                .latestVersion()
                .variables(variable)
                .send();
    }
}

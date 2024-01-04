package com.camundaCAPApprovalMain.capApprovalMain;

import org.springframework.stereotype.Service;
import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.ZeebeVariable;
import io.camunda.zeebe.spring.client.annotation.ZeebeWorker;


@Service
public class EmailServices {
    @ZeebeWorker(type = "sendEmail", autoComplete = true)
    public void sendEmail(final JobClient client, final ActivatedJob job, @ZeebeVariable String toEmailAddress,@ZeebeVariable String emailBody, @ZeebeVariable String emailSubject) {
        System.out.println("Starting the email function...............!\n");
        System.out.println("Sending the email to :- "+toEmailAddress+"...............!");
        System.out.println("Email Subject :-  " + emailSubject);
        System.out.println("Email Body :-  " + emailBody+"\n");
        System.out.println("Ending the email function...............!\n");
    }
}




























//
//    @ZeebeWorker(type = "sendEmailToRequestor", autoComplete = true)
//    public void sendEmailToRequestor(final JobClient client, final ActivatedJob job, @ZeebeVariable String requestorEmail) {
//        System.out.println("Send Email to Requestor within the mail id " + requestorEmail + "  ...................!!!!!!!!!!!!!!! \n \n");
//    }
//
//    @ZeebeWorker(type = "sendEmailToRequestorForOrderRejection", autoComplete = true)
//    public void sendEmailToRequestorForOrderRejection(final JobClient client, final ActivatedJob job, @ZeebeVariable String requestorEmail) {
//        System.out.println("Send Email to Requestor for Order Rejection within the mail id " + requestorEmail + "  ...................!!!!!!!!!!!!!!! \n \n");
//    }
//
//    @ZeebeWorker(type = "sendEmailToRegionalApprover", autoComplete = true)
//    public void sendEmailToRegionalApprover(final JobClient client, final ActivatedJob job, @ZeebeVariable String regionalApproverEmail) {
//        System.out.println("Send Email to Regional Approver within the mail id " + regionalApproverEmail + "  ...................!!!!!!!!!!!!!!! \n \n");
//    }
//
//    @ZeebeWorker(type = "sendEmailToCentralApprover", autoComplete = true)
//    public void sendEmailToCentralApprover(final JobClient client, final ActivatedJob job, @ZeebeVariable String centralApproverEmail) {
//        System.out.println("Send Email to Central Approver within the mail id " + centralApproverEmail + "  ...................!!!!!!!!!!!!!!! \n \n");
//    }
//
//    @ZeebeWorker(type = "sendEmailToShopperWithSelfPayQuote", autoComplete = true)
//    public void sendEmailToShopperWithSelfPayQuote(final JobClient client, final ActivatedJob job, @ZeebeVariable String shopperEmail) {
//        System.out.println("Send Email to Shopper with Self Pay Quote within the mail id " + shopperEmail + "  ...................!!!!!!!!!!!!!!! \n \n");
//    }
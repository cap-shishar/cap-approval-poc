package com.camundaCAPApprovalMain.capApprovalMain;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.model.bpmn.BpmnModelException;
import io.camunda.zeebe.spring.client.annotation.ZeebeVariable;
import io.camunda.zeebe.spring.client.annotation.ZeebeWorker;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CapServices {

//    @ZeebeWorker(type = "getApprovers", autoComplete = true)
//    public Map<String,Object> getApprovers(final JobClient client, final ActivatedJob job, @ZeebeVariable String approverLevel,@ZeebeVariable String distributorType, @ZeebeVariable String requestType ) {
//        System.out.println(" approverLevel is :------- "+ approverLevel+" \n");
//        System.out.println(" distributorType is :------- "+ distributorType+" \n");
//        System.out.println("requestType  is :------- "+ requestType+" \n");
//        System.out.println("Getting the regional Approver Details .......................................................!!!!!!!! \n \n");
//        HashMap<String, Object> variables = new HashMap<>();
//        if(requestType.equals("QUOTE")){
//            if(distributorType.equals("VA")){
//                if(approverLevel.equals("REGIONAL")){
//                    variables.put("emailAddress","quotevaregionalapprover@gmail.com");
//                } else if (approverLevel.equals("CENTRAL")){
//                    variables.put("emailAddress","quotevacentralapprover@gmail.com");
//                }
//            }else if (distributorType.equals("DOD")){
//                if(approverLevel.equals("CENTRAL")){
//                    variables.put("emailAddress","quotedodcentralapprover@gmail.com");
//                }
//            }
//        }else if(requestType.equals("CANCELORDER")){
//            variables.put("emailAddress","regional123@gmail.com");
//        }else{
//            throw new BpmnModelException("Unknow Request Type");
//        }
//
//        return  variables;
//    }
@ZeebeWorker(type = "getApprovers", autoComplete = true)
public void getApprovers(final JobClient client, final ActivatedJob job, @ZeebeVariable String approverLevel,@ZeebeVariable String distributorType, @ZeebeVariable String requestType){
    System.out.println("Starting the function of featching the Details of the current approver...............!\n");

    System.out.println(" This time approverLevel is :------- "+ approverLevel);
    System.out.println(" And our distributorType is :------- "+ distributorType);
    System.out.println(" And our requestType  is :------- "+ requestType+"\n");

    System.out.println("Ending the function of featching the Details of the current approver...............!\n");
}


    @ZeebeWorker(type = "logQuoteEntry", autoComplete = true)
    public void logQuoteEntry(final JobClient client, final ActivatedJob job, @ZeebeVariable String quoteNumber, @ZeebeVariable String logMessage) {
        System.out.println("Starting the function of Logging the Quote details for entry...............!\n");

        System.out.println("Quote number is this :------- "+ quoteNumber);
        System.out.println("Log Message is this :------- "+logMessage+"\n");

        System.out.println("Ending the function of Logging the Quote details for entry...............!\n");
    }
    @ZeebeWorker(type = "saveQuoteAction", autoComplete = true)
    public void saveQuoteAction(final JobClient client, final ActivatedJob job,@ZeebeVariable String quoteNumber,@ZeebeVariable String quoteAction, @ZeebeVariable String approverLevel) {
        System.out.println("Starting the function of saveQuoteAction ...............!\n");

        System.out.println(" The Quote number is :------- "+ quoteNumber);
        System.out.println(" And Quote action is :------- "+ quoteAction);
        System.out.println(" Approval level is :------- "+ approverLevel+"\n");

        System.out.println("Ending the function of saveQuoteAction ...............!\n");
    }

   @ZeebeWorker(type = "updateSelfPayQuote", autoComplete = true)
    public void updateSelfPayQuote(final JobClient client, final ActivatedJob job, @ZeebeVariable String selfPayQuoteNumber, @ZeebeVariable String status){
       System.out.println("Starting the function of saveQuoteAction ...............!\n");

       System.out.println("Updating the selfPayQuote of this quote number :------ "+selfPayQuoteNumber);
       System.out.println("Updating the selfPayQuote status is :------ "+status+"\n");
       System.out.println("Ending the function of saveQuoteAction ...............!\n");
   }

    @ZeebeWorker(type = "getSelfPayQuote", autoComplete = true)
    public void getSelfPayQuote(final JobClient client, final ActivatedJob job, @ZeebeVariable String quoteNumber, @ZeebeVariable String quoteStatus){
        System.out.println("Starting the function of getSelfPayQuote ...............!\n");

        System.out.println("Geting the details for this quotenumber:------- "+quoteNumber);
        System.out.println("Approval Status for this quotenumber is :------- "+quoteStatus+"\n");

        System.out.println("Ending the function of getSelfPayQuote ...............!\n");
    }


}

//
//    @ZeebeWorker(type = "saveQuoteActionByRegional", autoComplete = true)
//    public Map<String,Object> saveQuoteActionByRegional(final JobClient client, final ActivatedJob job , @ZeebeVariable String regionalApproverEmail) {
//        System.out.println("Save the Quote Action which is done by Regional Approval .........................!!!!!!!!!!!!!!!\n \n ");
//        HashMap<String, Object> variables = new HashMap<>();
//        if (true){
//            variables.put("quoteApproveStatusByRegional", "DECLINED");
//        }else{
//            variables.put("quoteApproveStatusByRegional", "APPROVED");
//        }
//        return variables;
//    }
//
//    @ZeebeWorker(type = "getQuoteDetails", autoComplete = true)
//    public void getQuoteDetails(final JobClient client, final ActivatedJob job) {
//        System.out.println("Checking the Quote details after ...................!!!!!!!!!!!!!!! \n \n");
//    }
//    @ZeebeWorker(type = "addToSelfPayQuote", autoComplete = true)
//    public void addToSelfPayQuote(final JobClient client, final ActivatedJob job ) {
//        System.out.println("Add to self pay quote  ...................!!!!!!!!!!!!!!!\n \n ");
//    }
//
//    @ZeebeWorker(type = "saveQuoteActionByCentral", autoComplete = true)
//    public Map<String,Object> saveQuoteActionByCentral(final JobClient client, final ActivatedJob job , @ZeebeVariable String centralApproverEmail) {
//        System.out.println("Save the Quote Action which is done by Central Approval .........................!!!!!!!!!!!!!!!\n \n ");
//        HashMap<String, Object> variables = new HashMap<>();
//        if (true){
//            variables.put("quoteApproveStatusByCentral", "DECLINED");
//        }else{
//            variables.put("quoteApproveStatusByCentral", "APPROVED");
//        }
//        return variables;
//    }
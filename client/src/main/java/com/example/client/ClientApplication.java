package com.example.client;

import com.example.client.schemas.SayHello;
import com.example.client.schemas.SayHelloResponse;
import com.example.client.soap.SOAPConnector;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.xml.bind.JAXBElement;

@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    CommandLineRunner lookup(SOAPConnector soapConnector) {
        return args -> {
            String name = "Sajal";//Default Name
            if(args.length>0){
                name = args[0];
            }
            SayHello request =new SayHello();
            request.setName(name);
            JAXBElement<SayHelloResponse> response=( JAXBElement<SayHelloResponse>) soapConnector.callWebService("http://localhost:8080/webservice/webservice",request);
           // SayHelloResponse sayHelloResponse=(SayHelloResponse)response;
            System.out.println(response.getValue().getReturn());
          //  System.out.println(response.getReturn());
//            StudentDetailsRequest request = new StudentDetailsRequest();
//            request.setName(name);
//            StudentDetailsResponse response =(StudentDetailsResponse) soapConnector.callWebService("http://localhost:8080/service/student-details", request);
//            System.out.println("Got Response As below ========= : ");
//            System.out.println("Name : "+response.getStudent().getName());
//            System.out.println("Standard : "+response.getStudent().getStandard());
//            System.out.println("Address : "+response.getStudent().getAddress());
        };
    }
}

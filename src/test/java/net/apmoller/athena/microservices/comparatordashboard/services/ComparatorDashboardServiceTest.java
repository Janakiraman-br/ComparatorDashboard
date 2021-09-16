//package net.apmoller.athena.microservices.comparatordashboard.services;
//
//import net.apmoller.athena.microservices.comparatordashboard.dtoContractRateDto;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import reactor.core.publisher.Mono;
//import reactor.test.StepVerifier;
//
//import java.time.LocalDate;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest
//@ExtendWith(SpringExtension.class)
//public class ComparatorDashboardServiceTest {
//
//    @Autowired
//    private ComparatorDashboardService service;
//
//    @Test
//    public void getContractRateTest(){
//
//        String rateCode = "ATH10001";
//        ContractRateDto expectedDto = ContractRateDto.builder().rateCode(rateCode).message("This is sample rate").rateType("CPQ").
//                creationDate(LocalDate.of(2020,12,12)).build();
//        Mono<ContractRateDto> response = service.getContractRate(rateCode);
//
//        StepVerifier.create(response).assertNext(actualDto -> {
//            assertEquals(actualDto, expectedDto);
//        }).verifyComplete();
//    }
//
//    @Test
//    public void createContractRateTest(){
//
//        LocalDate creationDate = LocalDate.of(2020,12,12);
//        String rateCode = "ATH10001";
//        ContractRateDto expectedDto = ContractRateDto.builder().rateCode(rateCode).message("This is sample rate").callingClientId("PEMA")
//                .build();
//        Mono<ContractRateDto> response = service.createContractRate(expectedDto);
//
//        StepVerifier.create(response).assertNext(actualDto -> {
//            assertEquals(creationDate, actualDto.getCreationDate());
//        }).verifyComplete();
//    }
//}

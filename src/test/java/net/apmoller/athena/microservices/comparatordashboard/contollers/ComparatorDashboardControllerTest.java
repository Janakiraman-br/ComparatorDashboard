//package net.apmoller.athena.microservices.comparatordashboard.contollers;
//
//
//import net.apmoller.athena.microservices.comparatordashboard.controllers.ComparatorDashboardController;
//import net.apmoller.athena.microservices.comparatordashboard.services.ComparatorDashboardService;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.reactive.server.WebTestClient;
//import org.springframework.web.reactive.function.BodyInserters;
//import org.springframework.web.util.UriComponentsBuilder;
//import reactor.core.publisher.Mono;
//
//import java.time.LocalDate;
//
//import static org.mockito.Mockito.times;
//
//@ExtendWith(SpringExtension.class)
//@WebFluxTest(controllers = ComparatorDashboardController.class)
//public class ComparatorDashboardControllerTest {
//
//
//    @Autowired
//    private WebTestClient webClient;
//
//    @MockBean
//            ComparatorDashboardService service;
//
//    @Test
//    void testGetContractRate() {
//        String rateCode = "ATH10001";
//
//         ContractRateDto dto = ContractRateDto.builder().rateCode(rateCode).message("This is sample rate").rateType("CPQ").callingClientId("Web")
//                .creationDate(LocalDate.of(2020,12,12)).build();
//
//        Mockito.when(service.getContractRate(rateCode)).thenReturn(Mono.just(dto));
//
//        webClient.get().uri(UriComponentsBuilder.fromUriString("/api/v1/contractRate")
//                .path("/{rateCode}").buildAndExpand(rateCode).toUri())
//                .header("AUTHORIZATION","Test_Token")
//                .header(HttpHeaders.ACCEPT, "application/json")
//                .exchange()
//                .expectStatus().isOk()
//                .expectBody(ContractRateDto.class).isEqualTo(dto);
//
//        Mockito.verify(service, times(1)).getContractRate(rateCode);
//
//
//    }
//
//    @Test
//    void testCreateContractRate() {
//
//        String rateCode = "ATH10001";
//        ContractRateDto dto = ContractRateDto.builder().rateCode(rateCode).message("This is sample rate").rateType("CPQ")
//                .creationDate(LocalDate.of(2020,12,12)).build();
//
//        Mockito.when(service.createContractRate(dto)).thenReturn(Mono.just(dto));
//
//        webClient.post()
//                .uri("/api/v1/contractRate")
//                .header("AUTHORIZATION","Test_Token")
//                .header(HttpHeaders.ACCEPT, "application/json")
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(BodyInserters.fromObject(dto))
//                .exchange()
//                .expectStatus().isCreated();
//
//        Mockito.verify(service, times(1)).createContractRate(dto);
//    }
//
//
//}

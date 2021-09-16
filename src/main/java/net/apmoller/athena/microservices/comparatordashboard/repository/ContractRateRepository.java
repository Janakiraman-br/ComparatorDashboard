package net.apmoller.athena.microservices.comparatordashboard.repository;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@Repository

// This is just a sample Model
public class ContractRateRepository {

//    public Mono<ContractRate> getContractRateByCode(String rateCode) {
//        ContractRate rate = ContractRate.builder().rateId("10001").rateCode(rateCode).message("This is sample rate").rateType("CPQ")
//                .creationDate(LocalDate.of(2020,12,12)).build();
//        return Mono.just(rate);
//
//    }
//    public Mono<ContractRate> save(ContractRate contractRate) {
//        contractRate.setRateId("11000000");
//        contractRate.setCreationDate(LocalDate.of(2020,12,12));
//        return Mono.just(contractRate);
//    }
}

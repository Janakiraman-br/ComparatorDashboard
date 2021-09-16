package net.apmoller.athena.microservices.comparatordashboard.services;


import net.apmoller.athena.microservices.comparatordashboard.dto.ComparatorDashboardDto;
import net.apmoller.athena.microservices.comparatordashboard.models.ComparatorDashboard;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.List;

/**
 * This is an interface for contract.rates service methods
 */
public interface ComparatorDashboardService {

    // Sample methods
//    Mono<ContractRateDto> getContractRate(String rateId);
//    Mono<ContractRateDto> createContractRate(ContractRateDto contractRateDto);

      ComparatorDashboard getresponse(String date) throws IOException;
}

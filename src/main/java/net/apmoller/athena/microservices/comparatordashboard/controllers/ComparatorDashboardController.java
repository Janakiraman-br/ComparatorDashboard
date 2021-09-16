package net.apmoller.athena.microservices.comparatordashboard.controllers;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.apmoller.athena.microservices.comparatordashboard.dto.ComparatorDashboardDto;


import net.apmoller.athena.microservices.comparatordashboard.models.ComparatorDashboard;
import net.apmoller.athena.microservices.comparatordashboard.services.ComparatorDashboardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Slf4j
public class ComparatorDashboardController {

    private static final String BRAND_REGEX = "[a-zA-Z]{4}";
    private static final String CUSTOMER_CODE_REGEX = "[a-zA-Z0-9-]{3,20}";
    private static final String AUTHORIZATION = "Authorization";
    private final ComparatorDashboardService service;

@PostMapping("/response")
public ComparatorDashboard getdata(@RequestBody String date) throws IOException {
    return service.getresponse(date);
}

 //   @GetMapping(value = "/contractRate/{rateId}",produces = {"application/json","application/stream+json"})
//    public Mono<ResponseEntity<ComparatorDashboardDto>> getContractRate(@PathVariable("rateId") String rateId,
//                                                                        @RequestHeader(value = AUTHORIZATION) String token) {
//        // first step is to validate the jwt token then only call the service method
////        return service.getContractRate(rateId).map( ComparatorDashboardDto-> ResponseEntity.ok(ComparatorDashboardDto)).
////                defaultIfEmpty(ResponseEntity.notFound().build());
//
//    }





}

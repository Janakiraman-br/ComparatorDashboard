package net.apmoller.athena.microservices.comparatordashboard.controllers;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.apmoller.athena.microservices.comparatordashboard.models.ComparatorDashboard;
import net.apmoller.athena.microservices.comparatordashboard.services.ComparatorDashboardService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.io.IOException;


@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Slf4j
public class ComparatorDashboardController {
    @Autowired
    private final ComparatorDashboardService service;

    @PostMapping("/response")
    public ComparatorDashboard[] readResponseFromJson(@RequestBody String date) throws IOException {
        return service.readResponseFromJson(date);
    }
}

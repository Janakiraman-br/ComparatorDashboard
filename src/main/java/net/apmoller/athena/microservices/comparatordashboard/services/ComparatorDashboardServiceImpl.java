package net.apmoller.athena.microservices.comparatordashboard.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import net.apmoller.athena.microservices.comparatordashboard.models.ComparatorDashboard;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;



@Service
@Slf4j
public class ComparatorDashboardServiceImpl implements ComparatorDashboardService {
    @Override
    public ComparatorDashboard[] readResponseFromJson(String date) throws IOException {
        Path path = Paths.get("src/main/resources/response.json");
        Stream<String> lines = Files.lines(path);
        String athenaRates = lines.collect(Collectors.joining("\n"));
        lines.close();
        ObjectMapper mapper = new ObjectMapper();
        ComparatorDashboard[] athenaRate = mapper.readValue(athenaRates, ComparatorDashboard[].class);
        return athenaRate;
    }


}

package net.apmoller.athena.microservices.comparatordashboard.services;

import net.apmoller.athena.microservices.comparatordashboard.models.ComparatorDashboard;
import java.io.IOException;


public interface ComparatorDashboardService {

    ComparatorDashboard[] readResponseFromJson(String date) throws IOException;
}

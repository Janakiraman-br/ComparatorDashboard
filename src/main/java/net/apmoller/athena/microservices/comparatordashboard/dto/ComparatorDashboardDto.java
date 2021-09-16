package net.apmoller.athena.microservices.comparatordashboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ComparatorDashboardDto {
    private String date;
    private Integer filesGenerated;
    private Integer filesWorking;
    private Integer analysed;


}

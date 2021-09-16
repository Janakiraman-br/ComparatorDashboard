package net.apmoller.athena.microservices.comparatordashboard.mappers;

import javax.annotation.processing.Generated;
import net.apmoller.athena.microservices.comparatordashboard.dto.ComparatorDashboardDto;
import net.apmoller.athena.microservices.comparatordashboard.models.ComparatorDashboard;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-16T17:37:30+0530",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
@Component
public class ContractRateMapperImpl implements ContractRateMapper {

    @Override
    public ComparatorDashboardDto modelToDto(ComparatorDashboard model) {
        if ( model == null ) {
            return null;
        }

        ComparatorDashboardDto comparatorDashboardDto = new ComparatorDashboardDto();

        comparatorDashboardDto.setDate( model.getDate() );
        comparatorDashboardDto.setFilesgenerated( model.getFilesgenerated() );
        comparatorDashboardDto.setFilesworking( model.getFilesworking() );
        comparatorDashboardDto.setAnalysed( model.getAnalysed() );

        return comparatorDashboardDto;
    }

    @Override
    public ComparatorDashboard DtoToModel(ComparatorDashboardDto dto) {
        if ( dto == null ) {
            return null;
        }

        ComparatorDashboard comparatorDashboard = new ComparatorDashboard();

        comparatorDashboard.setDate( dto.getDate() );
        comparatorDashboard.setFilesgenerated( dto.getFilesgenerated() );
        comparatorDashboard.setFilesworking( dto.getFilesworking() );
        comparatorDashboard.setAnalysed( dto.getAnalysed() );

        return comparatorDashboard;
    }
}

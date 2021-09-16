package net.apmoller.athena.microservices.comparatordashboard.mappers;


import net.apmoller.athena.microservices.comparatordashboard.dto.ComparatorDashboardDto;
import net.apmoller.athena.microservices.comparatordashboard.models.ComparatorDashboard;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
// sample Dto To Model Mapper
public interface ContractRateMapper {

//    @Mappings({
//            @Mapping(target = "callingClientId", ignore = true)
//    })
    ComparatorDashboardDto modelToDto(ComparatorDashboard model);

//    @Mappings({
//            @Mapping(target = "rateId", ignore = true),
//            @Mapping(target = "creationDate", ignore = true)
//    })
    ComparatorDashboard DtoToModel(ComparatorDashboardDto dto);

}

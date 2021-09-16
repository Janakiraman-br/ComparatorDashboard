package net.apmoller.athena.microservices.comparatordashboard.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import net.apmoller.athena.microservices.comparatordashboard.dto.ComparatorDashboardDto;
import net.apmoller.athena.microservices.comparatordashboard.models.ComparatorDashboard;
import net.bytebuddy.jar.asm.TypeReference;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;


/**
 * This is an interface for  contract.rates methods
 */
@Service
@Slf4j
public class ComparatorDashboardServiceImpl implements ComparatorDashboardService {
    @Override
    public ComparatorDashboard getresponse(String date) throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        ComparatorDashboard comparatorDashboard=mapper.readValue(new File("../resources/response.json"),ComparatorDashboard.class);
        return comparatorDashboard;
    }

//public List<ComparatorDashboard> getresponse()
//{
//    ObjectMapper mapper=new ObjectMapper();
//    try {
//        InputStream inputStream=new FileInputStream(new File("../resources/response.json"));
//        TypeReference <List<ComparatorDashboard>> typeReference= new TypeReference<List<ComparatorDashboard>>(){};
//        List<ComparatorDashboard> comparatorDashboards=mapper.readValue(inputStream,typeReference);
//    } catch (FileNotFoundException e) {
//        e.printStackTrace();
//    }
//    for (ComparatorDashboard p:ComparatorDashboard)
//    {
//        System.out.println("");
//    }
//    return null;
//
//}


//
//    final ContractRateRepository repository;
//    final ContractRateMapper mapper;
//
//    @Autowired
//    public ComparatorDashboardServiceImpl(ContractRateRepository repository,ContractRateMapper mapper){
//        this.repository=repository;
//        this.mapper=mapper;
//    }
//
//
//    @Override
//    public Mono<ContractRateDto> getContractRate(String rateCode){
//        return repository.getContractRateByCode(rateCode).map(r->mapper.modelToDto(r));
//    }
//
//    @Override
//    public Mono<ContractRateDto> createContractRate(ContractRateDto contractRateDto){
//        ContractRate contractRate=mapper.DtoToModel(contractRateDto);
//        return repository.save(contractRate).map(r->mapper.modelToDto(r));
//    }

}

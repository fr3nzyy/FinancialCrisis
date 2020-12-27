//package com.fr3nzy.financial_crisis;
//
//import com.fr3nzy.financial_crisis.config.GSPCMapper;
//import com.fr3nzy.financial_crisis.dao.GSPC;
//import org.junit.jupiter.api.Test;
//import org.mapstruct.factory.Mappers;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class MapperTest {
//    private GSPCMapper mapper
//            = Mappers.getMapper(GSPCMapper.class);
//    @Test
//    public void givenSourceToDestination__whenMaps__thenCorrect() {
//        GSPC simpleSource = new GSPC();
//        simpleSource.setClose(1L);
//        simpleSource.setHigh(2L);
//        GSPCModel destination = mapper.destinationToSource(simpleSource);
//
//        assertEquals(simpleSource.getClose(), destination.getClose());
//        assertEquals(simpleSource.getHigh(), destination.getHigh());
//    }
//}

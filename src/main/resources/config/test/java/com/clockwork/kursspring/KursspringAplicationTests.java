package com.clockwork.kursspring;

import com.clockwork.kursspring.domain.repository.DBKnightRepository;
import com.clockwork.kursspring.domain.Knight;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class KursspringAplicationTests {

    @Autowired
    Knight knight;

    @Autowired
    DBKnightRepository castle;

    @Test
    public void contextLoads(){

    }

    @Test
    public void castleToStringMessage(){
        String except = "Znajduje się tu zamek o nazwie Castle Black. Zamieszkały przez Rycerza Lancelot";
        //Castle castle = new Castle(knight); // jeżeli jest new() to jest tworzony poza kontekstem Springowym
        assertEquals(except,castle.toString());
    }

}

package com.clockwork.kursspring.config;

import com.clockwork.kursspring.domain.repository.DBKnightRepository;
import com.clockwork.kursspring.domain.repository.InMemoryRepository;
import com.clockwork.kursspring.domain.repository.KnightRepository;
import org.springframework.context.annotation.*;

@Configuration
public class MainConfig {

    @Bean(name = "inMemoryRepository")
    @Profile("dev")
    public KnightRepository createInMemoryRepo(){
        KnightRepository repo = new InMemoryRepository();
        return repo;
    }

    @Bean(name = "DBKnightRepository")
    @Profile("prod")
    public KnightRepository createDBRepo() {
        KnightRepository repo = new DBKnightRepository();
        return repo;
    }

}
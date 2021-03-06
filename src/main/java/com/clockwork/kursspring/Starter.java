package com.clockwork.kursspring;
import com.clockwork.kursspring.domain.repository.DBKnightRepository;
import com.clockwork.kursspring.domain.repository.KnightRepository;
import com.clockwork.kursspring.domain.repository.QuestRepository;
import com.clockwork.kursspring.services.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Starter implements CommandLineRunner {

    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;

    @Autowired
    QuestService questService;

    @Override
    public void run(String... args) throws Exception {

        questRepository.createRandomQuest();
        questRepository.createRandomQuest();

    }



}

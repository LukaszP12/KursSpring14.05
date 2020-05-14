package com.clockwork.kursspring.services;

import com.clockwork.kursspring.domain.Quest;
import com.clockwork.kursspring.domain.repository.DBKnightRepository;
import com.clockwork.kursspring.domain.repository.InMemoryRepository;
import com.clockwork.kursspring.domain.repository.KnightRepository;
import com.clockwork.kursspring.domain.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuestService {

    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;

    final static Random rand = new Random();

    public void assignRandomQuest(String knightName){
        List<Quest> allQuest = questRepository.getAll();
        Quest randomQuest = allQuest.get(rand.nextInt(allQuest.size()));
        knightRepository.getKnight(knightName).setQuest(randomQuest);
        questRepository.deleteQuest(randomQuest);
    }

}

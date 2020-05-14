package com.clockwork.kursspring.domain.repository;

import com.clockwork.kursspring.domain.Quest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class QuestRepository {

    Random random = new Random();

    List<Quest> questList = new ArrayList<>();

    public void createQuest(String description){
        questList.add(new Quest(description));
    }

    public List<Quest> getAll(){
        return questList;
    }

    public void deleteQuest(Quest quest){
        questList.remove(quest);
    }


    @PostConstruct
    public void init(){
        createQuest("Uratuj księżniczkę");
        createQuest("Wez udział w turnieju");
    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "questList=" + questList +
                '}';
    }

    // @Scheduled(fixedDelay = 1000,initialDelay = 3000) - metoda odpala się i czeka na zakończenie, initialDelay - po jakim czasie metoda ma zacząć się wykonywać
    @Scheduled(fixedDelayString = "${questCreationDelay}") // fixedRate - jest liczona od momentu uruchomienia
    public void createRandomQuest(){
        List<String> descriptions = new ArrayList<>();

        descriptions.add("Uratuj księżniczkę");
        descriptions.add("Wez udział w turnieju");
        descriptions.add("Zabij bande goblinow");
        descriptions.add("Zabij smoka");

        String description = descriptions.get(random.nextInt(descriptions.size()));
        createQuest(description);

    }

}

package com.clockwork.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Knight {

    private String name;

    private int age;

    private Quest quest;

    public Knight(){
        this.name = "Lancelot";
        this.age = 29;
    }

//    public Knight(String name, int age,Quest quest) {
        //this.name = name;
        //this.age = age;
        //this.quest = quest;
  //  }

    public Knight(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Quest getQuest() {
        return quest;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   public void setQuest(Quest quest) {
        System.out.println("Stawiam zadanie dla rycerza. ");
        this.quest = quest;
    }

    @Override
    public String toString() {
        return "Rycerz o imieniu " + name + "( " + age + "). Zadanie:  " + quest;
    }

}

package com.theironyard.novauc;

/**
 * Created by octavio on 2/7/17.
 */
public class PoliticalParty {
    String affiliation;
    String candidate;
    int age;
    boolean american;
    boolean arrested;

    public PoliticalParty(String affiliation, String candidate, int age, boolean american, boolean arrested) {
        this.affiliation = affiliation;
        this.candidate = candidate;
        this.age = age;
        this.american = american;
        this.arrested = arrested;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age < 18) {
            System.out.println("You are not allowed to vote yet");
        }
    }

    public boolean isAmerican() {
        return american;
    }

    public void setAmerican(boolean american) { this.american = american; }

    public boolean isArrested() {
        return arrested;
    }

    public void setArrested(boolean arrested) {
        this.arrested = arrested;
    }
}


package com.barath.football.app.entity;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * Created by barath on 18/03/18.
 */
@Document(collection = "matches'")
public class Match {

    private Long matchId;


    private Date matchDate;

    @DBRef
    private Team homeTeam;

    @DBRef
    private Team awayteam;

    @DBRef
    private Referee referee;

    private Goal goals;

    private String matchResult;

    private Shot shots;

    private List<Card> cards;

    public Match() {
    }

    @PersistenceConstructor
    public Match(Long matchId, Date matchDate, Team homeTeam, Team awayteam, Referee referee, Goal goals, String matchResult, Shot shots, List<Card> cards) {
        this.matchId = matchId;
        this.matchDate = matchDate;
        this.homeTeam = homeTeam;
        this.awayteam = awayteam;
        this.referee = referee;
        this.goals = goals;
        this.matchResult = matchResult;
        this.shots = shots;
        this.cards = cards;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayteam() {
        return awayteam;
    }

    public void setAwayteam(Team awayteam) {
        this.awayteam = awayteam;
    }

    public Referee getReferee() {
        return referee;
    }

    public void setReferee(Referee referee) {
        this.referee = referee;
    }

    public Goal getGoals() {
        return goals;
    }

    public void setGoals(Goal goals) {
        this.goals = goals;
    }

    public String getMatchResult() {
        return matchResult;
    }

    public void setMatchResult(String matchResult) {
        this.matchResult = matchResult;
    }

    public Shot getShots() {
        return shots;
    }

    public void setShots(Shot shots) {
        this.shots = shots;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Match{" +
                "matchId=" + matchId +
                ", matchDate=" + matchDate +
                ", homeTeam=" + homeTeam +
                ", awayteam=" + awayteam +
                ", referee=" + referee +
                ", goals=" + goals +
                ", matchResult='" + matchResult + '\'' +
                ", shots=" + shots +
                ", cards=" + cards +
                '}';
    }
}

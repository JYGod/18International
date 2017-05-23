package com.yb7001.web.myproject.bean;

import java.util.List;


public class SaveBet {
    private String lottery;
    private String drawNumber;
    private List<bets>bets;

    public List<SaveBet.bets> getBets() {
        return bets;
    }

    public void setBets(List<SaveBet.bets> bets) {
        this.bets = bets;
    }

    public String getDrawNumber() {
        return drawNumber;
    }

    public void setDrawNumber(String drawNumber) {
        this.drawNumber = drawNumber;
    }

    public String getLottery() {
        return lottery;
    }

    public void setLottery(String lottery) {
        this.lottery = lottery;
    }

    public static class bets{
        private String game;
        private String contents;
        private String amount;
        private String odds;

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }

        public String getGame() {
            return game;
        }

        public void setGame(String game) {
            this.game = game;
        }

        public String getOdds() {
            return odds;
        }

        public void setOdds(String odds) {
            this.odds = odds;
        }
    }

}

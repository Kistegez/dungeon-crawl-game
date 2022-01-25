package com.codecool.dungeoncrawl.model;

import com.codecool.dungeoncrawl.logic.actors.Player;

public class PlayerModel extends BaseModel {
    private String playerName;
    private int hp;
    private int x;
    private int y;
    private int strength;

    public PlayerModel(String playerName, int hp, int x, int y) {
        this.playerName = playerName;
        this.x = x;
        this.y = y;
        this.hp = hp;
    }

    public PlayerModel(Player player) {
        this.playerName = player.getTileName();
        this.x = player.getX();
        this.y = player.getY();
        this.hp = player.getHealth();
        this.strength = player.getStrength();

    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

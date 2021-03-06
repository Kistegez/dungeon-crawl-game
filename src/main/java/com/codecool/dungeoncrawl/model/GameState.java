package com.codecool.dungeoncrawl.model;

import com.codecool.dungeoncrawl.logic.CellType;
import com.codecool.dungeoncrawl.logic.MapLoader;
import com.codecool.dungeoncrawl.logic.actors.Player;

import java.util.ArrayList;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

public class GameState extends BaseModel {
    private Date savedAt;
    private String currentMap;
    private List<String> discoveredMaps = new ArrayList<>();
    private PlayerModel player;
    private int gameStateId;

    public GameState(String currentMap, PlayerModel player) {
        this.currentMap = currentMap;
        this.savedAt = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        this.player = player;
    }

    public GameState(String currentMap) {
        this.currentMap = currentMap;

    }

    public Date getSavedAt() {
        return savedAt;
    }

    public void setSavedAt(Date savedAt) {
        this.savedAt = savedAt;
    }

    public String getCurrentMap() {
        return currentMap;
    }

    public void setCurrentMap(String currentMap) {
        this.currentMap = currentMap;
    }

    public List<String> getDiscoveredMaps() {
        return discoveredMaps;
    }

    public void addDiscoveredMap(String map) {
        this.discoveredMaps.add(map);
    }

    public PlayerModel getPlayer() {
        return player;
    }

    public void setPlayer(PlayerModel player) {
        this.player = player;
    }

    public void setGameStateId(int gameStateId) {
        this.gameStateId = gameStateId;
    }

}

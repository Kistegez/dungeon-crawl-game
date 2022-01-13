package com.codecool.dungeoncrawl.logic.actors;

import com.codecool.dungeoncrawl.logic.Cell;
import com.codecool.dungeoncrawl.logic.CellType;
import java.util.Random;


public class Skeleton extends Enemy {

    private static final Random rand = new Random();

    public Skeleton(Cell cell) {
        super(cell);
    }

    @Override
    public String getTileName() {
        return "skeleton";
    }

    @Override
    public void move() {
        Cell randomMove = getRandomMove();
        Actor player = randomMove.getActor();
        if (checkEmptyField(randomMove.getType())){
            if (checkAttack(player)){
                attack(player);
            }else {
                move(randomMove);
            }
        }
    }

    private Cell getRandomMove() {
        boolean movingPossible = true;
        Cell randomMove = null;
        while (movingPossible){
            int randomX = rand.nextInt(-1,2);
            int randomY = rand.nextInt(-1,2);
            Cell skeletonCell = this.getCell();
            randomMove = skeletonCell.getNeighbor(randomX, randomY);
            movingPossible = moveValidation(randomMove.getType());
        }
        return randomMove;
    }

    private boolean moveValidation(CellType typeOfTile){;
        if (checkEmptyField(typeOfTile)) {
            return false;
        }else {
            return true;
        }
    }
}

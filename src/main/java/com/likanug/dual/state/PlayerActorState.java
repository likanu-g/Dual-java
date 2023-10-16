package com.likanug.dual.state;

import com.likanug.dual.App;
import com.likanug.dual.actor.AbstractPlayerActor;
import com.likanug.dual.actor.PlayerActor;

import static processing.core.PApplet.atan2;

public abstract class PlayerActorState {

    protected App app;

    public PlayerActorState(App app) {
        this.app = app;
    }

    public abstract PlayerActorState entryState(PlayerActor parentActor);

    public abstract void act(PlayerActor parentActor);

    public abstract void displayEffect(PlayerActor parentActor);


    public float getEnemyPlayerActorAngle(PlayerActor parentActor) {
        final AbstractPlayerActor enemyPlayer = parentActor.group.enemyGroup.player;
        return atan2(enemyPlayer.yPosition - parentActor.yPosition, enemyPlayer.xPosition - parentActor.xPosition);
    }

    public boolean isDamaged() {
        return false;
    }

    public boolean isDrawingLongBow() {
        return false;
    }

    public boolean hasCompletedLongBowCharge(PlayerActor parentActor) {
        return false;
    }

}

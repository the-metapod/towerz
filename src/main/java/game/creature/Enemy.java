package game.creature;

import engine.events.EventEmitter;
import engine.graphics.animations.Animation;
import game.world.GameGeometry;

import java.util.Map;

public class Enemy extends AbstractCreature {

    public Enemy(EventEmitter eventEmitter,
                 GameGeometry gameGeometry,
                 Animation animations,
                 Health health,
                 int speed,
                 int damage) {
        super(eventEmitter, gameGeometry, createAnimations(animations), CreatureType.ATTACKER, health, speed, damage);
    }

    private static Map<CreatureState, Animation> createAnimations(Animation animation) {
        return Map.of(
                CreatureState.WALKING, animation,
                CreatureState.FIGHTING, animation);
    }
}

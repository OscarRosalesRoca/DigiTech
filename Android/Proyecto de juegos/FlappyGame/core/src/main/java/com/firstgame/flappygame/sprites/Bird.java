package com.firstgame.flappygame.sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

public class Bird {
    private static final int GRAVITY = -15;
    private static final int MOVEMENT = 100;

    private Vector3 position;
    private Vector3 velocity;
    private Rectangle bounds;

    private Texture bird;
    private Animation birdAnimation;
    private Sound flap;

    public Bird (int x, int y){
        position = new Vector3(x, y, 0);
        velocity = new Vector3(0, 0, 0);
        bird = new Texture("yellowbird-midflap.png");
        bounds = new Rectangle(x, y, bird.getWidth(), bird.getHeight());
        flap = Gdx.audio.newSound(Gdx.files.internal("wing.ogg"));

        Texture bird1 = new Texture("yellowbird-upflap.png");
        Texture bird2 = new Texture("yellowbird-midflap.png");
        Texture bird3 = new Texture("yellowbird-downflap.png");

        TextureRegion[] birdFrames = new TextureRegion[3];
        birdFrames[0] = new TextureRegion(bird1);
        birdFrames[1] = new TextureRegion(bird2);
        birdFrames[2] = new TextureRegion(bird3);

        birdAnimation = new Animation(birdFrames, 0.5f);
    }

    public void update(float dt){
        if (position.y > 0){
            velocity.add(0, GRAVITY, 0);
        }

        velocity.scl(dt);
        position.add(MOVEMENT * dt, velocity.y, 0);

        if (position.y < 0){
            position.y = 0;
        }

        velocity.scl(1/dt);
        bounds.setPosition(position.x, position.y);

        birdAnimation.update(dt);
    }

    public Texture getBird() {
        return bird;
    }

    public Vector3 getPosition() {
        return position;
    }

    public void jump(){
        velocity.y = 250;
        flap.play(0.5f);
    }

    public Rectangle getBounds(){
        return bounds;
    }

    public void dispose(){
        bird.dispose();
        flap.dispose();
    }

    public Animation getAnimation() {
        return birdAnimation;
    }
}

package com.firstgame.flappygame.sprites;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Animation {

    private TextureRegion[] frames;
    private float maxFrameTime;
    private float currentFrameTime;
    private int frameCount;
    private int frame;

    public Animation(TextureRegion[] frames, float cycleTime) {
        this.frames = frames;
        this.frameCount = frames.length;
        this.maxFrameTime = cycleTime / frameCount;
        this.frame = 0;
    }

    public void update(float dt) {
        currentFrameTime += dt;
        if (currentFrameTime > maxFrameTime) {
            frame++;
            currentFrameTime = 0;
        }

        if (frame >= frameCount) {
            frame = 0;
        }
    }

    public TextureRegion getFrame() {
        return frames[frame];
    }
}

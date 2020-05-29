package com.khoitran.flappybird;

import com.badlogic.gdx.graphics.Texture;

public class Pipe {
    private float topPipeY;
    private float bottomPipeY;
    private float pipeX;
    private Texture topTexture;
    private Texture bottomTexture;
    private float yOffset;


    public Pipe(float topPipeY, float bottomPipeY, float pipeX, float yOffset, Texture topTexture, Texture bottomTexture) {
        this.topPipeY = topPipeY;
        this.bottomPipeY = bottomPipeY;
        this.pipeX = pipeX;
        this.topTexture = topTexture;
        this.bottomTexture = bottomTexture;
    }

    public float getTopPipeY() {
        return topPipeY;
    }

    public void setTopPipeY(float topPipeY) {
        this.topPipeY = topPipeY;
    }

    public float getBottomPipeY() {
        return bottomPipeY;
    }

    public void setBottomPipeY(float bottomPipeY) {
        this.bottomPipeY = bottomPipeY;
    }

    public float getPipeX() {
        return pipeX;
    }

    public void setPipeX(float pipeX) {
        this.pipeX = pipeX;
    }

    public Texture getTopTexture() {
        return topTexture;
    }

    public void setTopTexture(Texture topTexture) {
        this.topTexture = topTexture;
    }

    public Texture getBottomTexture() {
        return bottomTexture;
    }

    public void setBottomTexture(Texture bottomTexture) {
        this.bottomTexture = bottomTexture;
    }

    public float getyOffset() {
        return yOffset;
    }

    public void setyOffset(float yOffset) {
        this.yOffset = yOffset;
    }

}

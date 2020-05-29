package com.khoitran.flappybird;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Random;

public class FlappyBird extends ApplicationAdapter {
    private final String TAG = "FLAPPY BIRD";
    public SpriteBatch batch;
    public Texture background;
    public  Texture[] bird;
    public int birdFlapped = 0;
    public float birdY;
    public float birdX;
    public boolean gameState = false;
    public float velocity = 0;
    public float gravity = 1.8f;
    public Texture topTube;
    public Texture bottomTube;
    public float tubeGap = 420;
    private int buffer = 100;
    private Random randomNumber;


    @Override
    public void create () {
        batch = new SpriteBatch();
        background = new Texture("bg.png");

        bird = new Texture[2];
        bird[0] = new Texture("bird.png");
        bird[1] = new Texture("bird2.png");
        birdX = (Gdx.graphics.getWidth() - bird[birdFlapped].getWidth()) / 2;
        birdY = (Gdx.graphics.getHeight() - bird[0].getHeight()) / 2;

        topTube = new Texture("toptube.png");
        bottomTube = new Texture("bottomtube.png");

        randomNumber = new Random();

        Pipe pipe1 = new Pipe(0, 0, 0, 0, topTube, bottomTube);
    }

    @Override
    public void render () {
        batch.begin();
        batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(topTube, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() - buffer);
        batch.draw(bottomTube, Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() - tubeGap - 400 - bottomTube.getHeight());

        batch.draw(bird[birdFlapped], birdX, birdY);
        birdFlapped = 0;

        if(gameState){

            if(birdY > 0 || velocity < 0) { //gravity applies until bottom of the screen
                velocity += gravity;
                birdY -= velocity;
            }
        }

        if(Gdx.input.justTouched()) {
            birdFlapped = 1;
            velocity = - 30;
            gameState = true;
            System.out.println(Math.abs(randomNumber.nextFloat()) * (Gdx.graphics.getHeight() - (buffer * buffer + tubeGap)) + buffer);
        }


        batch.end();

    }

}

package codeBro.swing.aps.catsInSpace.entity;

import java.awt.*;

public abstract class FlyingObject {
    private Image image;
    private int posX;
    private int posY;
    private int speedX;
    private int speedY;
    private int maxSpeedX;
    private int maxSpeedY;
    private int accelerationX;
    private int accelerationY;

    public FlyingObject () {
    }

    public FlyingObject(
            Image image, int posX, int posY, int speedX, int speedY, int maxSpeedX, int maxSpeedY,
            int accelerationX, int accelerationY) {
        this.image = image;
        this.posX = posX;
        this.posY = posY;
        this.speedX = speedX;
        this.speedY = speedY;
        this.maxSpeedX = maxSpeedX;
        this.maxSpeedY = maxSpeedY;
        this.accelerationX = accelerationX;
        this.accelerationY = accelerationY;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getSpeedX() {
        return speedX;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }

    public int getMaxSpeedX() {
        return maxSpeedX;
    }

    public void setMaxSpeedX(int maxSpeedX) {
        this.maxSpeedX = maxSpeedX;
    }

    public int getMaxSpeedY() {
        return maxSpeedY;
    }

    public void setMaxSpeedY(int maxSpeedY) {
        this.maxSpeedY = maxSpeedY;
    }

    public int getAccelerationX() {
        return accelerationX;
    }

    public void setAccelerationX(int accelerationX) {
        this.accelerationX = accelerationX;
    }

    public int getAccelerationY() {
        return accelerationY;
    }

    public void setAccelerationY(int accelerationY) {
        this.accelerationY = accelerationY;
    }
}

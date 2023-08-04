package main;

public class Chandrayan{

    private int xCoord, yCoord, zCoord;
    private char direction;
    public Chandrayan(){
        this.xCoord = 0;
        this.yCoord = 0;
        this.zCoord = 0;
        this.direction = ' ';
    }
    public Chandrayan(int x, int y, int z, char initialDirection){
        this.xCoord = x;
        this.yCoord = y;
        this.zCoord = z;
        this.direction = initialDirection;
    }
    public String finalDirection(char[] commands){
        String finalLocation = "(";

        for (char command : commands) {
            switch (command) {
                case 'f':
                    goForward();
                    break;
                case 'r':
                    goRight();
                    break;
                case 'b':
                    goBackward();
                    break;
                case 'l':
                    goLeft();
                    break;
                case 'u':
                    goUp();
                    break;
                case 'd':
                    goDown();
                    break;
            }
        }
        
        finalLocation += Integer.toString(xCoord) + "," + Integer.toString(yCoord) + "," + Integer.toString(zCoord) + "," + direction + ")";

        return finalLocation;
    }

    private void goForward() {
        switch (direction) {
            case 'N':
                yCoord++;
                break;
            case 'S':
                yCoord--;
                break;
            case 'E':
                xCoord++;
                break;
            case 'W':
                xCoord--;
                break;
            case 'U':
                zCoord++;
                break;
            case 'D':
                zCoord--;
                break;
        }
    }

    private void goRight() {
        switch (direction) {
            case 'N':
                direction = 'E';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'E':
                direction = 'S';
                break;
            case 'W':
                direction = 'N';
                break;
            case 'U':
                direction = 'W';
                break;
            case 'D':
                direction = 'E';
                break;
        }
    }

    private void goBackward() {
        switch (direction) {
            case 'N':
                yCoord--;
                break;
            case 'S':
                yCoord++;
                break;
            case 'E':
                xCoord--;
                break;
            case 'W':
                xCoord++;
                break;
            case 'U':
                zCoord--;
                break;
            case 'D':
                zCoord++;
                break;
        }
    }

    private void goLeft() {
        switch (direction) {
            case 'N':
                direction = 'W';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'E':
                direction = 'N';
                break;
            case 'W':
                direction = 'S';
                break;
            case 'U':
                direction = 'W';
                break;
            case 'D':
                direction = 'E';
                break;
        }
    }

    private void goUp() {
        switch (direction) {
            case 'N':
                direction = 'U';
                break;
            case 'S':
                direction = 'D';
                break;
            case 'E':
                direction = 'U';
                break;
            case 'W':
                direction = 'U';
                break;
            case 'U':
                break;
            case 'D':
                break;
        }
    }

    private void goDown() {
        switch (direction) {
            case 'N':
                direction = 'D';
                break;
            case 'S':
                direction = 'U';
                break;
            case 'E':
                direction = 'D';
                break;
            case 'W':
                direction = 'D';
                break;
            case 'U':
                break;
            case 'D':
                break;
        }
    }
}

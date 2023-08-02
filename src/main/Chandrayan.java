package main;

public class Chandrayan{

    private int x_coord, y_coord, z_coord;
    private char direction;
    public Chandrayan(){
        this.x_coord = 0;
        this.y_coord = 0;
        this.z_coord = 0;
        this.direction = ' ';
    }
    public Chandrayan(int x, int y, int z, char initialDirection){
        this.x_coord = x;
        this.y_coord = y;
        this.z_coord = z;
        this.direction = initialDirection;
    }
    public String finalDirection(char[] commands){
        String finalLocation = "(";

        goForward();
        
        finalLocation += Integer.toString(x_coord) + "," + Integer.toString(y_coord) + "," + Integer.toString(z_coord) + "," + direction + ")";

        return finalLocation;
    }

    private void goForward() {
        switch (direction) {
            case 'N':
                y_coord++;
                break;
            case 'S':
                y_coord--;
                break;
            case 'E':
                x_coord++;
                break;
            case 'W':
                x_coord--;
                break;
            case 'U':
                z_coord++;
                break;
            case 'D':
                z_coord--;
                break;
        }
    }
}

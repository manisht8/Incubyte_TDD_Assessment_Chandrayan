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
    public void finalDirection(){
        System.out.println('N');
    }
}

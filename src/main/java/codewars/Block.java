package codewars;

public class Block {
    private int width;
    private int length;
    private int height;

    public Block(int[] parameters){
        this.width = parameters[0];
        this.length = parameters[1];
        this.height = parameters[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume(){
        return width * length * height;
    }

    public int getSurfaceArea(){
        return 2 * (width * length + width * height + length * height);
    }
}

package codewars;

/*Codewars Task2
        Write a class Block that creates a block (Duh..)
        ##Requirements
        The constructor should take an array as an argument, this will contain 3 integers
        of the form [width, length, height] from which the Block should be created.
        Define these methods:
        `getWidth()` return the width of the `Block`
        `getLength()` return the length of the `Block`
        `getHeight()` return the height of the `Block`
        `getVolume()` return the volume of the `Block`
        `getSurfaceArea()` return the surface area of the `Block`*/

public class Block {
    private final int width;
    private final int length;
    private final int height;

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

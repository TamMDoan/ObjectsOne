package object1;

public class Chair {
    private String material;
    private String color;
    private int legs;

    private int height;

    public Chair(String material, String color, int legs, int height) {
        this.material = material;
        this.color = color;
        this.legs = legs;
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public int getHeight(){
        return this.height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setHeight(int height){
        this.height = height;
    }
}

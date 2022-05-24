package harshadeepthi.sample;

public abstract class Rectangle implements Shape {
    public int l;
    public int w;
    public Rectangle(int l,int w){
        this.l=l;
        this.w=w;
    }
    public void draw(){
        System.out.println("Rectangle has been draw");
    }
    public int area(int l, int w){
        return l*w;
    }
}


package harshadeepthi.sample;

import harshadeepthi.interfaceex.Shape;

class Rectangle implements Shape {
    int l;
    int w;
    Rectangle(int l,int w){
        this.l=l;
        this.w=w;
    }
    public void draw(){
        System.out.println("Rectangle has been draw");
    }
    public int area(){
        return l*w;
    }
}


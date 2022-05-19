package rajat.sample.wrapperclass;

import java.util.Scanner;

public class WrapperClass {
   private byte a = 10;
    private short b = 20;
    private int c = 30;
    private long d = 400;
    private float e = 2.7f;
    private double f = 24536.865;
    private char ch = 'c';
    private boolean g = true;

    private Byte aByte = new Byte(a);
    private Short aShort = new Short(b);
    private Integer integer = new Integer(c);
    private Long aLong = new Long(d);
    private Float aFloat = new Float(e);
    private Double aDouble = new Double(f);
    private Character character = new Character(ch);
    private Boolean aBoolean = new Boolean(false);

    public byte getA() {
        return a;
    }

    public void setA(byte a) {
        this.a = a;
    }

    public short getB() {
        return b;
    }

    public void setB(short b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public long getD() {
        return d;
    }

    public void setD(long d) {
        this.d = d;
    }

    public float getE() {
        return e;
    }

    public void setE(float e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public boolean isG() {
        return g;
    }

    public void setG(boolean g) {
        this.g = g;
    }

    public Byte getaByte() {
        return aByte;
    }

    public void setaByte(Byte aByte) {
        this.aByte = aByte;
    }

    public Short getaShort() {
        return aShort;
    }

    public void setaShort(Short aShort) {
        this.aShort = aShort;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public Long getaLong() {
        return aLong;
    }

    public void setaLong(Long aLong) {
        this.aLong = aLong;
    }

    public Float getaFloat() {
        return aFloat;
    }

    public void setaFloat(Float aFloat) {
        this.aFloat = aFloat;
    }

    public Double getaDouble() {
        return aDouble;
    }

    public void setaDouble(Double aDouble) {
        this.aDouble = aDouble;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Boolean getaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public void usingScanner(){
        String str = "1234";
        Integer integer1 = new Integer(str);
        System.out.println(integer1+10000);

    }




}

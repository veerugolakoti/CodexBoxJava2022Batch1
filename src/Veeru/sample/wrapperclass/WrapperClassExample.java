package Veeru.sample.wrapperclass;

public class WrapperClassExample {
    private   int a = 10;
    private float b = 1.3f;
    private char c = 'C';
    private double d = 1.23;
    private boolean flag = true;
    private long l = 123456789;
    private short s = 9000;
    private byte bi = 100;

    private Integer integer = new Integer(a);

    private Float floatValue = new Float(b);
    private Character aChar = new Character(c);
    private Double aDouble = new Double(d);
    private Boolean aBoolean = new Boolean(flag);
    private Long aLong = new Long(l);
    private Short aShort = new Short(s);
    private Byte aByte = new Byte(bi);

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public long getL() {
        return l;
    }

    public void setL(long l) {
        this.l = l;
    }

    public short getS() {
        return s;
    }

    public void setS(short s) {
        this.s = s;
    }

    public byte getBi() {
        return bi;
    }

    public void setBi(byte bi) {
        this.bi = bi;
    }

    public Integer getInteger() {


        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public Float getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(Float floatValue) {
        this.floatValue = floatValue;
    }

    public Character getaChar() {
        return aChar;
    }

    public void setaChar(Character aChar) {
        this.aChar = aChar;
    }

    public Double getaDouble() {
        return aDouble;
    }

    public void setaDouble(Double aDouble) {
        this.aDouble = aDouble;
    }

    public Boolean getaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public Long getaLong() {
        return aLong;
    }

    public void setaLong(Long aLong) {
        this.aLong = aLong;
    }

    public Short getaShort() {
        return aShort;
    }

    public void setaShort(Short aShort) {
        this.aShort = aShort;
    }

    public Byte getaByte() {
        return aByte;
    }

    public void setaByte(Byte aByte) {
        this.aByte = aByte;
    }
}

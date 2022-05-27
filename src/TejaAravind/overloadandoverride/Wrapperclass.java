package TejaAravind.overloadandoverride;

public class Wrapperclass {
    private Integer wint;
    private int i;
    private Double dou = new Double(i);
    private float afloat= 8.3f;
    private Float Af = new Float(afloat);
    private byte byt = 54;
    private Byte aByte = new Byte(byt);
    public Wrapperclass (Integer i,Float af, byte byt){
        this.i= i;
        this.afloat = af;
        this.byt = byt;

    }

    public Integer getWint() {
        return wint;
    }

    public int getI() {
        return i;
    }

    public Double getDou() {
        return dou;
    }

    public float getAfloat() {
        return afloat;
    }

    public Float getAf() {
        return Af;
    }

    public byte getByt() {
        return byt;
    }

    public Byte getaByte() {
        return aByte;
    }
}


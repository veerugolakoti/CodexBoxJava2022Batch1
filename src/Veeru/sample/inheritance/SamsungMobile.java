package Veeru.sample.inheritance;

public class SamsungMobile extends  Mobile {
    private float pixelSize;

    @Override
    public Double getPrice() {
        return super.getPrice();
    }

    public float getPixelSize() {
        return pixelSize;
    }

    @Override
    public void setPixelSize(float pixelSize) {
        this.pixelSize = pixelSize;
    }


}

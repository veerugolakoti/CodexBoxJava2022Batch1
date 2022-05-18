package Veeru.sample.inheritance;

public class AppleMobile extends Mobile {

    private Boolean isSecure;

    public Boolean getSecure() {
        return isSecure;
    }

    public void setSecure(Boolean secure) {
        isSecure = secure;
    }

    @Override
    public void setPixelSize(float pixel) {
    }

    @Override
    public float getPixelSize() {
       return 30.5f;
    }
}

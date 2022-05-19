package rajat.sample.inheritance;

public class Laptop {
    private String brandName;
    private Double price;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public float getGhz() {
        return ghz;
    }

    public void setGhz(float ghz) {
        this.ghz = ghz;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    private  int ram;
    private float ghz;
    private String storage;

}

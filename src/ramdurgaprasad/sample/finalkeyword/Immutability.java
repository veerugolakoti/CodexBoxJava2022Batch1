package ramdurgaprasad.sample.finalkeyword;

public final class Immutability {
   private final String crickter;
   private final int jersy;
  private final String centuries;
   private final String birth;

    public String getCenturies() {
        return centuries;
    }

    public Immutability(String crickter, int jersy, String centuries, String birth, String category) {
        this.crickter = crickter;
        this.jersy = jersy;
        this.centuries = centuries;
        this.birth = birth;
        this.category = category;
    }

    private final String category;

    public String getCrickter() {
        return crickter;
    }

    public int getJersy() {
        return jersy;
    }



    public String getBirth() {
        return birth;
    }

    public String getCategory() {
        return category;
    }


}

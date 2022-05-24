package rajat.sample.strings;

public class StringBuilderApp {
    public void getStringBuilder() {
        String str = "Write String Program";
        StringBuilder stringBuilder = new StringBuilder(str);
        //toString()
        System.out.println(stringBuilder.toString());
        //append()
        System.out.println(stringBuilder.append("in java"));
        //length|()
        System.out.println(stringBuilder.length());
        //delete()
        System.out.println(stringBuilder.delete(4, 7));
        //indexOf()
        System.out.println(stringBuilder.indexOf("P"));
        //deleteCharAt()
        System.out.println(stringBuilder.deleteCharAt(10));
        //insert()
        System.out.println(stringBuilder.insert(10, 'P'));
        //capacity()
        System.out.println(stringBuilder.capacity());
        //hashcode()
        System.out.println(stringBuilder.hashCode());
        //replace()
        System.out.println(stringBuilder.replace(20, 23, "Language"));
        //charAt
        System.out.println(stringBuilder.charAt(10));
        //subString()
        System.out.println(stringBuilder.substring(10));
        //getClass()
        System.out.println(stringBuilder.getClass());
        //lastIndexOf()
        System.out.println(stringBuilder.lastIndexOf("Language"));

    }
}

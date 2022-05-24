package rajat.sample.strings;

public class StringBufferApp {
    public void getStringBuffer() {
        String str = "Write String Program";
        StringBuffer stringBuffer = new StringBuffer(str);
        //toString()
        System.out.println(stringBuffer.toString());
        //append()
        System.out.println(stringBuffer.append(" "));
        System.out.println(stringBuffer.append("in java Language"));
        //length|()
        System.out.println("Length of the String::"+stringBuffer.length());
        //indexOf()
        System.out.println("Starting index of L::"+stringBuffer.indexOf("Language"));
        //lastIndexOf()
        System.out.println("Ending index of E::"+stringBuffer.lastIndexOf("e"));
        //delete()
        System.out.println("After Deleting String is::"+stringBuffer.delete(29,37));
//        System.out.println(stringBuffer);
        //insert()
        System.out.println(stringBuffer.lastIndexOf("a"));
        System.out.println("After inserting the String is "+stringBuffer.insert(28,'s'));
        //deleteCharAt()
        System.out.println("After deleting a Specific"+stringBuffer.deleteCharAt(28));
        //capacity()
        System.out.println("C"+stringBuffer.capacity());
        //hashcode()
        System.out.println(stringBuffer.hashCode());
        //replace()
        System.out.println(stringBuffer.append("Language"));
        System.out.println(stringBuffer.replace(29,36,"Object"));
        //charAt
        System.out.println(stringBuffer.charAt(10));
        //subString()
        System.out.println(stringBuffer.substring(29));
        //getClass()
        System.out.println(stringBuffer.getClass());
        //codePointCount()
        System.out.println(stringBuffer.codePointCount(10,19));
        //setCharAt()
        stringBuffer.setCharAt(6,'s');
        System.out.println(stringBuffer);
//        String strings= "my name is rajat i am rajat everyone call me rajat";
//        StringBuffer stringBuffer1=new StringBuffer(strings);
//        stringBuffer1.ind


    }
}

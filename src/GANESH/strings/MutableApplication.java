package GANESH.strings;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MutableApplication {
    public static void main(String[] args) {


StringBuffer sb = new StringBuffer("JADDU LEELA GANESH");
        System.out.println(sb);
        System.out.println(sb.hashCode());
        sb.append("RAJATH");
        System.out.println(sb);
        System.out.println(sb.hashCode());


    }

}

package GANESH.strings;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ImmutableApplication {
    public static void main(String[] args) {
        String s1 = "ganesh";
        System.out.println(s1.hashCode());
        s1 = "leela";
        System.out.println(s1.hashCode());
    }
}
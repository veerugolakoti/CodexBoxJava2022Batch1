package rajat.sample.main;

import rajat.sample.interfaces.ImplClass;
import rajat.sample.singleton.SingleTonClass;
import rajat.sample.immutablility.ImmutabilityClass;

public class MainClassOops {
    public static void main(String[] args) {
     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a color name::");
        String str =scanner.nextLine();
        System.out.println("Enter a topSpeed::");
        int speed= scanner.nextInt();
        MahindraCar mahindraCar=new MahindraCar(str,speed);
        mahindraCar.carEngine();
        mahindraCar.seatDesign();
        RollsRoyce rollsRoyce = new RollsRoyce();
        rollsRoyce.setMaxSpeed(540);
        rollsRoyce.setPrice(100000200);
        System.out.println("Max Speed of RollsRoyce is::"+rollsRoyce.getMaxSpeed());
        System.out.println("Price of RollsRoyce is::"+rollsRoyce.getPrice());

        rollsRoyce.carEngine();
        rollsRoyce.seatDesign();
        NanoCar nanoCar = new NanoCar();
        nanoCar.carEngine();
        nanoCar.seatDesign();

        BMW bmw = new BMW();
        bmw.carEngine();
        bmw.passValue(2300000);
        bmw.seatDesign();

        System.out.println("======================================");
        Addition ad= new Addition();
        System.out.println("Enter a value1::");
        int a = scanner.nextInt();
        System.out.println("Enter a value2");
        int b = scanner.nextInt();
        ad.setNum1(a);
        ad.setNum2(b);
        ad.addition();
        ad.multiplication();
        ad.division();
        ad.allOperation();*/
/*

        System.out.println("==========================================");
        System.out.println();
        System.out.println("====Staring Overloading Program======");
        Overloading overloading = new Overloading();
        overloading.operation(34);
        System.out.println("Two value are added::"+overloading.operation(23,55));
        System.out.println("Multiply two value::"+overloading.operation(23,7.5f));
        System.out.println("Two value are divided::"+overloading.operation(2344.423,5456.3656));
        System.out.println("================================");
        System.out.println();
        System.out.println("====Start Overriding Method Execution=======");
        System.out.println("****Using Parent Reference*****");
        ParentClass parentClass=new ChildClass();
        parentClass.add();
        parentClass.div();
//        parentClass.mul(); //u can not call child method using parent reference (but the method is not present in parent)
        System.out.println("***** Using child reference****");
        ChildClass childClass = new ChildClass();
        childClass.add();
        childClass.div();
        childClass.mul();
        System.out.println("======Override Program2===============");
        SBI sbi = new SBI();
        System.out.println("SBI RateOfInterest is::"+sbi.getRateOfInterest());
        BOB bob = new BOB();
        System.out.println("BOB RateOfIInterest is::"+bob.getRateOfInterest());
        ICICI icici = new ICICI();
        System.out.println("ICICI RateOfInterest is::"+icici.getRateOfInterest());
        BOI boi = new BOI();
        System.out.println("BOI RateOfInterest is::"+boi.getRateOfInterest());

        System.out.println("==============================================");
        System.out.println();
        System.out.println("==Interface Program Execution Start==");
        ImplClass implClass = new ImplClass();
        implClass.getName();
        implClass.operation();
        System.out.println("======================================");
        System.out.println();
        System.out.println("======SUPER and THIS KeyWord Program=============");
        ThisKeyWord thisKeyWord = new ThisKeyWord(56,98);
        thisKeyWord.getInStanceVariable();
        ThisKeyWord thisKeyWord1= new ThisKeyWord(34,98,7);
        thisKeyWord1.getVariable();
        //super
        System.out.println("=======super program========");
        SuperKeyWord superKeyWord = new SuperKeyWord();
        superKeyWord.getSuper();
        System.out.println("================================================");
        System.out.println("====WrapperClassObject==============");
        WrapperClass wrapperClass = new WrapperClass();
        System.out.println(wrapperClass.getA());
        System.out.println(wrapperClass.getB());
        System.out.println(wrapperClass.getC());
        System.out.println(wrapperClass.getCh());
        System.out.println(wrapperClass.getD());
        System.out.println(wrapperClass.getE());
        System.out.println(wrapperClass.getF());
        System.out.println(wrapperClass.isG());
        System.out.println(wrapperClass.getaBoolean());
        System.out.println(wrapperClass.getaByte());
        System.out.println(wrapperClass.getaFloat());
        System.out.println(wrapperClass.getaDouble());
        System.out.println(wrapperClass.getaLong());
        System.out.println(wrapperClass.getCharacter());
        System.out.println(wrapperClass.getInteger());
        System.out.println(wrapperClass.getaShort());

        Integer integers = new Integer(123);//Auto boxing
        System.out.println(integers);

        int bb=integers;
        System.out.println(bb);//AutoUnboxing
        wrapperClass.usingScanner();
        System.out.println("==============================================");
        System.out.println("=====Inheritance Programm======");
        DellLaptop dellLaptop = new DellLaptop();
        dellLaptop.setBrandName("Dell");
        dellLaptop.setCameraPixcel(18.9f);
        dellLaptop.setGhz(2.8f);
        dellLaptop.setPrice(83000.989);
        dellLaptop.setRam(4);
        dellLaptop.setStorage("1TB");
        System.out.println("BrandName is::"+dellLaptop.getBrandName());
        System.out.println("WebCamera Pixel is::"+dellLaptop.getCameraPixcel());
        System.out.println("Processor Speed is::"+dellLaptop.getGhz());
        System.out.println("Price of laptop is::"+dellLaptop.getPrice());
        System.out.println("StorageCapacity::"+dellLaptop.getStorage());
        System.out.println("RAM capacity:;"+dellLaptop.getRam());

        SonyLaptop sonyLaptop = new SonyLaptop();
        sonyLaptop.setBrandName("SONY");
        sonyLaptop.setGhz(2.4f);
       sonyLaptop.setPrice(29000.989);
        sonyLaptop.setRam(8);
       sonyLaptop.setStorage("1TB");
       sonyLaptop.setWaterprove(true);
        System.out.println("BrandName is::"+sonyLaptop.getBrandName());
        System.out.println(sonyLaptop.getWaterprove());
        System.out.println(sonyLaptop.getGhz());
        System.out.println(sonyLaptop.getPrice());
        System.out.println(sonyLaptop.getStorage());
        System.out.println(sonyLaptop.getRam());

        System.out.println("======================================");
        System.out.println("====Scanner Class Uses====");
        ScannerClass scannerClass = new ScannerClass();
        scannerClass.getScanner();

*//*
        System.out.println("=========================================");
        System.out.println("====Immutability Class Program=====");
        ImmutabilityClass immutabilityClass = new ImmutabilityClass(202253,"Rajat","7008697185",6285.00,0.9f);
        System.out.println("My Name is ::"+immutabilityClass.getName());
        System.out.println("My EmpId is::"+immutabilityClass.getEmpId());
        System.out.println("PhoneNumber is"+immutabilityClass.getPhNumber());
        System.out.println(Long.parseLong(immutabilityClass.getPhNumber()));
       Long number = new Long(immutabilityClass.getPhNumber());
        System.out.println(number);
        System.out.println("Salary::"+immutabilityClass.getSalary());
        System.out.println("Bonus:;"+immutabilityClass.getBonus());
        System.out.println("Class name is::"+immutabilityClass.getClass());

        System.out.println("========================================");
        System.out.println("====Single tonClass======");
        SingleTonClass singleTonClass = SingleTonClass.getSingleTonClass();
        SingleTonClass singleTonClass1 = SingleTonClass.getSingleTonClass();
        SingleTonClass singleTonClass2 = SingleTonClass.getSingleTonClass();
        System.out.println(singleTonClass);
        System.out.println(singleTonClass1);
        System.out.println(singleTonClass2);
*/
        System.out.println("===========================================");
        System.out.println("=====InterFace and Abstract class ====");
        ImplClass implClass = new ImplClass();
        implClass.getcar();

    }
}

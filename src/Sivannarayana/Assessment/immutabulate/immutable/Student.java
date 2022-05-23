package Sivannarayana.Assessment.immutabulate.immutable;

    public   final class Student {
          private final Integer roolnumber;
          private  final String name;
          private final Integer marks;

          public Integer getRoolnumber() {
                return roolnumber;
          }

          public String getName() {
                return name;
          }

          public Integer getMarks() {
                return marks;
          }

          public Student(Integer roolnumber, String name, Integer marks) {
                this.roolnumber = roolnumber;
                this.name = name;
                this.marks = marks;
          }

          public static void main(String[] args) {
                Student s = new Student(5,"siva",500);
                System.out.println(s.getRoolnumber());
                System.out.println(s.name);
                System.out.println(s.marks);


          }
    }


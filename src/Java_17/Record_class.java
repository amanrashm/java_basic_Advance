package Java_17;

record Record_class_java17(int id , String name){};
// in Record, we don't require a default constructor and a parameterised too
//byDefault any variable written inside a record is private
// and final, and it can not be extended,
// but it can implement things of interface i.e: perfectly fine also
// it automatically overrides equals and hashcode methods of object class
// we also don't need to override toString method
class Practise {
    public static void main(String[] args) {

        Record_class_java17 Rc1 = new Record_class_java17(1,"Aman");
        Record_class_java17 Rc2 = new Record_class_java17(1,"Aman");

        System.out.println(Rc1.equals(Rc2));
        System.out.println(Rc1);
    }
}
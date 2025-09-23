package com.bhavdip.staticExample;


//static class Test {
//    String name;
//
//    public Test(String name) {
//        this.name = name;
//    }
//}

// outside classes can not be static
public class InnerClasses {

    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("kunal");
        Test b = new Test("mahesh");

        System.out.println("print of a : " + a.name);
        System.out.println("print of b : " + b.name);
    }
}

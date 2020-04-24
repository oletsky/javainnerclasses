package javatraining.oletsky.innerclasses;

/**
 * @author O.Oletsky
 * A simplest example of an inner class
 * Through the instance of the inner class
 * an outer class can regulate access to its data
 */

public class DemoInnerClasses {
    public static void main(String[] args) {
        //Direct creating of inner class instance
        Outer outer = new Outer();
        var inner1 = outer.new Inner();

        //More normal way of getting inner class instance
        var inner2 = outer.getInstance();
        System.out.println(inner2.getInfo()); //Specific information
        outer.setOuterPole("New value");
        System.out.println(inner2.getInfo()); //Updated information
    }
}

class Outer {
    private String outerPole="Outer field";
    private String otherPole="Other pole";

    public void setOuterPole(String outerPole) {
        this.outerPole = outerPole;
    }

    public Inner getInstance() {
        return new Inner();
    }

    public class Inner {
        public String getInfo() {
            //outerPole is accessible but
            return outerPole;
        }
    }

}

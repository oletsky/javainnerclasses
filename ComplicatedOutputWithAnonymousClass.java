package javatraining.oletsky.innerclasses;

public class ComplicatedOutputWithAnonymousClass {
        static String S1="The field ";
        public static void main(String[] args) {
            final String S2="the local variable";
            System.out.println(new Object() {
                public String toString(){
                    return S1+" and "+S2;
                }}
            );
        }

}

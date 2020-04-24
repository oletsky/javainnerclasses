package javatraining.oletsky.innerclasses;

/**
 * An example of inner classes taken from the book of Ekkel
 */

public class ExampleOfInnerClassesByEkkel {
    public static void main(String[] args) {
        new Parcel("Bananas","Bombay").deliver();

    }

}

class Parcel {
    Content content = new Content();
    Destination destination = new Destination();;

    class Content {
        private String cont;

        public String getCont() {
            return cont;
        }


        private void setCont(String cont) {
            this.cont=cont;
        }



    }

    class Destination {
        private String label;

        public String getLabel() {
            return label;
        }

        private void setLabel(String label) {
            this.label = label;
        }
    }

    Parcel (String value, String st) {
        content.setCont(value);
        destination.setLabel(st);

    }

    public void deliver() {
        System.out.println(content.cont+" delivered to "+destination.label);
    }

}


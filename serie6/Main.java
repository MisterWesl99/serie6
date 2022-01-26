package serie6;

public class Main {

    public static void main(String[] args) {

        Redner redner1 = new Redner("Ich mag es, frei reden zu duerfen.", false);
        Redner redner2 = new Redner("Hoffentlich redet mir niemand rein.", false);
        Redner redner3 = new Redner("Versteht man mich?", false);

        Thread one = new Thread() {
            
            @Override
            public void run() {
                redner1.run();
            }
        };
        one.start();

        Thread two = new Thread() {
            
            @Override
            public void run() {
                redner2.run();
            }
        };
        two.start();

        Thread three = new Thread() {
            
            @Override
            public void run() {
                redner3.run();
            }
        };
        three.start();

        System.out.println("\nDrei Reden abgeshlossen.");

        Redner redner4 = new Redner("Ich mag es, frei reden zu duerfen.", true);
        Redner redner5 = new Redner("Hoffentlich redet mir niemand rein.", true);
        Redner redner6 = new Redner("Versteht man mich?", true);

        Thread four = new Thread() {
            
            @Override
            public void run() {
                redner4.run();
            }
        };
        four.start();

        Thread five = new Thread() {
            
            @Override
            public void run() {
                redner5.run();
            }
        };
        five.start();

        Thread six = new Thread() {
            
            @Override
            public void run() {
                redner6.run();
            }
        };
        six.start();
        
    }
}

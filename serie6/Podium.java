package serie6;

public class Podium {

    public synchronized static void geordnetesReden(String rede) {
        
        try {int redelen = rede.length();

            for (int i = 0; i < redelen; i++) {
                System.out.print(rede.charAt(i));
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void ungeordnetesReden(String rede) {

        try {int redelen = rede.length();

            for (int i = 0; i < redelen; i++) {
                System.out.print(rede.charAt(i));
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

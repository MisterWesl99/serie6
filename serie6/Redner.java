package serie6;

public class Redner {

    private String rede;
    private boolean beachtetReihenfolge;

    public Redner (String rede, boolean beachtetReihenfolge) {

        this.rede = rede;
        this.beachtetReihenfolge = beachtetReihenfolge;
    }

    public void run() {

        if (this.beachtetReihenfolge) {

                Podium.geordnetesReden(rede);

        } else {
                Podium.ungeordnetesReden(rede);
            }
        }
    }

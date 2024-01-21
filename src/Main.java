import archive.RivistaArchive;
import models.Periodicita;
import models.Rivista;

public class Main {
    public static void main(String[] args) {
        RivistaArchive rivistaArchive = new RivistaArchive();

        Rivista rivista1 = new Rivista(9787704893497L, "rivista 1", 2020, 13, Periodicita.SETTIMANALE);
        Rivista rivista2 = new Rivista(9787430486497L, "rivista 2", 2020, 13, Periodicita.SETTIMANALE);


        rivistaArchive.add(rivista1);
        rivistaArchive.printAll();

        rivistaArchive.add(rivista2);
        rivistaArchive.printAll();
    }
}

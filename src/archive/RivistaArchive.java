package archive;

import models.Rivista;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RivistaArchive extends Archive {

    private final Set<Rivista> riviste;

    public RivistaArchive() {
        super("riviste");
        this.riviste = new HashSet<>();
        try {
            String fileContent = this.load();
            if (fileContent.isEmpty()) {
                return;
            }

            Arrays.stream(fileContent.split("\\r"))
                    .map(line -> line.split("#"))
                    .map(Rivista::new)
                    .forEach(riviste::add);

            this.printAll();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void add(Rivista rivista) {
        this.riviste.add(rivista);

        this.riviste.forEach(r -> {
            try {
                this.save(r.toString());
            } catch (IOException e) {
                this.riviste.remove(rivista);
                System.err.printf("Errore salvataggio rivista. Causa: %s\n\n", e.getCause());
                e.printStackTrace();
            }
        });
    }

    public void printAll() {
        System.out.println("*** Inizio contenuto archivio riviste ***");
        System.out.println(this.riviste);
        System.out.println("*** Fine contenuto archivio riviste ***");
    }

}

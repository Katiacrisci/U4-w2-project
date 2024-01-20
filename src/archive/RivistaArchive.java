package archive;

import models.Rivista;

import java.io.IOException;
import java.util.List;

public class RivistaArchive extends Archive {

    private List<Rivista> riviste;
    public RivistaArchive() throws IOException {
        super("riviste");
      String fileContent = this.load();
    }

    private void add(Rivista rivista) {
        this.riviste.add(rivista);
    }


}

package archive;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public abstract class Archive {
    private final File file;

    public Archive(String type) {
        String path = "archive/files/" + type + ".txt";
        this.file = new File(path);
    }

    protected void save(String content) throws IOException {
        FileUtils.writeStringToFile(this.file, content, "UTF-8");
    }

    protected String load() throws IOException {
        return FileUtils.readFileToString(this.file, "UTF-8");
    }

}

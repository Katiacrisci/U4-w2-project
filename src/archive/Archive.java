package archive;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public abstract class Archive {
    private final File file;
    private String fileContent;

    public Archive(String type) {
        String path =  type + ".txt";
        File newFile = new File("src/archive/files/" + path);
        try {
            boolean created = newFile.createNewFile();
            if (!created) {
                System.out.printf("File %s already exists\n", path);
            }
            this.file = newFile;
            this.fileContent = created ? "" : load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected void save(String content) throws IOException {
        this.fileContent += content;
        FileUtils.writeStringToFile(this.file, content, "UTF-8");
    }

    protected String load() throws IOException {
        return FileUtils.readFileToString(this.file, "UTF-8");
    }

}

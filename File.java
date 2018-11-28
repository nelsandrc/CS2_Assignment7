public class File extends Document{
    private String fileName;

    public File(String text, String fileName){
        super(text);
        this.fileName = fileName;
    }

    public File(){
        super();
        fileName = "Default Pathname";
    }

    @Override
    public String toString() {
        return "Filename: " + fileName + "\nText: " + super.toString();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public int fileLength() {
        return super.getText().length();
    }
}

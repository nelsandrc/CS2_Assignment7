/**
 * @author Andrew Nelson
 * Class to store text represented by a String in a document.
 */

public abstract class Document {
    /**Represents the text stored within the document.
     */
    private String text;

    /**Creates a generic document that stores an empty string as its text field.
     */
    public Document(){
        text = "";
    }

    /**Creates a document that stores the new text provided.
     * @param text String representing the new text.
     */
    public Document(String text){
        this.text = text;
    }

    /**Returns the text that is stored within the document.
     * @return The text in document.
     */
    public String getText() {
        return text;
    }

    /**Changes the text stored within the document
     * @param text The new text
     */
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public abstract int fileLength();


}

/**
 * @author Andrew Nelson
 * Represents an email
 */
public class Email extends Document {
    private String sender;
    private String recipient;
    private String subject;

    public Email( String text, String sender, String recipient, String subject){
        super(text);
        this.sender = sender;
        this.recipient = recipient;
        this.subject = subject;

    }

    public Email(){
        super();
        sender = "Default Sender";
        recipient = "Default Recipient";
        subject = "Default Subject";

    }

    @Override
    public String toString() {
        return "Sender: " + sender + "\nRecipient: " + recipient + "\nSubject: " + subject + "\nText: " + super.toString();
    }

    @Override
    public String getText() {
        return super.getText();
    }

    @Override
    public void setText(String text) {
        super.setText(text);
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSender() {
        return sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public int fileLength() {
        return getText().length();
    }
}

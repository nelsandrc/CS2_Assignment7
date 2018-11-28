public class DocumentApp {

    public static void main(String[] args){
        //Document document = new Document("Test Text");
        File file = new File("File text", "Pathname");
        Email email = new Email("Email text", "me", "you", "Testing stuff");

        System.out.println(file + "\nLength: " + file.fileLength());
        System.out.println();
        System.out.println(email);

        String word = "impossible";
        if(containsKeyword(file, word))
            System.out.println("Contains " + word);
        else
            System.out.println("Does not contain " + word);
    }

    public static boolean containsKeyword(Document document, String subtring){
        return document.getText().contains(subtring);
    }
}

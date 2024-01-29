package structural.adapterOneVersion;

import structural.adapterOneVersion.model.Letter;
import structural.adapterOneVersion.model.ShortMessage;
import structural.adapterOneVersion.model.ShortMessageLetterAdapter;

public class Main {
    public static void main(String[] args) {
        Letter letter = new Letter("full message");
        ShortMessageLetterAdapter adapter = new ShortMessageLetterAdapter(letter);
        System.out.println(createTitle(adapter));
    }

    private static String createTitle(ShortMessage message){
        return "new message: "+ message.getShortMessage();
    }
}

package structural.adapterOneVersion.model;

public class ShortMessageLetterAdapter implements ShortMessage{

    private Letter letter;

    public ShortMessageLetterAdapter(Letter letter) {
        this.letter = letter;
    }

    @Override
    public String getShortMessage() {
        return letter.getMessage().substring(0,4);
    }
}

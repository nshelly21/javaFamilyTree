import java.util.ArrayList;

public class Conservator implements MartianCharacteristics{

    Innovator copyInnovator;

    //6
    public Conservator(Innovator innovator){
        copyInnovator = innovator;
    }

    @Override
    public Innovator getParent() {
        return copyInnovator.getParent();
    }

    @Override
    public ArrayList<Innovator> getChildsList() {
        return copyInnovator.getChildsList();
    }

    @Override
    public ArrayList<Innovator> getFamilyTree(Innovator martian) {
        return copyInnovator.getFamilyTree(martian);
    }

    @Override
    public Boolean hasChildWithValue(Object value) {
        return copyInnovator.hasChildWithValue(value);
    }

    @Override
    public Boolean hasDescadantWithValue(Object value) {
        return copyInnovator.hasDescadantWithValue(value);
    }
}

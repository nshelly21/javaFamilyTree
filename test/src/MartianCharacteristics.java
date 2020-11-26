import java.util.ArrayList;

public interface MartianCharacteristics <T> {
    //3.a
    Innovator getParent();// Parent Value
    //3.b
    ArrayList<Innovator> getChildsList();
    //3.c
    ArrayList<Innovator> getFamilyTree(Innovator martian);
    //3.d
    Boolean hasChildWithValue(T value);//exist child with this genetic code?
    //3.e
    Boolean hasDescadantWithValue(T value);//exist member on familyTree with this genetic code?
}

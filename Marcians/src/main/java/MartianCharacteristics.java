import java.util.ArrayList;

public interface MartianCharacteristics <T> {
    //3.a
    int getBaseParam();// Parent Value
    //3.b
    ArrayList<String> getChildsList();
    //3.c
    ArrayList<String> getFamilyTree(Conservator martian);
    //3.d
    Boolean hasChildWithValue(T value);//exist child with this genetic code?
    //3.e
    Boolean hasDescadantWithValue(T value);//exist member on familyTree with this genetic code?

}

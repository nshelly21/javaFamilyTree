import java.util.ArrayList;
import java.util.Arrays;

//<T extends Innovator>
public class Innovator implements MartianCharacteristics{
    private int baseParam;
    private String geneticCode = null;
    private Innovator parent;
    private  ArrayList<Innovator> familyTree;
    private ArrayList<Innovator> childsList = new ArrayList<Innovator>();
    public String value;

    public Innovator(String value, String geneticCode)
    {
        this.value = value;
        this.geneticCode = geneticCode;
    }
    //4.a
    public  void setGeneticCode(String geneticCode) {
        this.geneticCode = geneticCode;
    }
    public String getGeneticCode() {
        return geneticCode;
    }
    //4.b
    public void setParent(Innovator parent){
        parent.addChild(this);
        this.parent = parent;
    }
    public void setParent(){
        this.parent = null;
    }
    //4.c
    public void setFamilyTree(ArrayList<Innovator> familyTree){
        this.familyTree = familyTree;
    }

    //4.d
    public Boolean addChild(Innovator child){
        if(!child.value.equals(value) && !childsList.contains(child)){
            childsList.add(child);
            child.setParent(this);
            return true;
        }
        return false;
    }
    //4.e
    public Boolean deleteChild(Innovator child){
        if(!child.value.equals(value) && childsList.contains(child)){
            childsList.remove(child);
            child.setParent();
            return true;
        }
        return false;
    }

    @Override
    public Innovator getParent() {
        return parent;
    }

    @Override
    public ArrayList<Innovator> getChildsList() {
        return childsList;
    }

    @Override
    public ArrayList<Innovator> getFamilyTree(Innovator martian) {
        if (martian.getChildsList() != null)
        {
            for(Innovator child : martian.getChildsList()){
                getFamilyTree(child);
                familyTree.add(child);
            }
        }
        return familyTree;//null
    }

    @Override
    public Boolean hasChildWithValue(Object value) {
        for(Innovator elem : childsList)
        {
            if(elem.value.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean hasDescadantWithValue(Object value) {
        if (this.getChildsList() != null)
        {
            for(Innovator child : this.getChildsList()){
                hasDescadantWithValue(value);
                if(child.value.equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }


}

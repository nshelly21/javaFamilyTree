import java.awt.*;

public class FamilyTree {

    //5.a recursive function
    public void printFamilyTree(Innovator martian){
        if (martian.getChildsList() != null)
        {
            for(Innovator child : martian.getChildsList()){
                printFamilyTree(child);
                System.out.print("Martian (String:");
                System.out.print(martian.value);
                System.out.println(")");
            }
        }
    }
    //5.b recursive function
    public void printFamilyTreeClass(Innovator martian){
        if (martian.getChildsList() != null)
        {
            for(Innovator child : martian.getChildsList()){
                printFamilyTree(child);
                System.out.println(martian.getClass());
            }
        }
    }
}

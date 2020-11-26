import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConservatorTest {

    @Test
    void getParent() {
        Innovator martian1  = new Innovator("Jhon", "S");
        Conservator martian2 = new Conservator(martian1);
        Innovator martian3  = new Innovator("Jana", "H");
        Conservator martian4 = new Conservator(martian1);

        martian2.copyInnovator.setParent(martian4.copyInnovator);
        assertEquals(martian1, martian2.getParent());
    }

    @Test
    void getChildsList() {
        Innovator martian1  = new Innovator("Jhon", "S");
        Innovator martian3  = new Innovator("Jana", "H");
        Innovator martian5  = new Innovator("Jana", "H");

        Conservator martian2 = new Conservator(martian1);
        Conservator martian4 = new Conservator(martian1);
        Conservator martian6 = new Conservator(martian1);

        martian2.copyInnovator.addChild(martian4.copyInnovator);//pos0
        martian2.copyInnovator.addChild(martian6.copyInnovator);//pos1

        //assertEquals(martian6.copyInnovator, martian2.copyInnovator.getChildsList().get(0));
    }

    @Test
    void getFamilyTree() {
        Innovator martian1  = new Innovator("Jhon", "S");
        Conservator martian2 = new Conservator(martian1);
        Innovator martian3  = new Innovator("Jana", "H");
        Conservator martian4 = new Conservator(martian1);
    }

    @Test
    void hasChildWithValue() {
        Innovator martian1  = new Innovator("Jhon", "S");
        Conservator martian2 = new Conservator(martian1);
        Innovator martian3  = new Innovator("Jana", "H");
        Conservator martian4 = new Conservator(martian1);
    }

    @Test
    void hasDescadantWithValue() {
        Innovator martian1  = new Innovator("Jhon", "S");
        Conservator martian2 = new Conservator(martian1);
        Innovator martian3  = new Innovator("Jana", "H");
        Conservator martian4 = new Conservator(martian1);
    }
}
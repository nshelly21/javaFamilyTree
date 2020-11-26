import static org.junit.jupiter.api.Assertions.*;

class InnovatorTest {



    @org.junit.jupiter.api.Test
    void setGeneticCode() {
        Innovator marcian1 = new Innovator("Jhon", "A");

        marcian1.setGeneticCode("B");
        assertEquals("B", marcian1.getGeneticCode());
    }

    @org.junit.jupiter.api.Test
    void setParent() {
        Innovator marcian1 = new Innovator("Jhon", "A");
        Innovator marcian2 = new Innovator("Jane", "B");

        marcian2.setParent(marcian1);
        assertEquals(marcian1, marcian2.getParent());
    }

    @org.junit.jupiter.api.Test
    void setFamilyTree() {

    }

    @org.junit.jupiter.api.Test
    void addChild() {
        Innovator marcian1 = new Innovator("Jhon", "A");
        Innovator marcian2 = new Innovator("Jane", "B");

        assertEquals(true, marcian1.addChild(marcian2));
        assertEquals(false, marcian1.addChild(marcian1));
    }

    @org.junit.jupiter.api.Test
    void deleteChild() {
        Innovator marcian1 = new Innovator("Jhon", "A");
        Innovator marcian2 = new Innovator("Jane", "B");

        marcian1.addChild(marcian2);
        assertEquals(true, marcian1.deleteChild(marcian2));
        assertEquals(false, marcian1.deleteChild(marcian2));
    }

    @org.junit.jupiter.api.Test
    void getParent() {
        Innovator marcian1 = new Innovator("Jhon", "A");
        Innovator marcian4 = new Innovator("Juan", "D");

        marcian4.setParent(marcian1);
        assertEquals(marcian1, marcian4.getParent());
    }

    @org.junit.jupiter.api.Test
    void getChildsList() {
        Innovator marcian1 = new Innovator("Jhon", "A");
        Innovator marcian2 = new Innovator("Jane", "B");
        Innovator marcian3 = new Innovator("Jonas", "C");
        Innovator marcian4 = new Innovator("Juan", "D");

        marcian1.addChild(marcian2);
        marcian1.addChild(marcian3);
        marcian1.addChild(marcian4);
        assertEquals(marcian4, marcian1.getChildsList().get(2));
    }

    @org.junit.jupiter.api.Test
    void getFamilyTree() {

    }

    @org.junit.jupiter.api.Test
    void hasChildWithValue() {
        Innovator marcian1 = new Innovator("Jhon", "A");
        Innovator marcian3 = new Innovator("Jonas", "C");
        Innovator marcian4 = new Innovator("Juan", "D");
        Innovator marcian5 = new Innovator("Jana", "E");

        marcian1.addChild(marcian5);
        marcian1.addChild(marcian3);
        marcian1.addChild(marcian4);
        assertEquals(true, marcian1.hasChildWithValue(marcian5.value));
    }

    @org.junit.jupiter.api.Test
    void hasDescadantWithValue() {
    }
}
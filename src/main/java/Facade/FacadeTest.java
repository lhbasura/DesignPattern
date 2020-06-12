package Facade;

import org.junit.Test;

public class FacadeTest {
    @Test
    public void test() {
        Facade facade = new Facade();
        facade.readCommic();
        facade.readNovel();
        facade.readWordBook();
    }
}

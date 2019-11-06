package Builder;

import org.junit.Test;

public class BuilderTest {
    @Test
    public void test()
    {
        Window window=Window.builder()
                .title("baidu.com")
                .content("this is baidu page")
                .height(10)
                .width(10)
                .x(0)
                .y(0)
                .build();
        Dialog dialog=Dialog.builder()
                .title("tencent")
                .content("this is tencent qq dialog")
                .height(10)
                .width(10)
                .x(0)
                .y(0)
                .build();
        System.out.println(window);
        System.out.println(dialog);

    }
}

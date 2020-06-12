package Builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Window {
    private String title;
    private String content;
    private float x;
    private float y;
    private int width;
    private int height;

}

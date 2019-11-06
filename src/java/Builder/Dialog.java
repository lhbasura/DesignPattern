package Builder;

import lombok.Data;

@Data
public class Dialog {
    private String title;
    private String content;
    private float x;
    private float y;
    private int width;
    private int height;

    static Builder builder() {
        return new Builder();
    }

    static class Builder {
        private Dialog dialog;

        public Builder() {
            dialog = new Dialog();
        }
        public Dialog build(){
            return dialog;
        }
        public Builder title(String title){
            dialog.setTitle(title);
            return this;
        }
        public Builder content(String content){
            dialog.setContent(content);
            return this;
        }

        public Builder x(float x){
            dialog.setX(x);
            return this;
        }
        public Builder y(float y){
            dialog.setY(y);
            return this;
        }
        public Builder height(int height){
            dialog.setHeight(height);
            return  this;
        }
        public Builder width(int width){
            dialog.setWidth(width);
            return  this;
        }
    }

}

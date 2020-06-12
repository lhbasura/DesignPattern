package Decoration;

public abstract class Beverage implements Food {

    private Size size;
    public Size getSize() {
        if(this.size==null)
        {
            try {
                throw new Exception("size is not set!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }
}

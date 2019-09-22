
import java.lang.reflect.Field;

public class Main {
    public static void main(String[]args) throws Exception {
        Integer a=1;
        Integer b=2;
        System.out.println(String.format("before swap\na:%d,b:%d",a,b));

        swap(a,b);
        System.out.println(String.format("after swap\na:%d,b:%d",a,b));

    }
    public static void  swap(Integer a,Integer b) throws Exception
    {

        Field field=Integer.class.getDeclaredField("value");
        field.setAccessible(true);
        int temp=a.intValue();
        field.set(a,b.intValue());
        field.set(b,new Integer(temp));
    }
}

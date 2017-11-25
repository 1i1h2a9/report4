import java.io.IOException;


public class except {
    public static void main(String[] args){
        try {
            String str = "3．14";
            Double value = Double.parseDouble(str);
            System.out.println(value);
        }catch(NullPointerException e){
            System.out.println("NullPointerExceptionが発生しました");
            System.out.println(e.getMessage());
        }
    }
}


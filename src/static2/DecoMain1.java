package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtiil1 utiil1 = new DecoUtiil1();
        String deco = utiil1.deco(s);

        System.out.println("before: "+s);
        System.out.println("after: "+deco);
    }
}

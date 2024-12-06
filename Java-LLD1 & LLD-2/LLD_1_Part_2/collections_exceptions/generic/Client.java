package LLD_1_Part_2.collections_exceptions.generic;

public class Client {
    public static void main(String[] args) {
        int [] arr={15,25,30};
        Generic<int []> str=new Generic<>(arr);
        str.print();

        // taking string as a input
        Generic<String> name=new Generic<>("Sunil");
        name.print();
    }
}

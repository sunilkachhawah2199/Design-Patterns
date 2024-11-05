package collections_exceptions.generic;

public class Generic <T>{
    T num;
    public Generic(T num){
        this.num=num;
    }

    public void print(){
        System.out.println(this.num);
    }
}

package LLD_1_Part_2.collections_exceptions.exceptions;

public class Student {
    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }

    // this is a checked exception and ths should be must handle
    public void setAge(int age) throws CustomException{
        if(age<18){
            throw new CustomException("you are child to join us");
        }
    }


}


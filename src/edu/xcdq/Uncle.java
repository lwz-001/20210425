package edu.xcdq;

/**
 * @qvthor liuwenzheng
 * @date 2021/4/25 14:47
 */
public class Uncle {
    private  String name ;
    private  int age ;

    public  Uncle(){

    }
    public  Uncle(String name , int age){
        this.name = name ;
        this.age = age ;
    }
    public void fahongbao(){
        System.out.println("发红包");
    }

    public String getName(){
        return  name ;
    }

    @Override
    public String toString() {
        return "Uncle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

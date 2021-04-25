package edu.xcdq;

/**
 * @qvthor liuwenzheng
 * @date 2021/4/25 14:45
 */
public class Demo01 {
    public static void main(String[] args) {
        //多态
       UncleOne dajiu = new UncleOne();
       dajiu.faHongbao();
       UncleTwo uncleTwo = new UncleTwo() ;
       uncleTwo.faHongbao();

       Uncle dajiu1 = new UncleOne() ;
       dajiu1.fahongbao();
        //dajiu1.songyan     //会报错 子类独有的方法在发生向上转型的时候无法在父类中使用
        UncleOne temp = (UncleOne) dajiu1 ;
        temp.songyan();

       Uncle erjiu = new UncleTwo() ;
       erjiu.fahongbao();

       //向下转型
        Uncle uncleTwo1 = new UncleTwo() ;
        UncleTwo temp1 = (UncleTwo) uncleTwo;
        temp.faHongbao();
    }

}

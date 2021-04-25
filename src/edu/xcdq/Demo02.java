package edu.xcdq;

/**
 * @qvthor liuwenzheng
 * @date 2021/4/25 15:58
 */
public class Demo02 {
    public static void main(String[] args) {
        Uncle uncle1= new UncleOne() ;
        Uncle uncle2 = new UncleTwo() ;
        if (uncle1 instanceof  UncleOne){
            UncleOne u1 = (UncleOne) uncle1 ;
            u1.fahongbao();
        }
        if (uncle2 instanceof  UncleTwo){
            UncleTwo u2 = (UncleTwo)  uncle2 ;
            u2.faHongbao();
        }
    }
}

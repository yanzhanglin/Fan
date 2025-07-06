package day01;

import day01.*;
// 关于继承和多态
public class Demo4 extends Demo3{
    protected String hobby;

    public Demo4(String name,int age,String sexual,String hobby) {
        super(name,age,sexual);
        this.hobby = hobby;
    }

    public void setHobby(String hobby){
        this.hobby = hobby;
    }

    public String getHobby(){
        return this.hobby;
    }

    public String getBankCard(){
        return this.bankCard;
    }




    }


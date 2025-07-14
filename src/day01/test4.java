package day01;
public class test4 {
    public static void main(String[] args){
        Demo4 jack = new Demo4("jack",28,"男","basketball");
        System.out.printf("我叫%s,今年%d岁，性别%s，爱好是%s",jack.getName(),jack.getAge(),jack.getSexual(),jack.getHobby());
        System.out.printf("银行卡是%s", jack.bankCard);
    }

}

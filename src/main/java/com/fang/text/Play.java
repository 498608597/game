package com.fang.text;

/**
 * Created by FangYongYao on 2019/4/20.
 */
public class Play {
    private int firstNum;
    private int secondNum;
    private int maxNum;
    public Play(int firstNum,int secondNum,int maxNum){
        this.firstNum=firstNum;
        this.secondNum=secondNum;
        this.maxNum=maxNum;
    }
    //stage1
    public void play() {
        String first = "fizz";
        String second = "buzz";
        for (int i = 1; i <= maxNum; i++) {
            if (i % firstNum == 0 && i % secondNum == 0) {
                System.out.println(first + second);
            } else if (i % firstNum == 0) {
                System.out.println(first);
            } else if (i % secondNum == 0) {
                System.out.println(second);
            } else {
                System.out.println(i);
            }
        }
    }
    //stage2
    public void play2() {
        String first = "fizz";
        String second = "buzz";
        boolean firstFlag;
        boolean secondFlag;
        for (int i = 1; i <= maxNum; i++) {
            firstFlag=i % firstNum == 0||String.valueOf(i).contains(String.valueOf(firstNum));
            secondFlag=i % secondNum == 0||String.valueOf(i).contains(String.valueOf(secondNum));
            if (firstFlag  && secondFlag) {
                System.out.println(first + second);
            } else if (firstFlag) {
                System.out.println(first);
            } else if (secondFlag) {
                System.out.println(second);
            } else {
                System.out.println(i);
            }
        }
    }




}

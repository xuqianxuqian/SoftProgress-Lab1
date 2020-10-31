package com.xiets;

import java.util.Random;
/*
* 单个问题生成器
 */
public class Question {
    private int number1;
    private int number2;
    private int result;
    private String sign;
    private int check = 0;

    /**
     * 无参构造器，用于实际问题
     */
    public Question(){
        Random random = new Random();
        this.number1=random.nextInt(100);
        this.number2=random.nextInt(100);
        int i = random.nextInt(900);
        if( i%2 == 0 && this.number1 >= this.number2){
            this.result = number1 - number2;
            this.sign = "-";
        }
        else{
            this.result = number1+number2;
            this.sign = "+";
        }
    }

    /**
     * 有参构造器，用于测试
     * @param number1 第一个数
     * @param number2 第二个数
     * @param sign 计算符号
     */
    public Question(int number1,int number2,String sign){
        this.number1 = number1;
        this.number2 = number2;
        this.sign = sign;
        switch (sign){
            case "+":
                this.result = number1+number2;
                break;
            case "-":
                this.result = number1-number2;
                break;
        }
    }

    /**
     * 更新问题
     */
    public void refresh(){
        Random random = new Random();
        this.number1=random.nextInt(100);
        this.number2=random.nextInt(100);
        int i = random.nextInt(900);
        if( i%2 == 0 && this.number1 >= this.number2){
            this.result = number1 - number2;
            this.sign = "-";
        }
        else{
            this.result = number1+number2;
            this.sign = "+";
        }
    }
    /**
     * 检验回答
     * @param answer 使用者输入回答
     * @return 1 如果回答正确；0 如果回答错误
     */
    public int checkAnswer(int answer){
        if(answer == this.result){
            this.check = 1;
        }
        else{
            this.check = 0;
        }
        return this.check;
    }

    /**
     * 得到正确结果
     * @return 正确计算结果
     */
    public int getResult(){
        return this.result;
    }

    /**
     * 得到问题
     * @return String 问题
     */
    public String getquestion(){
        return number1+sign+number2+"=?";
    }

}

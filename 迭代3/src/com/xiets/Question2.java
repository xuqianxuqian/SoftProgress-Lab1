package com.xiets;

import java.util.Random;
/*
 * 单个问题生成器
 */
public class Question2 {
    private int number1;
    private int number2;
    private int result;
    private String sign;
    private int check = 0;
    //出题难度，分为1,2,3等级
    private String level="1";

    //第二轮迭代，增加难度的Question
    public Question2(){
        Random random = new Random();
        int i;
        switch (this.level){
            case "1":
                //加减法难度为个位数的计算
                this.number1=random.nextInt(10);
                this.number2=random.nextInt(10);
                i = random.nextInt(900);
                if( i%2 == 0 && this.number1 >= this.number2){
                    this.result = number1 - number2;
                    this.sign = "-";
                }
                else{
                    this.result = number1+number2;
                    this.sign = "+";
                }
                break;
            case "2":
                //加减法难度为50以内(不含50)的数的计算
                this.number1=random.nextInt(50);
                this.number2=random.nextInt(50);
                i = random.nextInt(900);
                if( i%2 == 0 && this.number1 >= this.number2){
                    this.result = number1 - number2;
                    this.sign = "-";
                }
                else{
                    this.result = number1+number2;
                    this.sign = "+";
                }
                break;
            case "3":
                //加减法难度为50到100的大数的计算
                this.number1=random.nextInt(51)+50;
                this.number2=random.nextInt(51)+50;
                i = random.nextInt(900);
                if( i%2 == 0 && this.number1 >= this.number2){
                    this.result = number1 - number2;
                    this.sign = "-";
                }
                else{
                    this.result = number1+number2;
                    this.sign = "+";
                }
        }
    }

    /**
     * 设置题目难度水平
     * @param level
     */
    public void setlevel(String level){
        this.level = level;
    }

    /**
     * 有参构造器，用于测试
     * @param number1 第一个数
     * @param number2 第二个数
     * @param sign 计算符号
     */
    public Question2(int number1,int number2,String sign){
        this.number1 = number1;
        this.number2 = number2;
        this.sign = sign;
        Random random = new Random();
        switch (sign){
            case "+":
                this.result = number1+number2;
                break;
            case "-":
                this.result = number1-number2;
        }
    }

    /**
     * 更新问题
     */
    public void refresh(){
        Random random = new Random();
        int i;
        switch (this.level){
            case "1":
                //加减法难度为个位数的计算
                this.number1=random.nextInt(10);
                this.number2=random.nextInt(10);
                i = random.nextInt(900);
                if( i%2 == 0 && this.number1 >= this.number2){
                    this.result = number1 - number2;
                    this.sign = "-";
                }
                else{
                    this.result = number1+number2;
                    this.sign = "+";
                }
                break;
            case "2":
                //加减法难度为50以内(不含50)的数的计算
                this.number1=random.nextInt(50);
                this.number2=random.nextInt(50);
                i = random.nextInt(900);
                if( i%2 == 0 && this.number1 >= this.number2){
                    this.result = number1 - number2;
                    this.sign = "-";
                }
                else{
                    this.result = number1+number2;
                    this.sign = "+";
                }
                break;
            case "3":
                //加减法难度为50到100的大数的计算
                int n1=random.nextInt(51);
                int n2=random.nextInt(51);
                this.number1 = n1+50;
                this.number2 = n2+50;
                i = random.nextInt(900);
                if( i%2 == 0 && this.number1 >= this.number2){
                    this.result = number1 - number2;
                    this.sign = "-";
                }
                else{
                    this.result = number1+number2;
                    this.sign = "+";
                }
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
        return number1+sign+number2+"=  ?";
    }

    /**
     * 得到题目难度等级
     * @return 题目难度等级1,2,3
     */
    public String getLevel(){
        return this.level;
    }

    /**
     * 获得第一个数
     * @return
     */
    public int getNumber1(){
        return this.number1;
    }

    /**
     * 获得第二个数
     * @return
     */
    public int getNumber2() {
        return number2;
    }
}

package com.xiets;

public class Person2 {
    private String name;
    private int rightnumber = 0;
    private int wrongnumber = 0;
    private int totalnumber = 0;
    private int mark=0;//积分

    private void checkRep(){
        assert rightnumber>=0;
        assert wrongnumber>=0;
        assert totalnumber == rightnumber+wrongnumber;
        assert mark>=0;
    }
    public Person2(){

    }

    /**
     * constructor
     * @param name 人名
     */
    public Person2(String name){
        this.name = name;
        checkRep();
    }


    public void setName(String name){
        this.name = name;
    }
    /**
     * 增加正确题数
     */
    public void addrightnumber(){
        this.rightnumber++;
        totalnumber++;
        checkRep();
    }

    /**
     * 增加错误题数
     */
    public void addwrongnumber(){
        this.wrongnumber++;
        totalnumber++;
        checkRep();
    }

    /**
     * 增加积分
     * @param level 题目难度1,2,3
     */
    public void addMark(String level){
        switch (level){
            case "1":
                this.mark=this.mark+1;
                break;
            case "2":
                this.mark=this.mark+3;
                break;
            case "3":
                this.mark=this.mark+5;
        }
        checkRep();
    }

    /**
     * 得到人名
     * @return 人名
     */
    public String getName(){
        return this.name;
    }

    /**
     * 得到正确题数
     * @return 正确题数
     */
    public int getRightnumber(){
        return this.rightnumber;
    }

    /**
     * 得到错误题数
     * @return 错误题数
     */
    public int getWrongnumber(){
        return  this.wrongnumber;
    }

    /**
     * 得到总题数
     * @return 总题数
     */
    public int getTotalnumber() {
        return totalnumber;
    }

    /**
     * 获取用户积分
     * @return 积分
     */
    public int getMark() {
        return this.mark;
    }
}

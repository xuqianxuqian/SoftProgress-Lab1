package com.xiets;
/*
* 用户类
 */
public class Person1 {
    private String name;
    private int rightnumber = 0;
    private int wrongnumber = 0;
    private int totalnumber = 0;

    private void checkRep(){
        assert rightnumber>=0;
        assert wrongnumber>=0;
        assert totalnumber == rightnumber+wrongnumber;
    }

    /**
     * constructor
     * @param name 人名
     */
    public Person1(String name){
        this.name = name;
        checkRep();
    }

    public Person1(){

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
}

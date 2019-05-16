package com.tmy;

/**
 * @ClassName: TestForIntReversal
 * @Desc: 整数反转
 * @Author: tmy
 * @Date: 2019-05-07 15:18
 * @Version: 1.0
 */
public class TestForIntReversal {



    public static void main(String [] args){
        int numberone = 2147483647;
        int numbertwo = -2147483648;
        String result = "";
        String numbertmy = String.valueOf(numberone);
        String aa[] = numbertmy.split("");
        for(int a =aa.length-1 ;a>=0;a--){
            System.out.println(aa[a]);
            result = result + aa[a];
//            int tt = (int) (Integer.parseInt(aa[a])*Math.pow(10,a-1));
//            System.out.println(tt+" - ");
        }
        long resultnumber = Long.parseLong(result);
        if(resultnumber>Math.pow(2,31)-1||resultnumber>(-1)*Math.pow(2,31)){
            System.out.println("youwenti "+result);
        }else{
            System.out.println("meiwenti "+result);
        }

    }
}

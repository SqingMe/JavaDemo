package com.corc;

public class Test {
     private static final int FIRST = 100;
     private static final int LAST = 200;
     private static final int BEGIN = 1;
     private static final int END = 50;
     public static int[] calculate() {
    	 int[] is = new int[100];
    	 int j = 0;
    	 for (int i = FIRST; i <= LAST; i++) {
			if(i%6 == 0) {
				is[j] = i;
				j++;
			}
		}
		return is;
     }
     
     /**
     * 描述: 1~50的和
     * @return
     */
    public static int sumTosum1() {
    	 int middle = END/2;
    	 int sum = 0;
    	 
    	 for (int i = middle,j = middle; i >= BEGIN  && j <= END; i--,j++) {
    		 System.out.println(i + "     " + j);
    		 sum = sum+i+j;
		}
    	
    	 return sum - middle;
     }
    /**
     * 描述: 1~50的和
     * @return
     */
    public static int sumTosum2() {
    	 int middle = END/2;
    	 // 最简写法
    	return (middle) * END + middle;
     }
    
     /**
     * 描述: 读取正整数和负整数个数，遇到0结束
     */
    public static void readNumber() {
    	 int[] is = new int[] {7,9,8,-4,-8,5,53,58,4,-7,-9,0,5,4,111};
    	 int i = 0,j=0;
    	 for (int k : is) {
			if(k>0) {
				i++;
			}else if(k<0) {
				j++;
			}else {
				break;
			}
		}
    	 System.out.println("正整数个数："+ i + "\n" + "负整数个数：" + j );
    	 
     }
     /**
     * 描述: 拼接字符串，求help个数
     * @param a
     * @param b
     * @return
     */
    public static int readString(String a,String b) {
    	 String help = "help";
    	 StringBuffer stringBuffer = new StringBuffer();
    	 stringBuffer.append(a);
    	 stringBuffer.append(b);
    	 String newString = stringBuffer.toString();
    	 System.out.println("新字符串："+ newString);
    	 int indexOf = 0;
    	 int count = 0;
    	 while ((indexOf+help.length()) <= newString.length())
    	 {
    		 indexOf = newString.indexOf(help,count==0?0:indexOf+1);
    		 count++;
    		 if(indexOf==-1) {
    			 return count-1;
    		 }
    	 }
    	
		return count;
    	 
     }
     public static void main(String[] args) {
    	 int readString = readString("aahelp","bhelpbbhelphelpeeehelp");
    	 System.out.println(readString);
	}
}

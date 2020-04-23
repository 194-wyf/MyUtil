package com.wyf.common.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 * 
    * @ClassName: RandomUtil
    * @Description:  随机数
    * @author 王一帆
    * @date 2020年4月23日
    *
 */
public class RandomUtil {
		//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
		public static int random(int min, int max){
		//TODO 实现代码
			//产生随机数
			Random random = new Random();
			//返回大于等于0小于max的值
			int nextInt = random.nextInt(max-min+1)+min;
			//返回随机数
			
			return nextInt;
		}
		/**
		 * 	方法2：在最小值min与最大值max之间截取subs个不重复的随机数。
		 * 例如在1-10之间取3个不重复的随机数，
		 * 那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到
		 * @param <E>
		 */
		
		public static  int[] subRandom (int min, int max, int subs){
			//TODO 实现代码
			
			HashSet<Integer> set = new HashSet<Integer>();
			while(set.size()!=subs) {
				int random = random(min, max);
				set.add(random);
				//System.out.println(set.size());
			}
			int[] str = new int[subs];
			int i=0;
			for (Integer in : set) {
				str[i]=in;
				i++;
			}
			//TODO 实现代码
			return str;
		}
		
		//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
		public static char randomCharacter (){
		//TODO 实现代码
			String str="1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
			return str.charAt(random(0, str.length()-1));
		}
		
		//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
		public static String randomString(int length){
		//TODO 实现代码
			
			StringBuffer buffer = new StringBuffer();
			for (int i = 0; i < length; i++) {
				buffer.append(randomCharacter());
			}
			return buffer.toString();
		}
}

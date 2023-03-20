package medium;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 567. 字符串的排列
 * @author HJ
 */
public class ArrayOfStrings {

	public boolean checkInclusion(String s1, String s2) {
		int n = s1.length(), m = s2.length();
		if (n > m) {
			return false;
		}
		int[] cnt1 = new int[26];
		int[] cnt2 = new int[26];
		for(int i = 0; i < n; i++) {
			++cnt1[s1.charAt(i) - 'a'];
			++cnt2[s2.charAt(i) - 'a'];
		}
		if (Arrays.equals(cnt1, cnt2)) {
			return true;
		}
		for(int i = n; i < m; ++i) {
			++cnt2[s2.charAt(i) - 'a'];
			--cnt2[s2.charAt(i - n) - 'a'];
			if (Arrays.equals(cnt1, cnt2)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args){
		ArrayOfStrings arrayOfStrings = new ArrayOfStrings();
		String s1 = "ab", s2 = "eidboaoo";
		System.out.println(arrayOfStrings.checkInclusion(s1, s2));
	}

}
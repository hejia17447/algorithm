package main.huawei_machine_test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 题目0257-增强的strstr
 * 题目描述
 * C 语言有一个库函数： char *strstr(const char *haystack, const char *needle) ，实现在字符串 haystack 中查找第一次出现字符串 needle 的位置，如果未找到则返回 null。
 * 现要求实现一个strstr的增强函数，可以使用带可选段的字符串来模糊查询，与strstr一样返回首次查找到的字符串位置。
 * 可选段使用 [] 标识，表示该位置是可选段中任意一个字符即可满足匹配条件。比如 a[bc] 表示可以匹配ab或ac。
 * 注意目标字符串中可选段可能出现多次。
 * 输入描述
 * 与strstr函数一样，输入参数是两个字符串指针，分别是源字符串和目标字符串。
 * 输出描述
 * 与strstr函数不同，返回的是源字符串中，匹配子字符串相对于源字符串地址的偏移（从0开始算），如果没有匹配返回-1。
 * 补充说明：源字符串中必定不包含[]；目标字符串中[]必定成对出现，且不会出现嵌套。
 * 输入的字符串长度在[1,100]之间。
 */
public class EnhancedStrstr {
    public static int solution(String src, String tar) {
        Matcher matcher = Pattern.compile(tar).matcher(src);

        if (matcher.find()) {
            return src.indexOf(matcher.group());
        } else {
            return -1;
        }
    }
}

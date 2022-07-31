package com.example.myapplication;
import android.util.Log;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class InfixToSuffix {
    public static ArrayList Suffix(StringBuffer str) {
        for (int i = 1; i < str.length(); i++) {//在负数的负号前添加一个“0”
            if (str.charAt(i) == '-' && str.charAt(i - 1) == '(') {//识别负数
                str.insert(i, '0');
            }
        }
        StringBuilder temp = new StringBuilder();
        List<String> list = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();//将中缀表达式转换后的后缀表达式储存在result数组中
        for (int i = 0; i < str.length(); i++) {//遍历整个中缀表达式
            if ((str.charAt(i) >= '0' && str.charAt(i) <= '9') || str.charAt(i) == '.') {//检测数字和小数点
                if (str.charAt(i) == '.' && temp.length() == 0) {
                    temp.append(0);
                    temp.append(str.charAt(i));
                } else {
                    temp.append(str.charAt(i));
                }
                if (i == str.length() - 1) {//该步骤的作用是取决于上一步的else中的，例如：假设中缀表达式没有小数点时，那么最后一位如果为数字，就先执行else里的命令，然后将temp全部输入到list里
                    list.add(temp.toString());//将temp中的全部添加到list中
                }
            } else {//符号进到这里
                if (temp.length() != 0)
                    list.add(temp.toString());
                list.add(String.valueOf((str.charAt(i))));//将StringBuffer型的str.charAt(i)转化为String类型的，添加到list数组中
                temp.delete(0, temp.length());//temp清空
            }
        }//以上步骤就是将StringBuffe类型转换为String类型，中缀表达式不变
        for (String aList : list) {
            System.out.println(aList + "");
        }
        System.out.println();
        Stack<String> stack = new Stack<>();
        Map<Character, Integer> map = new HashMap<>();
        //Character代表字符类，表示对单个字符进行操作，其基本数据类型为char。
        //Integer为复杂数据类型，是int的封装类，其初始值为null
        map.put('(', 2);//定义符号的优先级
        map.put(')', 2);
        map.put('*', 1);
        map.put('/', 1);
        map.put('+', 0);
        map.put('-', 0);
        for (String s : list) {
            if (s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-") || s.equals("(") || s.equals(")")) {
                if (stack.size() == 0) {
                    stack.push(s);//如果当前栈内没有元素，让符号直接进栈
                } else {
                    if (s.equals(")")) {
                        if (!stack.empty()) {
                            while (!stack.peek().equals("(")) {
                                result.add(stack.pop());
                                if (stack.empty()) {
                                    break;
                                }
                            }
                            if (!stack.empty()) {
                                if (stack.peek().equals("("))//查看栈顶对象而不移除它
                                    stack.pop();
                            }
                        }
                    } else {
                        if (stack.peek().charAt(0) != '(') {
                            if (map.get(s.charAt(0)) > map.get(stack.peek().charAt(0))) {
                                stack.push(s);
                            } else {
                                while ((map.get(s.charAt(0)) <= map.get(stack.peek().charAt(0))) && !stack.empty()) {
                                    result.add(stack.pop());
                                    if (stack.empty()) {
                                        break;
                                    }
                                    if (stack.peek().equals("(")) {
                                        break;
                                    }
                                }
                                stack.push(s);
                            }
                        } else {
                            stack.push(s);
                        }
                    }
                }
            } else {
                result.add(s);
            }
        }
        while (!stack.empty()) {
            result.add(stack.pop());
        }
        return result;
    }


    public static String Cal(ArrayList arrayList) {
        int length = arrayList.size();
        String[] arr = new String[length];
        for (int i = 0; i < arrayList.size(); i++) {
            arr[i] = (String) arrayList.get(i);
        }
        List<String> list = new ArrayList<>();
        for (String anArr : arr) {
            int size = list.size();
            switch (anArr) {
                case "+":
                    BigDecimal a = new BigDecimal(list.remove(size - 2)).add(new BigDecimal(list.remove(size - 2)));
                    list.add(a.stripTrailingZeros().toString());//用科学计数法向list中输入字符串
                    break;
                case "-":
                    BigDecimal b = new BigDecimal(list.remove(size - 2)).subtract(new BigDecimal(list.remove(size - 2)));
                    list.add(b.stripTrailingZeros().toString());
                    break;
                case "*":
                    BigDecimal c = new BigDecimal(list.remove(size - 2)).multiply(new BigDecimal(list.remove(size - 2)));
                    list.add(c.stripTrailingZeros().toString());
                    break;
                case "/":
                    BigDecimal d = new BigDecimal(list.remove(size - 2)).divide(new BigDecimal(list.remove(size - 2)), 10, BigDecimal.ROUND_HALF_UP);
                    list.add(d.stripTrailingZeros().toString());
                    break;
                default:
                    list.add(anArr);
                    break;
            }
        }
        if (list.size() == 1) {
            if (list.get(0).length() < 30) {
                BigDecimal bd = new BigDecimal(list.get(0));
                return bd.toPlainString();
            } else {
                double d = Double.valueOf(list.get(0));
                return String.valueOf(d);
            }
        } else {
            return "这样做不好";
        }
    }

}

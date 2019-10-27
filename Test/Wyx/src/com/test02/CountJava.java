package com.test02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;

/*第二题：统计某java文件每个字母出现的次数（不用按照字母的顺序排列），按照如下格式打印：
a=1000
b=2000...
//....*/
public class CountJava {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Wyx\\src\\com\\test01\\IOTest.java"));
        HashMap<Character,Long> map = new HashMap<>();
        int i = 0;
        long count = 1;
        while ((i=br.read())!=-1){
            char c = (char)i;
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);

            }else {
                map.put(c,count);
            }
        }
        for (Character character : map.keySet()) {
            System.out.println(character+"="+map.get(character));
        }

    }
}

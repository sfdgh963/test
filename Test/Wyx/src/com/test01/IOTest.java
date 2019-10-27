package com.test01;

import java.io.*;
import java.util.HashMap;
import java.util.Properties;

/*第一题：项目根路径下有stations.txt文件，内容如下：
                                  朱辛庄
                                  育知路
                                  平西府
                                  回龙观东大街
                                  霍营
                                  育新
                                  西小口
                                  //....
                           2.利用IO流的知识读取stations.txt文件，将内容写入到subway8.txt,写入格式如下：
                                  1=朱辛庄
                                  2=育知路
                                  3=平西府
                                  4=回龙观东大街
                                  5=霍营
                                  //....
                           3.读取subway8.txt文件内容存储到map集合中，key：表示第几站，value：表示站名，并遍历打印(可以不按顺序打印)：
                                  第10站: 森林公园南门
                                  第6站: 育新
                                  第12站: 奥体中心
                                  第13站: 北土城
                                  //...*/
public class IOTest {
    public static void main(String[] args) throws IOException {
        //2:
        BufferedReader br = new BufferedReader(new FileReader("Wyx\\stations.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Wyx\\subway8.txt"));
        String s ;
        int i = 1;
        while ((s=br.readLine())!=null){
            bw.write(i+"="+s);
            bw.newLine();
            bw.flush();
            i++;
        }


        //3:
        Properties p = new Properties();
        HashMap<String,String> map = new HashMap<>();
        BufferedReader br1 = new BufferedReader(new FileReader("Wyx\\subway8.txt"));
        p.load(br1);
        for (Object o : p.keySet()) {
            String s1 = (String) o;
            map.put("第"+s1+"站:",(String) p.get(s1));
        }
        for (String s1 : map.keySet()) {
            System.out.println(s1+"\t"+map.get(s1));
        }




    }
}

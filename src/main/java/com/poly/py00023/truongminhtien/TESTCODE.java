package com.poly.py00023.truongminhtien;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class TESTCODE {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> questionBool = new ArrayList<String>();
    for (int i = 0; i < 5; i++){
        System.out.println("nhap cau hoi thu: "+ i);
        String question = scanner.nextLine();
        questionBool.add(question);
    }
    Collection.shuffle(questionBool);

    for (String qu:questionBool)
}

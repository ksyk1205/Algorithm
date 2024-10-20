package codingtest.baekjoon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Member {

  int age;
  String name;


  public Member(int age, String name) {
    this.age = age;
    this.name = name;
  }

}

public class SortByAge {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    List<Member> members = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      int age = sc.nextInt();
      String name = sc.next();
      members.add(new Member(age, name));
    }

    members.sort(Comparator.comparingInt(m -> m.age));

    for (Member member : members) {
      System.out.println(member.age + " " + member.name);
    }
  }

}

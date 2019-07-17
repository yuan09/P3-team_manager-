package com.Tdsson.service;

import com.Tdsson.bean.Employee;
import com.Tdsson.bean.PC;
import com.Tdsson.bean.Programmer;

public class TeamService {
    private  int counter = 1;//唯一ID自增
    private  final int MAX_MENMBER = 5;//开发团队最大成员数
    Programmer[] team = new Programmer[MAX_MENMBER];//保存团队各成员对象
    private  int total = 0;//记录团队成员实际人数

    //返回当前团队所有对象
    public  Programmer[] getTeam(){
        team[0] = new Programmer(1,"唐德松",21,5000,new PC("1","2"));
        return team;
    }
   //向团队中添加成员 异常添加失败
//    public  void addMember(Employee e) throws TeamException{
//
//    }
//    //从团队中删除成员 异常删除失败
//    public  void removeMember(int memberId) throws TeamException{}

}

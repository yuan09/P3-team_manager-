package com.Tdsson.view;

import com.Tdsson.bean.Employee;
import com.Tdsson.bean.Programmer;
import com.Tdsson.service.NameListService;
import com.Tdsson.service.TeamService;
import com.Tdsson.util.TSUtility;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

public class TeamView {
    static NameListService listSvc = new NameListService();
    static TeamService teamSvc = new TeamService();//供类中方法使用

    public static void main(String[] args) {
        enterMainMenu();
    }
    //主界面显示及控制方法
    public static void enterMainMenu() {
        System.out.println("-------------------------------------开发团队调度软件--------------------------------------");
        listAllEmployees();
        while (true) {
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println(" 1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：_");

            char select = TSUtility.readMenuSelection();
            switch (select) {
                case '1':
                    listAllMembers();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.println("请确认是否退出(Y/N):_");
                    char quit = TSUtility.readConfirmSelection();
                    if (quit == 'Y') {
                        System.exit(0);
                    }
                    break;
            }
        }
    }
    //以表格形式列出公司所有成员
    public static void listAllEmployees() {
        System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备\n");
        Employee[] employees = listSvc.getAllEmployees();

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    //以表格形式列出团队成员
    public static void listAllMembers(){
        System.out.println("TDI/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票\n");
        Programmer[] team = teamSvc.getTeam();
       for(int i =0;i<team.length;i++){
           System.out.println((i+1)+team[i].memberInfo());
       }
    }
    //实现添加成员操作
    public static void addMember() {
        System.out.println("---------------------添加成员---------------------");
        System.out.println("请输入要添加的员工ID：");
        int empid = TSUtility.readInt();


//        添加成功
//        按回车键继续...

    }
    //实现删除成员操作
    public static void deleteMember() {

    }
}




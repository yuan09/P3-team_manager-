package com.Tdsson.view;

import com.Tdsson.bean.Employee;
import com.Tdsson.service.NameListService;
import com.Tdsson.service.TeamService;
import com.Tdsson.util.TSUtility;

public class TeamView {
    static NameListService listSvc = new NameListService();
    static TeamService teamSvc = new TeamService();//供类中方法使用

    //主界面显示及控制方法
    public static void enterMainMenu(){
        while(true) {
            System.out.println("-------------------------------------开发团队调度软件--------------------------------------");
            System.out.println("ID     姓名      年龄    工资      职位      状态      奖金      股票    领用设备\n");
            listAllEmployees();
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println(" 1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：_");

            char select = TSUtility.readMenuSelection();
            switch (select){
                case '1':
                    listAllEmployees();
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
                    if(quit == 'Y') {
                        System.exit(0);
                    }
                    break;
            }
        }
    }
    //以表格形式列出公司所有成员
    public static void listAllEmployees(){
        Employee[] employees = listSvc.getAllEmployees();
        for (Employee employee:employees){
            System.out.println(employee);
        }
    }
    //实现添加成员操作
    public static void addMember(){
        System.out.println("---------------------添加成员---------------------");
        System.out.println("请输入要添加的员工ID：");
        int empid = TSUtility.readInt();


//        添加成功
//        按回车键继续...

    }
    //实现删除成员操作
    public static void deleteMember(){

    }

    public static void main(String[] args) {
        enterMainMenu();
    }
}


package org.project.controller;

import java.util.Scanner;

import org.project.commend.ActionDelete;
import org.project.commend.ActionInsert;
import org.project.commend.ActionSelect;
import org.project.commend.ActionUpdate;
import org.project.commend.ExcuteCommend;

public class ActionController {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		
		ExcuteCommend d1 = new ActionDelete();
		d1.excuteQuery();
		
		ActionDelete d2 = new ActionDelete();
		
		while(true) {
			System.out.println("�������� �Է����ּ��� (insert, select, update, delete)");
			String query = scn.next();
			
			if(query.equals("insert")) {
				ActionInsert insert = new ActionInsert();
				insert.excuteQuery();
			}else if(query.equals("select")) {
				ActionSelect select = new ActionSelect();
				select.excuteQuery();
			}else if(query.equals("update")) {
				ActionUpdate update = new ActionUpdate();
				update.excuteQuery();
			}else if(query.equals("delete")) {
				ActionDelete delete = new ActionDelete();
				delete.excuteQuery();
			}else if(query.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			}else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			
//			switch(query) {
//			case "insert":
//				ActionInsert insert = new ActionInsert();
//				insert.excuteQuery();
//				break;
//			case "select":
//				ActionSelect select = new ActionSelect();
//				select.excuteQuery();
//				break;
//			case "update":
//				ActionUpdate update = new ActionUpdate();
//				update.excuteQuery();
//				break;
//			case "delete":
//				ActionDelete delete = new ActionDelete();
//				delete.excuteQuery();
//				break;
//			case "exit":
//				System.out.println("�����մϴ�.");
//				return;
//			default :
//				System.out.println("�ٽ� �Է����ּ���");
//				break;
//			}
			
		}
//		scn.close();
		
		
	}
}

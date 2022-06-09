package d0608_05_Switch;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		
		String kind = null;
	    String bio = sc.next();
	    
	    switch(bio) {
	    case "호랑이" : case "사자" : case "개" : kind = "포유류" ; break;
	    case "독수리" : case "참새" : case "딱따구리" : kind = "조류" ; break;
	    case "고등어" : case "참치" : case "연어" : kind = "어류" ; break;
	    default : System.out.println("모름"); kind = "....";
	    
	    
	    }
	    System.out.println(bio + "," + kind);
	   
	}

}

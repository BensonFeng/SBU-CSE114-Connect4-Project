//111311006
package project;
import java.util.Scanner;

public class part1 {
	
	public static boolean check(char[][] p) {//check if horizontal is 4
		int counterR = 0;
		int counterY = 0;
		int diag1=0;
		for (int i = 0; i<=5; i++) {
			counterR=0;
			counterY=0;
			for (int j = 0; j<=6; j++) {
				if (p [i][j]=='R' ) {
					counterR++;
					if (counterR==4) {
						return true;
					}
				}
				else
					counterR = 0;
				
				if (p [i][j]=='Y' ) {
					counterY++;
					if (counterY==4) {
						return true;
					}
				}
				else 
					counterY=0;
			}
		}
		
		for (int i = 0; i<=6; i++) {//check vertical
			counterR=0;
			counterY=0;
			for (int j = 0; j<=5; j++) {
				if (p [j][i]=='R' ) {
					counterR++;
					if (counterR==4) {
						return true;
					}
				}
				else
					counterR = 0;
				
				if (p [j][i]=='Y' ) {
					counterY++;
					if (counterY==4) {
						return true;
					}
				}
				else 
					counterY=0;
			}
		}
		
		counterR = 0;
		counterY = 0;
		for(int j=0; j<=3; j++) {//1
			int i=j+2;
		
			if (p [i][j]=='R' ) {
				counterR++;
				if (counterR==4) {
					return true;
				}
			}
			else
				counterR = 0;
			
			if (p [i][j]=='Y' ) {
				counterY++;
				if (counterY==4) {
					return true;
				}
			}
			else 
				counterY=0;
		}
		
		
		counterR = 0;
		counterY = 0;
		for(int j=0; j<=4; j++) {//2
			int i=j+1;
		
			if (p [j][j]=='R' ) {
				counterR++;
				if (counterR==4) {
					return true;
				}
			}
			else
				counterR = 0;
			
			if (p [i][j]=='Y' ) {
				counterY++;
				if (counterY==4) {
					return true;
				}
			}
			else 
				counterY=0;
		}
		
		counterR = 0;
		counterY = 0;
		for(int j=0; j<=5; j++) {//3
			int i=j;
		
			if (p [i][j]=='R' ) {
				counterR++;
				if (counterR==4) {
					return true;
				}
			}
			else
				counterR = 0;
			
			if (p [i][j]=='Y' ) {
				counterY++;
				if (counterY==4) {
					return true;
				}
			}
			else 
				counterY=0;
		}
		
		counterR = 0;
		counterY = 0;
		for(int j=1; j<=6; j++) {//4
			int i=j-1;
		
			if (p [i][j]=='R' ) {
				counterR++;
				if (counterR==4) {
					return true;
				}
			}
			else
				counterR = 0;
			
			if (p [i][j]=='Y' ) {
				counterY++;
				if (counterY==4) {
					return true;
				}
			}
			else 
				counterY=0;
		}
		
		counterR = 0;
		counterY = 0;
		for(int j=2; j<=6; j++) {//5
			int i=j-2;
		
			if (p [i][j]=='R' ) {
				counterR++;
				if (counterR==4) {
					return true;
				}
			}
			else
				counterR = 0;
			
			if (p [i][j]=='Y' ) {
				counterY++;
				if (counterY==4) {
					return true;
				}
			}
			else 
				counterY=0;
		}
		
		
		counterR = 0;
		counterY = 0;
		for(int j=3; j<=6; j++) {//6
			int i=j-3;
		
			if (p [i][j]=='R' ) {
				counterR++;
				if (counterR==4) {
					return true;
				}
			}
			else
				counterR = 0;
			
			if (p [i][j]=='Y' ) {
				counterY++;
				if (counterY==4) {
					return true;
				}
			}
			else 
				counterY=0;
		}
		
		
		
		
		
		//////////////////////////////////
		
		counterR = 0;
		counterY = 0;
		for(int j=0; j<=3; j++) {//1
			int i=3-j;
		
			if (p [i][j]=='R' ) {
				counterR++;
				if (counterR==4) {
					return true;
				}
			}
			else
				counterR = 0;
			
			if (p [i][j]=='Y' ) {
				counterY++;
				if (counterY==4) {
					return true;
				}
			}
			else 
				counterY=0;
		}
		
		
		counterR = 0;
		counterY = 0;
		for(int j=0; j<=4; j++) {//2
			int i=4-j;
		
			if (p [j][j]=='R' ) {
				counterR++;
				if (counterR==4) {
					return true;
				}
			}
			else
				counterR = 0;
			
			if (p [i][j]=='Y' ) {
				counterY++;
				if (counterY==4) {
					return true;
				}
			}
			else 
				counterY=0;
		}
		
		counterR = 0;
		counterY = 0;
		for(int j=0; j<=5; j++) {//3
			int i=5-j;
		
			if (p [i][j]=='R' ) {
				counterR++;
				if (counterR==4) {
					return true;
				}
			}
			else
				counterR = 0;
			
			if (p [i][j]=='Y' ) {
				counterY++;
				if (counterY==4) {
					return true;
				}
			}
			else 
				counterY=0;
		}
		
		counterR = 0;
		counterY = 0;
		for(int j=1; j<=6; j++) {//4
			int i=6-j;
		
			if (p [i][j]=='R' ) {
				counterR++;
				if (counterR==4) {
					return true;
				}
			}
			else
				counterR = 0;
			
			if (p [i][j]=='Y' ) {
				counterY++;
				if (counterY==4) {
					return true;
				}
			}
			else 
				counterY=0;
		}
		
		counterR = 0;
		counterY = 0;
		for(int j=2; j<=6; j++) {//5
			int i=7-j;
		
			if (p [i][j]=='R' ) {
				counterR++;
				if (counterR==4) {
					return true;
				}
			}
			else
				counterR = 0;
			
			if (p [i][j]=='Y' ) {
				counterY++;
				if (counterY==4) {
					return true;
				}
			}
			else 
				counterY=0;
		}
		
		
		counterR = 0;
		counterY = 0;
		for(int j=3; j<=6; j++) {//6
			int i=8-j;
		
			if (p [i][j]=='R' ) {
				counterR++;
				if (counterR==4) {
					return true;
				}
			}
			else
				counterR = 0;
			
			if (p [i][j]=='Y' ) {
				counterY++;
				if (counterY==4) {
					return true;
				}
			}
			else 
				counterY=0;
		}
		
		
		return false;
	}

	public static void main(String[] args) {
		
		char [][]x=new char[6][7];
		for (int i = 0; i<=5 ; i++) {
			for (int j = 0; j<=6; j++) {
				x [i][j]=' ';
			}
		}
		anything(x);
		Scanner input =  new Scanner(System.in);
		boolean w = true;
		while (w){
			System.out.print("Player red input put in which column ");//
			boolean waiting=true;
			int red = -1;
			while (waiting) 
			{
				try {
					red = input.nextInt();
					if (red < 0 || red >= 7 || x[0][red]!=' ')
						throw new Exception();
					waiting=false;
				}
				catch(Exception e) {
					System.out.println("Invalid input");
				}
			}
			for (int i = 5; i>=0 ; i--) {
				if (x[i][red]==' ')
				{	
					x[i][red]= 'R';
					break;
				}
			}
			anything(x);
			if(check(x)){
				System.out.print("WINNER RED PLAYER");
				break;	
			}
			
			System.out.print("Player yellow input put in which column ");
			
			waiting=true;
			int yellow = -1;
			while (waiting) 
			{
				try {
					yellow = input.nextInt();
					if (yellow < 0 || yellow >= 7 || x[0][yellow]!=' ')
						throw new Exception();
					waiting=false;
				}
				catch(Exception e) {
					System.out.println("Invalid input");
				}
			}
			for (int i = 5; i>=0 ; i--) {
				if (x[i][yellow]==' ')
				{	
					x[i][yellow]= 'Y';
					break;
				}
			}
			anything(x);
			if(check(x)){
				System.out.print("WINNER YELLLOW PLAYER");
				break;	
			}
		}//close while loop
	}
	
	public static void anything(char [][] x) {
		System.out.print(" 0 1 2 3 4 5 6 ");

		System.out.println();
		for (int i = 0; i<=5 ; i++) {
			System.out.print("|");
			for (int j = 0; j<=6; j++) {
				System.out.print(x[i][j]+ "|");
			}
			System.out.println();

		}
		System.out.println("_______________\n\n");
	}

}

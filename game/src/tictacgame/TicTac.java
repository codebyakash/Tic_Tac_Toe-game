package tictacgame;
import java.util.Scanner;
import java.util.ArrayList;
public class TicTac {
	    public static void main(String[] args) {
	        char a='1',b='2',c='3',d='4',e='5',f='6',g='7',h='8',i='9';
	        char player = 'X';
	        ArrayList<Integer> al = new ArrayList<>(); 
	        try (Scanner sc = new Scanner(System.in)) {
				while(true) {
				System.out.println("\n**** TIC-TAC-TOE ****");
				System.out.printf(" %c | %c | %c \n",a,b,c);
				System.out.println("------------");
				System.out.printf(" %c | %c | %c \n",d,e,f);
				System.out.println("------------");
				System.out.printf(" %c | %c | %c \n",g,h,i);
				System.out.printf("\n\nEnter Value For Player %c : ",player);
				int value = sc.nextInt();
				if((!al.contains(value))&&((value>0)&&(value<10))) {
				    al.add(value);
				switch(value) {
				case 1: 
				    a=player;
				    break;
				case 2: 
				    b=player;
				    break;
				case 3: 
				    c=player;
				    break;
				case 4: 
				    d=player;
				    break;
				case 5: 
				    e=player;
				    break;
				case 6: 
				    f=player;
				    break;
				case 7: 
				    g=player;
				    break;
				case 8: 
				    h=player;
				    break;
				case 9: 
				    i=player;
				    break;
				}
				if((a==b&&b==c)||(d==e&&e==f)||(g==h&&h==i)||(a==d&&d==g)||(b==e&&e==h)||(c==f&&f==i)||(a==e&&e==i)||(c==e&&e==g)) {
				    System.out.printf("\n\n%c PLAYER WIN\nCONGRATULATIONS!\n",player);
				    System.out.printf("\n %c | %c | %c \n",a,b,c);
				    System.out.println("------------");
				    System.out.printf(" %c | %c | %c \n",d,e,f);
				    System.out.println("------------");
				    System.out.printf(" %c | %c | %c \n",g,h,i);
				    break;
				}
				if(player=='X')
				    player='0';
				else
				    player='X';
				}else {
				    System.out.println("Already Used!, Select Anything Else!");
				}
				if(al.size()==9) {
				    System.out.println("Non One is Wining Please Restart!");
				    break;
				}
				}
			}catch(Exception e1) {
				e1.printStackTrace();
			}
	    }
	}

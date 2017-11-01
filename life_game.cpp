#include <clocale>
#include <ncurses.h>
#include <iostream>
#include <fstream>
#include <string>
using namespace std;
int main(int argc, char* argv[])
{


		std::ifstream inStream; 
		inStream.open(argv[1]);
		int row,col;
		char a[100][100];
		char day6[100][100];
	
		inStream >>row>>col;
		for(int i = 0; i<row; i++){
			for(int j = 0; j<col; j++){
				inStream >> a[i][j];	
}}
		int X=2,Y=3;	
		WINDOW *win1;

		if (argc != 2)
		{
			std::cout << "Usage: life <0th_gen.txt>" << std::endl;
			return	-1;
		}
		setlocale(LC_CTYPE, "");		// for using UNICODE
		initscr();	
		start_color();
		erase();
		resize_term(256, 256);			// large enough term size
		init_pair(1, COLOR_WHITE, COLOR_BLACK);
		init_pair(2, COLOR_RED, COLOR_BLACK);
		char ch;	
	while (true)
		{
		win1 = newwin(row+4,col*2+3,0,0);
		wbkgd(win1,COLOR_PAIR(1));
		wattron(win1,COLOR_PAIR(1));
		//print state
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){				
				if (a[i][j] == 'O'){mvwprintw(win1, i + 3, (2)*j + 2, "\u2B1B");}
				else{mvwprintw(win1, i + 3, (2)*j + 2, "\u2B1C");}
			}} 	
		wborder(win1,'|','|','-','-','+','+','+','+');
		wrefresh(win1);
		wattroff(win1,COLOR_PAIR(1));
		wattron(win1,COLOR_PAIR(2));
		mvwprintw(win1,Y,X,"\uFFA0");
		move(Y,X);
		wrefresh(win1);	
		wattroff(win1,COLOR_PAIR(2));
		
		curs_set(1);
		ch = getch();
		noecho();

		if (ch == 'q' || ch == 'Q') { break; } //game finish
		//move up
		else if (((ch == 'j' || ch == 'J')) && (Y>=3) && (Y<2+col))	
		{
			Y= Y+1;			
			move(Y,X);	
		}
		//move down
		else if(((ch == 'k' || ch == 'K')) && Y>3 && Y<=2+col)
		{		 
			Y=Y-1;
			move(Y,X);					
		}
		//move left
		else if((ch == 'h' || ch == 'H') && X>=4 && X<=2*row)
		{
			X = X-2;
			move(Y,X);	
		}
		//move right
		else if((ch == 'l' || ch == 'L') && X>=2 && X<2*row)
		{	X= X+2;	
			move(Y,X);			
		}
		//game save(file)
		else if(ch =='S'||ch=='s'){
			char save[512];

			clear();
			echo();
			printw("save file: ");
			getstr(save);
			ofstream k;
			k.open(save);
			for(int i = 0; i<row; i++){
			for(int j = 0; j<col; j++){
			k<<a[i][j];	}k<<endl;}
			
			for(int i=0; i<row; i++){
				for (int j = 0; j < col; j++) {
					if (a[i][j] == 'O'){mvwprintw(win1, i + 3, (2)*j + 2, "\u2B1B");}
					else{mvwprintw(win1, i + 3, (2)*j + 2, "\u2B1C");}}}	
			wborder(win1,'|','|','-','-','+','+','+','+');
			wrefresh(win1);						
			move(Y,X);}
		//update to next state
		else if(ch =='n'|| ch == 'N'){	
			for (int i = 0; i < row; i++)
				{
				for (int j = 0; j < col; j++)
					{
					int b = 0;
					if (a[i-1][j-1]=='O') 
						b= b+1;
					if (a[i-1][j]=='O') 
						b= b+1;
					if (a[i-1][j+1]=='O') 
						b= b+1;
					if (a[i][j-1]=='O') 
						b= b+1;
					if (a[i][j+1]=='O') 
						b= b+1;
					if (a[i+1][j-1]=='O') 
						b= b+1;
					if (a[i+1][j]=='O') 
						b= b+1;
					if (a[i+1][j+1]=='O') 
						b= b+1;
            
					if ((b <=1)||(b>=4)) //if 1 or 4(or more) neighbor alive now, this cell will die. 
						day6[i][j] = 'X';
					else if ((a[i][j] == 'O' && (b == 2 || b == 3))||(a[i][j] == 'X' && b== 3)) //condition for live
						day6[i][j] = 'O';
					else
						day6[i][j] = 'X';}}
					//read again
					for (int m = 0; m < row; m++){
						for (int n = 0; n < col; n++)
							{a[m][n] = day6[m][n];}}
					for(int i=0; i<row; i++){
						for(int j=0; j<col; j++){
							if (a[i][j] == 'O'){mvwprintw(win1,i+3,(2)*j+2,"\u2B1B");}
							else{mvwprintw(win1,i+3,(2)*j+2,"\u2B1C");}}}}

		//state change							
		else if(ch == 'T'|| ch=='t'){
			if(a[Y-3][X/2-1] =='O'){a[Y-3][X/2-1] = 'X';}
			else {a[Y-3][X/2-1] = 'O';}
			for(int i=0; i<row; i++){
				for(int j=0; j<col; j++){
					if (a[i][j] == 'O'){mvwprintw(win1,i+3,(2)*j+2,"\u2B1B");}
					else{mvwprintw(win1,i+3,(2)*j+2,"\u2B1C");}}}    
	
		wrefresh(win1);}}
		endwin();
		return 0;
		}

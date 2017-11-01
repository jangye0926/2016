//print calender
#include <iostream>
#include <fstream>
#include <cstdlib>
using namespace std;

int main(void)
{
 ifstream inStream;
 int numTestCases;

 inStream.open("input.txt");          /*open input file */

 if (inStream.fail())
 {
  cerr << "Input file opening failed.|n";
  exit(1);
 }

 inStream >> numTestCases;              /*read the number of test case*/


 for (int i = 0; i < numTestCases; i++)
 {
int y,m;
inStream >> y; //year
inStream >> m; //month
int A,day6;

A=(y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400+1;
day6 = 0;
for (int j =1; j<m; j++){
	if((j== 1)||(j== 3)||(j== 5)||(j==7)||(j==8)||(j==10)||(j==12))
		{A += 31;}
	else if (j==2){
		if(((y%4 == 0)&&(y%100 !=0))||((y%4 == 0)&&(y%400 == 0)))
			{A += 29;}            //leap year
		else
			{A += 28;}
	}           //general year
	else{
		A += 30;}
}
//day calculation
if((m== 1)||(m== 3)||(m== 5)||(m==7)||(m==8)||(m==10)||(m==12))
	{day6 =31;}
else if (m==2){
	if(((y%4 == 0)&&(y%100 !=0))||((y%4 == 0)&&(y%400 == 0)))
		{day6=29;}            //leap year
	else
		{day6=28;}}           //gerneral year
else{
	 day6 = 30;}

cout<<y<<" " <<m;

A%=7; //start day
//print calender
for(int k=-A;k<day6;k++)
    {
        if((k+A)%7 == 0) 
            cout<<"\n";
        if(k<0) 
            cout<<"0"<<" ";
        else 
            cout<<k+1<<" ";
    }
if((day6 + A)%7 == 1)
	cout<<"0"<<" "<<"0"<<" "<<"0"<<" "<<"0"<<" "<<"0"<<" "<<"0";
else if((day6 + A)%7 == 2)
	cout<<"0"<<" "<<"0"<<" "<<"0"<<" "<<"0"<<" "<<"0";
else if((day6 + A)%7 == 3)
	cout<<"0"<<" "<<"0"<<" "<<"0"<<" "<<"0";
else if((day6 + A)%7 == 4)
	cout<<"0"<<" "<<"0"<<" "<<"0";
else if((day6 + A)%7 == 5)
	cout<<"0"<<" "<<"0";
else if((day6 + A)%7 == 6)
	cout<<"0";
else
	cout<<" ";

cout<<endl;}}

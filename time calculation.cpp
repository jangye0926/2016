/*문제 : time caculatio
#include <fstream>
#include <cstdlib>

using namespace std;

int main(void)
{
	ifstream inStream;
	int numTestCases;
	
	inStream.open("input.txt");          /*open input file */
    
	if(inStream.fail())
{
		cerr << "Input file opening failed.|n";
		exit(1);
}

	inStream >> numTestCases;              /*read the number of test case*/
			
	for (int i=0; i<numTestCases; i++)
		{
			int numdata;
				inStream >> numdata;
				int sum =0;
				
			int H,M,S,h,m,s;	
			int a,b,c,d,e,f,g;
			a,b,c,d,e,f= 0;
		
			for (int j=0; j<numdata; j++){
				inStream >> H;
				inStream >> M;
				inStream >> S;
				inStream >> h;
				inStream >> m;
				inStream >> s;							
				a = H*3600+M*60+S;
				b = h*3600+m*60+s;
				c = b-a;
				sum+=c;
			}

				d = sum/3600;                        /*hour*/
				e = (sum-d*3600)/60;                 /*minute*/
				f = sum-d*3600-e*60;                 /*sec*/
				if (sum>24*3600){
					g= d/24;
					d = d%24;}
					else                             /*day*/
					g =0;
		
				
		std::cout<<g<< " " <<d<< " " <<e<< " " <<f<< std::endl;		}}
		





#include<iostream>
using namespace std;

void base(int decimal)
{
     if(decimal==0)
     {
       return 0;
       }
     int binary = decimal% 3;
    decimal/= 3;
    if (binary < 0)
    {
        decimal += 1;
    }
     base(decimal);
     cout<< binary < 0 ? binary+ (3 * -1) : binary;
     return;
     }
     int main()
     {
         int value;
         cin>>value;
         base(value);
         return 0;
       }

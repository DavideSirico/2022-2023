#include <iostream>
#include <iomanip>

using namespace std;

void Clear()
{
#if defined _WIN32
    system("cls");
    //clrscr(); // including header file : conio.h
#elif defined (__LINUX__) || defined(__gnu_linux__) || defined(__linux__)
    system("clear");
    //std::cout<< u8"\033[2J\033[1;1H"; //Using ANSI Escape Sequences 
#elif defined (__APPLE__)
    system("clear");
#endif
}

void print_triangle(int n)
{
    cout << setw(n + 10) << "*" <<  endl;
    cout << setw(n + 9) << "*" << setw(2) << "*" <<  endl;
    cout << setw(n + 8) << "*" << setw(4) << "*" <<  endl;
    cout << setw(n + 7) << "*" << setw(6) << "*" <<  endl;
    cout << setw(n + 6) << "*" << setw(8) << "*" <<  endl;
    cout << setw(n + 5) << "*" << setw(10) << "*" <<  endl;
    cout << setw(n + 4) << "*" << setw(12) << "*" <<  endl;
    cout << setw(n + 3) << "*" << setw(14) << "*" <<  endl;
    cout << setw(n + 2) << "*" << setw(16) << "*" <<  endl;
    cout << setfill('*') << setw(19) << "*" << endl;
}

void clear_screen()
{
    cout << string( 100, '\n' );
}
int main()
{	
    // cout<<""<<"          _.-\^\^---....,,--"<<endl<<"      _--                  --_  "<<endl<<"     <                        >) "<<endl<<"     |                         | "<<endl<<"      \\._                   _./  "<<endl<<"         ```--. . , ; .--'''     "<<endl<<"                 | |   |             "<<endl<<"            .-=||  | |=-.   "<<endl<<"            `-=#$%&%$#=-'   "<<endl<<"               | ;  :|     "<<endl<<"      _____.,-#%&$@%#&#~,._____\n\n\n"<<endl;
    /*cout <<R"(     _.-^^---....,,--       
 _--                  --_  
<                        >)
|                         | 
 \._                   _./  
    ```--. . , ; .--'''       
          | |   |             
       .-=||  | |=-.   
       `-=#$%&%$#=-'   
          | ;  :|     
 _____.,-#%&$@%#&#~,._____)"<<endl;*/
    // Clear();
    char ch = 'a';
    int n = 0;
    while(ch == 'a' || ch == 'd'){
        clear_screen();
        print_triangle(n);
        cout << "Enter: 'a' move left, 'd' move right" << endl;
        cin >> ch;

        if(ch == 'a'){
            n++;
        } else if(ch == 'd'){
            n--;
        }
    }
	return 0;
}

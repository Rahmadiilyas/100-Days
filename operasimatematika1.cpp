#include <iostream>
using namespace std;
int main(){
    //Mendeklarasikan variabel x (diisi nilai 10)
    // dan y (diisi nilai 3)
    int x = 10;
    int y = 3;
    int z; // Mendeklarasikan variabel z sebagai penampung nilai operasi 
   
    // melakukan operasi pembagian dan menyimpan sisa baginya kedalam z 
    z = x%y; 
    cout<<x<<" % "<<y<<" = "<<z; //Menampilkan sisa bagi dari operasi pembagian x/y

    return 0;
}
#include <iostream>
using namespace std;

int main() {
    int a = 10;
    int b = 20;
    int sum = a + b;

    cout << "a = " << a << ", at address: " << &a << endl;
    cout << "b = " << b << ", at address: " << &b << endl;
    cout << "sum = " << sum << ", at address: " << &sum << endl;

    return 0;
}
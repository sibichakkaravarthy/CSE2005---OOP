#include <stdint.h>
#include <stdio.h>

void show_info(double d, int16_t n);

int main() {
    double d1 = 32767.0;
   double d2 = 34900.0;
    int16_t n = 0;

    show_info(d1, n);
   show_info(d2, n);

    return 0;
}

void show_info(double d, int16_t n) {
    n = (int16_t)d;

    printf("d = %f, n = %d \n", d, n);
}

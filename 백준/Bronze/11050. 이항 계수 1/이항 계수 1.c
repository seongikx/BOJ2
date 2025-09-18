#include <stdio.h>

int main(void)
{
  long long a , b = 0;

  scanf("%lld",&a);
  scanf("%lld",&b);

  long long f_a =1, f_b =1, f_c= 1;
  long long c = a - b;

  while(a>0)
  {
    f_a *= a;
    a--;
  }
  while(b>0)
  {
    f_b *=b;
    b--;
  }
  while(c>0)
  {
    f_c *=c;
    c--;
  }
  printf("%lld",(f_a)/(f_b*f_c));

}
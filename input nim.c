#include <stdio.h>
#include <string.h>
#include <ctype.h>   
#include <stdbool.h>

int main(int argc, char** argv)
{
	char cek, innim[25];
	
	printf("\n=Input NIM=\n");
	printf("*panjang nim harus 15 yak\n");
	while(0 < 1)
	{
	printf("\nMasukkan Nim : ");
  	scanf("%s", innim);
	if(strlen(innim) >20){
	   		cek = false;
		   
	}
	else if(strlen(innim) >= 16)
	{	
			  	
		   printf("Terlalu panjang :)\n");
		   continue;	
	}
	else if(strlen(innim) >14 ){
		cek = false;
		printf("Yeay nim anda : %s\n", innim);
		break;
	}
	else
	{
		printf("nim kurang panjang:( \n");
		continue;
	}
	
	
}
return 0;
}

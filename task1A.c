#include <stdio.h>

int main(){
	int arr[]= {1, 2, 3, 4, 5, 6, 7, 8, 9};
	int i=0, ganjil=0, genap=0, total=0;

	
	while(i < 9){
		if(arr[i]%2 == 0) {
			genap++;
		}
		if(arr[i]%2 != 0){
			ganjil++;
		}
		total =+ arr[i];
		i++;
	} 
	
	printf("jumlah bilangan ganjil = %d\n", ganjil);
	printf("jumlah bilangan genap = %d\n", genap);
	printf("total = %d\n", total);
	return 0;
}

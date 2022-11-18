#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){
	srand(time(NULL));
	FILE *fp;
	fp=fopen("file.txt","w");
	if(fp==NULL){
		printf("errore nell'apertura del file");
	}
	int arr[50];
	int i;
	int num_ran;
	int flag;
	for(i=0;i<50;i++){
		flag=0;
		num_ran=rand()%48+2;
		for(int j=0;j<i;j++){
			if(num_ran==arr[j]){
				flag++;
			}
		}
		if(flag==0){
			arr[i]=num_ran;
			fprintf(fp,"%d ",num_ran);
		}
	}

	fclose(fp);
	return 0;
}

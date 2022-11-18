#include <stdio.h>

int main(){
	FILE *input;
	FILE *output;
	input=fopen("input.txt","r");
	output=fopen("output.txt","w");
	
	if(input==NULL || output==NULL){
		printf("Errore d'apertura");
	}
	char dummy;
	while((dummy=fgetc(input))!=-1){
		
		if(dummy>='A' && dummy<='Z'){
			dummy=dummy+32;
		} else if(dummy>='a' && dummy<='z'){
			dummy=dummy-32;
		}
		fprintf(output,"%c",dummy);
		
	}

	fclose(input);
	fclose(output);

	return 0;
}

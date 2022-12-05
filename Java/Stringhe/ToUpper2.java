class ToUpper2{
	public static void main(String[] args){
		String stringa = "proA_123a";
		char[] tempStringa = new char[stringa.length()];
		int i;
		for(i=0;i<stringa.length();i++){
			tempStringa[i]=stringa.charAt(i);
			if(tempStringa[i]>='a' && tempStringa[i]<='z'){
				tempStringa[i]-=32;
			}
		}
		System.out.println(stringa);
		System.out.println(tempStringa);
	}
}

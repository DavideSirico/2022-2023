//2) Reverse di una stringa
class ReverseString{
	public static void main(String[] args){
		int i;
		String stringa = "Prova";
		int len = stringa.length();
 		char[] charArray = new char[len];

		for(i=0;i<len;i++){
			charArray[i]=stringa.charAt(len-1-i);
		}
		System.out.println(stringa);
		System.out.println(charArray);
	}
}

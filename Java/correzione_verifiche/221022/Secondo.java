class Secondo{
	public static void main(String[] args){
		//if(args.length()==0){
        if(args.length==0){
			System.out.println("Non ci sono argomenti");
		} else {
			//System.out.print("Ci sono "+args.length()+"argomenti: ");
			System.out.print("Ci sono "+args.length+" argomenti: ");
			//for(int i=0;i<args.length();i++){
			for(int i=0;i<args.length;i++){
				System.out.print(args[i]+" ");
			}
		}
	}
}

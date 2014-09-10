class VirusLab {
	public static void main(String[] args) {
		int numViruses = Integer.parseInt(args[0]);
		if (numViruses >0) {
			Virus[] virii = new Virus[numViruses];
			for (int i = 0; i < numViruses; i++) {
				virii[i] = new Virus();
			}
			
			System.out.println("there are " + Virus.getVirusCount() + " viruses.");
			for (int i = 0; i < numViruses; i++) {
				System.out.println(virii[i].getName());
			}
			Virus.changeName("dewie");
			for (int i = 0; i < numViruses; i++) {
				System.out.println(virii[i].getName());
			}
		}
	}
}
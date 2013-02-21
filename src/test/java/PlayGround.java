public class PlayGround {

		
		public void verifyClickOnReferencesButtonShowsReferencesList (String referenceItems) throws Exception {	
			System.out.println(referenceItems);
			String[] referenceList =referenceItems.split(";");
			System.out.println("splits.size: " + referenceList.length);

			for(String item: referenceList){
			System.out.println(item);
			}

		 }	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String referenceItems = "Scientific Notation;Periodic Table;Tables";
		PlayGround object = new PlayGround();
		object.verifyClickOnReferencesButtonShowsReferencesList(referenceItems);
	}

}

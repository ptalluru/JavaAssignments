
public class ArrayOccurenceOfElements {

	public int countOccurrence(String[] names, String string) {
		int count=0;
		for(int i=0;i<names.length;i++){

			if(string.equals(names[i])){

				count++;

			}

		}
		return count;
	}

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsinArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,1,1,4,8,7,8)) ;
		
		//1.LinkedHast Set is used to remove duplicate elements in array list
		LinkedHashSet<Integer> withoutDuplicateElements= new LinkedHashSet<Integer>(list);
		
		//2.use array list to store uniqu elements
		ArrayList<Integer> uniqueList= new ArrayList<Integer>(withoutDuplicateElements);
		System.out.println(uniqueList);
		
		
		
		ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(1,1,1,4,8,7,8)) ;
		//Using Java stream JDK 8 onwards
		List<Integer> unique=list2.stream().distinct().collect(Collectors.toList());
		System.out.println(unique);
		
	}

}

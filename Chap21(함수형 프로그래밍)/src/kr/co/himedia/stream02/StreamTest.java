package kr.co.himedia.stream02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		
		Stream<Integer> numberStream = Stream.of(3,-5,7,10,-3);
		Stream<Integer> filterNumberStream = numberStream.filter(x -> x > 0 );
		List<Integer> filterdNumber = filterNumberStream.collect(Collectors.toList());
		System.out.println(filterdNumber);
		
		List<Integer> filterdNumber2 = Stream.of(3,-5,7,10,-3).filter(x -> x > 0 ).collect(Collectors.toList());
		System.out.println(filterdNumber2);
		
		System.out.println();
		
		
		User user1 = new User();
		user1.setId(101);
		user1.setName("P");
		user1.setVerified(true);
		user1.setEmailAddress("s@gmail.com");
		
		User user2 = new User();
		user2.setId(102);
		user2.setName("H");
		user2.setVerified(false);
		user2.setEmailAddress("h@gmail.com");
		
		User user3 = new User();
		user3.setId(103);
		user3.setName("A");
		user3.setVerified(true);
		user3.setEmailAddress("a@gmail.com");
		
		List<User> users = Arrays.asList(user1, user2, user3);
		List<User> VerifiedUsers = users.stream().filter(user -> user.isVerified()).collect(Collectors.toList());
		System.out.println(VerifiedUsers);
		
		
		List<User> users2 = Arrays.asList(user1, user2, user3);
		List<User> VerifiedUsersF = users2.stream().filter(user -> !user.isVerified()).collect(Collectors.toList());
		System.out.println(VerifiedUsersF);
		
		
		
				
	}
}
















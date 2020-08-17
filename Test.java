import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		String [] array = { "java", "Python","Oracle","java","Oracle","MariaDB"};
		Set<String> hashset = new HashSet<String>(); // �ߺ������ʰ� ������ ���ؼ� treeset���� ����
		Set<String> treeset = new TreeSet<String>(); // �ߺ������ʰ� ������ ������ �ڵ� ������ �ϴ� treeset
		
		for(String str : array) {
			hashset.add(str);
			treeset.add(str);
		}
		
		System.out.println(hashset);
		System.out.println(treeset);
	}
}
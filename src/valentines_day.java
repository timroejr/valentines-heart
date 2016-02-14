import org.apache.commons.lang3.StringUtils;
public class valentines_day {
	public static void main(String[] args) {
		int j = 5;
		String heart = "*****";
		for (int i = 0; i < 4; i++) {
			if (i == 0) {
				System.out.println("** **");
			} else {
				heart = heart.substring(0, j);
				System.out.print(StringUtils.center(heart, 5));
				System.out.print("\n");
				j = j - 2;
			}
		}
	}
}
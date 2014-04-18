public class TestCourse {

	public static void main(String[] args) {
		Course course = new Course();
		String edi = "R|U||1|15|A||||||4||NPF|560|Adv Top In Film Hist & Theory";
		String separator = "\\|";
		String xml = course.parseEdi(edi, separator);
		System.out.println("edi=" + edi);
		System.out.println("xml=" + xml);
	}

}

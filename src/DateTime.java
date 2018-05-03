
public class DateTime {

	public static void main(String[] args) {
		java.util.Date dt = new java.util.Date();
		java.text.SimpleDateFormat fdt = new java.text.SimpleDateFormat("dd/MM/yyyy hh: mm: ss a");
            System.out.println(fdt.format(dt));
	}

}

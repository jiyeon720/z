package Java;

public class JY {

	private int year;
	private int month;
	private int day;
	private String name;
	private String mm;
	
	public JY() {}

	public JY(int year, int month, int day,String name,String mm) {
		this.year =year;
		this.month = month;
		this.day=day;
		this.name=name;
		this.mm=mm;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMm() {
		return mm;
	}

	public void setMm(String mm) {
		this.mm = mm;
	}

	@Override
	public String toString() {
		return "JY [year=" + year + ", month=" + month + ", day=" + day + ", name=" + name + ", mm=" + mm + "]";
	}

	
	
	
}

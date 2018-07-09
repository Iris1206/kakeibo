package dto;

public class KakeiboDTO {
	private int id;
	private String naiyou;
	private int money;
	private String hantei;
	private int month;
	private int day;

	public KakeiboDTO(int id, String naiyou, int money, String hantei, int month, int day) {
		super();
		this.id = id;
		this.naiyou = naiyou;
		this.money = money;
		this.hantei = hantei;
		this.month = month;
		this.day = day;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaiyou() {
		return naiyou;
	}

	public void setNaiyou(String naiyou) {
		this.naiyou = naiyou;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getHantei() {
		return hantei;
	}

	public void setHantei(String hantei) {
		this.hantei = hantei;
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




}

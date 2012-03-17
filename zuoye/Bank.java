class Bank {
	String name;
	int money;

	Bank(String name_a, int money_n) {
		name = name_a;
		money = money_n;
	}

	void addMoney(int n) {
		money += n;
	}

	void decMoney(int n) {
		money -= n;
	}

	int retMoney() {
		return money;
	}

	public void printName() {
		System.out.println(name);
	}

	public static void main (String[] args) {
		Bank bk = new Bank("Lucy", 500);
		
		bk.addMoney(40);
		System.out.println(bk.name + " have money " + bk.retMoney());
		bk.decMoney(80);
		System.out.println(bk.name + " have money " + bk.retMoney());

	}
}

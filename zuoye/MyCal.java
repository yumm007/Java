class MyCal {
	static int n;
	
	static int sum() {
		return (1 + n) * (n / 2);
	}

	static double nn() {
		int j;
		double ret = 1;
		for (j = n; j > 1; j--)
				  ret *= j;
		return ret;
	}

	public static void main (String[] args) {
		MyCal.n = 100;
		System.out.println("getSum(" + MyCal.n + ") = " + MyCal.sum());
		MyCal.n = 8;
		System.out.println(MyCal.n + "! = " + MyCal.nn());
	}

}


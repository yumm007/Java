//编写一个MyMath类，具有low、high两个整数属性，
//添加两个构造方法，一个带一个整数参数，用于设置high的值，并将low设为1；
//              另一个带两个整数参数，用于设置low和high值。
//为该类添加两个sum()和product()两个方法，分别用于求low,low+1,…high-1,high的和与积
//并写好main方法测试该类。

class MyMath {
    int low;
    int high;

    MyMath(int h) {
	high = h;
	low = 1;
    }

    MyMath(int l, int h) {
	low = l;
	high = h;
    }
    
    private void check_low_high() {
	int tmp = low;
	if (low > high) {
	    low = high;
	    high = tmp;
	}
    }

    double sum(){
	check_low_high();
	return (low + high) * (high - low + 1)*0.5;
    }

    double product() {
	int i;
	double ret = 1;
	check_low_high();
	for (i = low; i <= high; i++)
	    ret *= i;
	return ret;
    }

    public static void main(String[] args) {
	MyMath a = new MyMath(100);
	System.out.println("low = " + a.low + "\thigh = " + a.high + 
			   "\tsum = "+ a.sum() + "\tproduct = " + a.product());
	a.high = 30;
	a.low  = 40;
	System.out.println("low = " + a.low + "\thigh = " + a.high + 
			   "\tsum = "+ a.sum() + "\tproduct = " + a.product());
    }
}
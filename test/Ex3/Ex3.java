class Ex3{

    String ret = "";
	public String ex3_0(int n){
    if (n > 0) {
      ret = "その値は正です";
    } else {
      ret = "その値は０か負です";
    }
		return ret;
	}

	public int ex3_1(int n){
		return Math.abs(n);
    }

	public String ex3_2(int a, int b){
    if (a % b == 0){
        ret = b + "は" + a + "の約数です";
    } else {
        ret = b + "は" + a + "の約数ではありません";
    }
		return ret;
	}

	public String ex3_3(int a, int b){
    if (a == b) {
        ret = "同じ値です";
    } else  if (a > b) {
        ret = a + "の方が大きいです";
    } else {
        ret = b + "の方が大きいです";
    
    }
		return ret;
	}

	public String ex3_4(int a){
    if (a < 0) {
        ret = "正でない整数値です";
    } else  if (a % 5 == 0) {
        ret = "その値は5で割り切れます";
    } else {
        ret = "その値は5で割り切れません";
    }
		return ret;
	}

	public String ex3_5(int a){
    if (a < 0) {
        ret = "正でない整数値です";
    } else  if (a % 10 == 0) {
        ret = "その値は10の倍数です";
    } else {
        ret = "その値は10の倍数ではありません";
    }
		return ret;
    }
	
	public String ex3_6(int a){
    if (a < 0) {
        ret = "正でない整数値です";
    } else  if (a % 3 == 0){
        ret = "その値は3で割り切れます";
    } else  if (a % 3 == 1){
        ret = "その値を3で割った余りは1です";
    } else {
        ret = "その値を3で割った余りは2です";
    }
		return ret;
	}

	public String ex3_7(int a){
    if (79 < a && a < 101) {
        ret = "優";
    } else  if (0 <= a && a <= 59) {
        ret = "不可";
    } else  if (60 <= a && a <= 69){
        ret = "可";
    } else  if (70 <= a && a <= 79){
        ret = "良";
    } else {
        ret = "範囲(0～100)外の値です";
    }
		return ret;
	}

	public double ex3_8(double a, double b){
    if (a > b) {
        return a;
    } else {
        return b;
    }
	}

	public int ex3_9(int a, int b){
    if (a > b) {
        return  a - b;
    } else {
        return a + b;
    }
	}

	public String ex3_10(int a, int b){
    int dif = 0;
    if (a > b) {
        dif = a - b;
    } else {
        dif = a + b;
    }
    if (dif <= 10) {
        ret = "それらの差は10以下です";
    } else {
        ret = "それらの差は11以上です";
    }
		return ret;
	}

	public int ex3_11(int a, int b, int c){
    if (a <= b && a <= c) {
        return a;
    } else if (b <= a && b <= c) {
        return b;
    } else {
        return c;
    }
	}

	public int ex3_12(int a, int b, int c){
    if (a >= b) {
        if (b >= c) {
            return b;
        } else if (a <= c){
            return a;
        } else {
            return c;
        }
    } else if (a > c) {
        return a;
    } else if (b > c) {
        return c;
    } else {
        return b;
    }
	}

	public String ex3_13(int a){
    if (a == 12 || 1 <= a && a <= 2) {
        ret = "冬";
    } else  if (3 <= a && a <= 5) {
        ret = "春";
    } else  if (6 <= a && a <= 8){
        ret = "夏";
    } else  if (9 <= a && a <= 11){
        ret = "秋";
    } else {
        ret = "範囲(1～12)外の値です";
    }
		return ret;
	}
}


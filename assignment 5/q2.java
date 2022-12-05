class rbi {
    private static double min_rate=5;
    private static double min_allowed_balance;


    static double show_rate(){
        return min_rate;
    }

    static double show_MB(){
        return min_allowed_balance;
    }

}

class SBI extends rbi{
    private static double rate;
    private static double min_balence;

    static double show_bankMB(){
        return min_balence;
    }

    static double show_bank_rate(){
        return rate;
    }

    static void change_rate(double new_rate){
        double min_r=show_rate();
        if (new_rate>=min_r){
            rate=new_rate;
        }
        else{
            System.out.println("intrest rate of sbi could not be lover than minimun rate");
        }

    }

    static void changeMB(double newMB){
        double min_b=show_MB();
        if (newMB>=min_b){
            min_balence=newMB;
        }
        else{
            System.out.println("intrest rate of sbi could not be lover than minimun rate");
        }

    }

}

class SBI_account extends SBI{
    String acc_no;
    double balance;
    String user_name;

    void do_transactions(int x){
        balance=balance+x;
        if (balance<show_bankMB()){
            System.out.println("not enough balance");
            balance=balance+x;
        }

    }

    void increament(){
        balance=balance+show_bank_rate()*balance/100;
    }
    SBI_account( String acc_no,double balance,String user_name){
        this.acc_no=acc_no;
        this.balance=balance;
        this.user_name=user_name;
    }
}




package com.example;

public class Main05 {
    public static void main(String[] args) {
        VIPUser vipUser = new VIPUser("Kretaczek", "Naszynski", "testowy@gmail.com", 1003);
        System.out.println(vipUser.getVipCardNumber());
        vipUser.setVipCardNumber(900);
        System.out.println(vipUser.getVipCardNumber());
        vipUser.setVipCardNumber(2000);
        System.out.println(vipUser.getVipCardNumber());
    }
}

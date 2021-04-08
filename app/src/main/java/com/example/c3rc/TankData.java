package com.example.c3rc;

import java.util.ArrayList;

public class TankData {
    private static String[] namaTank = new String[]{"Panzer IV Ausf S", "Tiger I", "M4 Sherman", "Churchill Mk VII", "IS-2", "Pershing", "KV-2"
    };
    private static int[] gambarTank = new int[]{R.drawable.ausfd, R.drawable.tiger, R.drawable.m4sherman, R.drawable.churchillmkvii, R.drawable.is2, R.drawable.pershing, R.drawable.kv2};

    public static ArrayList<TankModel> getListData(){
        TankModel tankModel = null;
        ArrayList<TankModel> list = new ArrayList<>();
        for (int i = 0; i < namaTank.length; i++ ){
            tankModel = new TankModel();
            tankModel.setGambar(gambarTank[i]);
            tankModel.setNama(namaTank[i]);
            list.add(tankModel);
        }
        return list;
    }

}

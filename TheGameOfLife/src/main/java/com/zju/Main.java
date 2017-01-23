package com.zju;

import com.zju.meta.CellularArray;
import com.zju.service.TheGameOfLifeService;

public class Main {

    public static void print(CellularArray cellularArray) {
        if (null == cellularArray) {
            System.out.println("null");
            return;
        }
        for (int i = 0; i < cellularArray.getRow(); ++i) {
            for (int j = 0; j < cellularArray.getCol(); ++j) {
                System.out.print(cellularArray.getCell(i, j) + " ");
            }
            System.out.println();
        }
        System.out.println("print end");
    }

    public static void main(String[] args) {
        TheGameOfLifeService service = new TheGameOfLifeService();
        CellularArray cellularArray = new CellularArray(15, 20);
        cellularArray = service.randInit(cellularArray);
        print(cellularArray);
        System.out.println("------");
        cellularArray = service.generate(cellularArray);
        print(cellularArray);
    }
}
/**
 * 难点:
 * 如何把数组传给后端 --json
 * spring mvc @request 接收json  --配置
 * js回调有时间差,导致参数null --修改写回调函数里面
 */
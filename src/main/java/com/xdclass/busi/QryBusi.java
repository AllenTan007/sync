package com.xdclass.busi;

import java.util.List;

public interface QryBusi {

    /**
     *  查询数据
     * @param count 一次查询的数量
     * @return
     */
    List queryList(int count);


    /**
     * 修改数据状态
     * @param data 待修改数据
     * @param status 要修稿
     * @return
     */
    int modifyListStatus(List data,String status);
}

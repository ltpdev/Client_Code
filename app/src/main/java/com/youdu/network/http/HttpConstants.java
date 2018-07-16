package com.youdu.network.http;

/**
 * @author: qndroid
 * @function: 所有请求相关地址
 * @date: 16/8/12
 */
public class HttpConstants {

    private static final String ROOT_URL = "http://www.wanandroid.com/tools/mockapi/5693";

    /**
     * 请求本地产品列表
     */
    public static String PRODUCT_LIST = ROOT_URL + "/search";

    /**
     * 本地产品列表更新时间措请求
     */
    public static String PRODUCT_LATESAT_UPDATE = ROOT_URL + "/fund/upsearch.php";

    /**
     * 登陆接口
     */
    public static String LOGIN = ROOT_URL + "/user/login_phone.php";

    /**
     * 检查更新接口
     */
    public static String CHECK_UPDATE = ROOT_URL + "/check_update";

    /**
     * 首页产品请求接口
     */
    public static String HOME_RECOMMAND = ROOT_URL + "/home";

    /**
     * 课程详情接口
     */
    public static String COURSE_DETAIL = ROOT_URL + "/course_detail.php";

}



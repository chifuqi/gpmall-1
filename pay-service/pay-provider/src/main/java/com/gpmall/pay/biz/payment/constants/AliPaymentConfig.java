package com.gpmall.pay.biz.payment.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
@Service
public class AliPaymentConfig {
    @Value("${ali.ali_service}")
    private String ali_service;

    @Value("${ali.ali_partner}")
    private String ali_partner;

    @Value("${ali.input_charset}")
    private String input_charset;

    @Value("${ali.sign_type}")
    private String sign_type;

    @Value("${ali.notify_url}")
    private String notify_url;

    @Value("${ali.return_url}")
    private String return_url;

    @Value("${ali.seller_id}")
    private String seller_id;

    @Value("${ali.seller_email}")
    private String seller_email;

    @Value("${ali.pay_gateway_new}")
    private String pay_gateway_new;

    @Value("${ali.it_b_pay}")
    private String it_b_pay;

    @Value("${ali.private_key}")
    private String private_key;// 商户的私钥

    @Value("${ali.public_key}")
    private String public_key;// 支付宝的公钥

    @Value("${ali.pay_open_gateway}")
    private String pay_open_gateway;

    public String getAli_service() {
        return ali_service;
    }

    public String getAli_partner() {
        return ali_partner;
    }

    public String getInput_charset() {
        return input_charset;
    }

    public String getSign_type() {
        return sign_type;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public String getReturn_url() {
        return return_url;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public String getSeller_email() {
        return seller_email;
    }

    public String getPay_gateway_new() {
        return pay_gateway_new;
    }

    public String getIt_b_pay() {
        return it_b_pay;
    }

    public String getPrivate_key() {
        return private_key;
    }

    public String getPublic_key() {
        return public_key;
    }

    public String getPay_open_gateway() {
        return pay_open_gateway;
    }
}

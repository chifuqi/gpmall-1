package com.gupaoedu.pay;

import com.gupaoedu.pay.dto.PaymentNotifyRequest;
import com.gupaoedu.pay.dto.PaymentNotifyResponse;
import com.gupaoedu.pay.dto.PaymentRequest;
import com.gupaoedu.pay.dto.PaymentResponse;

/**
 * 腾讯课堂搜索【咕泡学院】
 * 官网：www.gupaoedu.com
 * 风骚的Mic 老师
 * create-date: 2019/7/30-13:46
 * 支付操作相关的服务
 */
public interface PayCoreService {


    /**
     * 执行支付操作
     * @param request
     * @return
     */
    PaymentResponse execPay(PaymentRequest request);


    /**
     * 支付结果通知处理(等待微信或者支付宝异步通知支付结果）
     * @param request
     * @return
     */
    PaymentNotifyResponse paymentResultNotify(PaymentNotifyRequest request);
}

package com.util;

import org.archive.modules.CrawlURI;
import org.archive.modules.deciderules.DecideResult;
import org.archive.modules.deciderules.DecideRule;

/**
 * Created by stone on 2016/10/13.
 */
public class FilterRule extends DecideRule{
    private static final long serialVersionUID = 1L;

    @Override
    protected DecideResult innerDecide(CrawlURI uri){
        String u = uri.getURI();
//        数据堂的数据信息
//        if(u.matches("(http://www.datatang.com/data/list/r020-p\\d+)")||u.matches("(http://www.datatang.com/data/\\d+)"))
//            return DecideResult.ACCEPT;
//        http://apistore.baidu.com/astore/classificationservicelist.html?isFree=1
//        百度API的免费API信息
        if(u.matches("(http://apistore.baidu.com/apiworks/servicedetail/(\\d+)\\.html)")||u.matches("(http://apistore.baidu.com/astore/classificationservicelist\\.html\\?isFree=1.*)")||u.matches("(http://apistore.baidu.com/astore/serviceinfo/(\\d+)\\.html)"))
            return DecideResult.ACCEPT;
        return DecideResult.REJECT;
    }
//    public static void main(String[] args)
//    {
//        String s = "http://apistore.baidu.com/apiworks/servicedetail/633.html";
//        if(s.matches("(http://apistore.baidu.com/apiworks/servicedetail/(\\d+)\\.html)")||s.matches("(http://apistore.baidu.com/astore/classificationservicelist\\.html\\?isFree=1.*)"))
//            System.out.println("success");
//        else
//            System.out.println("loser");
//    }
}

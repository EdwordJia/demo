//package com.interview.demo.plugin;
//
//import com.baomidou.mybatisplus.core.injector.AbstractMethod;
//import com.baomidou.mybatisplus.core.injector.AbstractSqlInjector;
//import com.baomidou.mybatisplus.core.injector.methods.*;
//
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class DefaultExtSqlInjector extends AbstractSqlInjector {
//
//    @Override
//    public List<AbstractMethod> getMethodList() {
//        return Stream.of(
//                new Insert(),
//                new Delete(),
//                new DeleteByMap(),
//                new DeleteById(),
//                new DeleteBatchByIds(),
//                new Update(),
//                new UpdateById(),
//                new SelectById(),
//                new SelectBatchByIds(),
//                new SelectByMap(),
//                new SelectOne(),
//                new SelectCount(),
//                new SelectMaps(),
//                new SelectMapsPage(),
//                new SelectObjs(),
//                new SelectList(),
//                new SelectPage()
//        ).collect(Collectors.toList());
//    }
//}

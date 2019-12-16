package com.zhaolearn;

import com.carrotsearch.sizeof.RamUsageEstimator;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class BloomFilterDemo {
    public static void main(String[] args) throws Exception {
        //创建一个插入对象为一亿，误报率为0.01%的布隆过滤器
        BloomFilter<CharSequence> bloomFilter = BloomFilter.create(Funnels.stringFunnel(StandardCharsets.UTF_8), 100000000, 0.0001);
        bloomFilter.put("121");
        bloomFilter.put("122");
        bloomFilter.put("123");
        bloomFilter.put("124");
        bloomFilter.put("125");
        bloomFilter.put("126");
        //用于对比bloomFilter的占用内存大小（与布隆过滤器使用无关）
        HashSet<String> testHashSet = new HashSet<String>(100000000);
        testHashSet.add("121");
        testHashSet.add("122");
        testHashSet.add("123");
        testHashSet.add("124");
        testHashSet.add("125");
        testHashSet.add("126");
        System.out.println("bloomFilter---------" + bloomFilter.mightContain("121") + "---------"
                + RamUsageEstimator.sizeOfAll(bloomFilter)/RamUsageEstimator.ONE_MB+"MB");
        System.out.println("testHashSet---------" + testHashSet.contains("121")  + "---------"
                + RamUsageEstimator.sizeOfAll(testHashSet)/RamUsageEstimator.ONE_MB+"MB");
    }
}

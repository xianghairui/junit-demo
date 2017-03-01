package com.xiang.demo.junit.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * 
 * <p>ClassName:AllCalculatorTests</p>
 * <p>Description: 打包测试</p>
 * <p>这个功能也需要使用一个特殊的Runner，因此我们需要向
 * @RunWith 标注传递一个参数Suite.class。
 * @Suite.SuiteClasses
 * 来表明这个类是一个打包测试类。我们把需要
 * 打包的类作为参数传递给该标注就可以了。有了这两个标注之后，就已经完整
 * 的表达了所有的含义，因此下面的类已经无关紧要，随便起一个类名，
 * 内容全部为空既可。</p>
 * 
 * @author hairui
 * @date 2017年2月21日 上午11:36:31
 */
@RunWith(Suite.class)
@SuiteClasses({CalculatorTest.class, SquareTest.class})
public class AllCalculatorTests {
	
}

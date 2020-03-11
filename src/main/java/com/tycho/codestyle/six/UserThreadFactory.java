package com.tycho.codestyle.six;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/**
 * 六-2【强制】创建线程或线程池时请指定有意义的线程名称，方便出错时回溯。
正例：自定义线程工厂，并且根据外部特征进行分组，比如机房信息。
 *
 */
public class UserThreadFactory implements ThreadFactory {
	private final String namePrefix;
	private final AtomicInteger nextId = new AtomicInteger(1);

	// 定义线程组名称，在 jstack 问题排查时，非常有帮助
	UserThreadFactory(String whatFeaturOfGroup) {
		namePrefix = "From UserThreadFactory's " + whatFeaturOfGroup + "-Worker-";
	}

	@Override
	public Thread newThread(Runnable task) {
		String name = namePrefix + nextId.getAndIncrement();
		Thread thread = new Thread(null, task, name);
		System.out.println(thread.getName());
		return thread;
	}
}
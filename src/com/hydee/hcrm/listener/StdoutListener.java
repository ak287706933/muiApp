package com.hydee.hcrm.listener;

import java.io.PrintStream;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.apache.commons.logging.impl.LogFactoryImpl;

/**
 * 把在程序中的System.out.print()的信息自动转成日志信息
 */
public class StdoutListener implements ServletContextListener {
	public void contextDestroyed(ServletContextEvent event) {
	}

	private void log(Object info) {
		LogFactoryImpl.getLog(getClass()).warn(info);
	}

	public void contextInitialized(ServletContextEvent event) {
		PrintStream printStream = new PrintStream(System.out) {
			public void println(boolean x) {
				log(Boolean.valueOf(x));
			}

			public void println(char x) {
				log(Character.valueOf(x));
			}

			public void println(char[] x) {
				log(x == null ? null : new String(x));
			}

			public void println(double x) {
				log(Double.valueOf(x));
			}

			public void println(float x) {
				log(Float.valueOf(x));
			}

			public void println(int x) {
				log(Integer.valueOf(x));
			}

			public void println(long x) {
				log(x);
			}

			public void println(Object x) {
				log(x);
			}

			public void println(String x) {
				log(x);
			}
		};
		System.setOut(printStream);
		System.setErr(printStream);
	}
}
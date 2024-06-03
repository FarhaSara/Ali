package javaPrograms;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Queue;

import io.netty.util.internal.PriorityQueue;

public class Test1  {
	 

	public static void main(String args[]) {
		
		Date date=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("dd/mm/yyyy");
		String d = formatter.format(date);
		String[] d1 = d.split("/");
		System.out.println(d1[0]);
	

}
}
